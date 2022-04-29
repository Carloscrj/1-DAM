import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Tetris {
	static HashMap<String, Integer> partidaTetris;
	static TreeMap<String, Integer > valoresOrdenados;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		 
		partidaTetris = new HashMap<String,Integer>();
		
		valoresOrdenados = new TreeMap<String,Integer>();
		
		 elegir();
		 
		 sc.close();

	}

	private static void elegir() {
		boolean continuar=true;
		int opcion;
		
		while (continuar) {
			
			opcion=darOpciones();
			
			if(opcion==0) {
				continuar=false;;
			}else if(opcion==1) {
				registrarNuevoResultado();
			}else if(opcion==2) {
				mostrarPuntuaciones();
			}
				
		}
		
	}

	private static void mostrarPuntuaciones() {
		valoresOrdenados.putAll(partidaTetris);
		
		System.out.println("Listado de puntuaciones");
		
		if(valoresOrdenados.isEmpty()){ 
			System.out.println("La lista de puntuaciones está vacia.");
		} else {
			for (String nick: valoresOrdenados.keySet()) {
				System.out.println(nick+":"+ valoresOrdenados.get(nick));
			}
		}	
		
		
		
	}

	private static void registrarNuevoResultado() {
			
			int puntos=0;
			String nick="";
			
						
			nick=registrarNick();
			puntos=registrarPuntos();
						
			if(!partidaTetris.containsKey(nick)) {
				partidaTetris.put(nick,puntos);
				System.out.println("¡LA PUNTUACIÓN ESTÁ ALMACENADA!");
			}else if(partidaTetris.containsKey(nick) && partidaTetris.get(nick)<puntos ){
				partidaTetris.put(nick,puntos);
				System.out.println("¡NUEVO RECORD!");
			}else if(partidaTetris.containsKey(nick) && partidaTetris.get(nick)>puntos) {
				System.out.println("¡PUNTUACIÓN NO SUPERADA!");
			}
					
}
		
	


	private static int registrarPuntos() {
		
		boolean valorNoval = true;
		int puntos= 0;
		
		while(valorNoval) {
				
				System.out.println("Introduzca nueva puntuación.");
				puntos= Integer.parseInt(sc.nextLine());
				
				if(puntos>-1){ 
					valorNoval=false;
				} else {
					System.out.println("Introduzca un número mayor que -1.");
				}
				
		}
		return puntos;
	}

	private static String registrarNick() {
		boolean valorNoval = true;
		String nick="";
		
		while(valorNoval) {
				System.out.println("Introduzca el nick");
				nick= sc.nextLine();
				
				if(nick.isEmpty()){ 
					System.out.println("Debe introducir el nombre.");
				} else {
					valorNoval=false;
				}	
			}	
	
		return nick;
	}

	private static int darOpciones() {
		int opcion=0;
		boolean continuar=true;
		
		while(continuar) { 
			try {
				System.out.println("Que acción desea realizar"+"\n Pulse 0 para salir del programa."+
						"\n Pulse 1 para registrar nuevo resultado"+"\n Pulse 2 para mostrar las puntuaciones");
				
				opcion= Integer.parseInt(sc.nextLine());
				
				if (opcion>-1 && opcion<3) {
					continuar= false;
					
				} else {
					System.out.println("Introduzca un número entero del 0 al 3");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Introduzca un número y no una letra");
			}
		}
		
		return opcion;
		
	}
	
	

}
