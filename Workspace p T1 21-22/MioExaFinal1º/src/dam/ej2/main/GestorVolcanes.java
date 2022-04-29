package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Volcan;



public class GestorVolcanes {
		static Scanner teclado;
		static Volcan [] gestor;
		
	public static void main(String[] args) {
		
		teclado= new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		mostrarArray();
		
		analizarArray();
		
		teclado.close();

	}
	private static void mostrarArray() {
		for (int i = 0; i < gestor.length; i++) {
			System.out.println(gestor[i].toString());
			
		}
	}
	private static void analizarArray() {
		int contActi=0;
		int contConti=0;
		int contInact=0;
		int volcanMayor=0;
		String volcanViejo="";
		for (int i = 0; i < gestor.length; i++) {
			if(gestor[i].getEstado().equals("ACTIVO")) {
				contActi++;
			}
			
			if(gestor[i].getActividadContinuada()>50) {
				contConti++;
			}
			
			if(gestor[i].getEstado().equals("INACTIVO")&&gestor[i].getTiempoInactivo()>20) {
				
				contInact++;	
			}
			
			if(gestor[i].getInicio()>volcanMayor) {
				volcanMayor=gestor[i].getInicio();
			}
			
			if(gestor[i].getInicio()<volcanMayor){
				volcanViejo=gestor[i].getNombre();
			}
			
			
			
			
		}
		
		
		System.out.println("El numero de volcanes activos introducidos es: "+contActi);
		System.out.println("El numero de volcanes con mas de 50 años de actividad continua es: "+contConti);
		System.out.println("El numero de volcanes inactivos más de 20 años es: "+contInact);
		System.out.println("El volcán que entro en actividad primero es: "+volcanViejo);
		
		
		
	}
	
	
	private static void rellenarArray() {
		String nombre;
		String pais;
		String estado;
		int inicio;
		int fin = 0;
		for (int i = 0; i < gestor.length; i++) {
			System.out.println("Introduzca el nombre del volcán");
			nombre= teclado.nextLine();
			System.out.println("Introduzca el país del volcán");
			pais= teclado.nextLine();
			System.out.println("Introduzca estado del volcan(ACTIVO/INACTIVO)");
			estado= teclado.nextLine();
			if (estado.equals("INACTIVO")) {
				System.out.println("Escriba el año de inicio de actividad");
				inicio = Integer.parseInt(teclado.nextLine());
				System.out.println("Escriba el año de fin de actividad");
				fin=Integer.parseInt(teclado.nextLine());
				
			}else {
				
				System.out.println("Escriba el año de inicio de actividad");
				inicio=Integer.parseInt(teclado.nextLine());
				fin=0;
				
			}
			
			gestor[i]= new Volcan(nombre, pais, estado, inicio, fin);
					
			}
			
			
			
			
			
		}
	
	private static void inicializarArray() {
		System.out.println("Introduzca el número de volcanes");
		int n= Integer.parseInt(teclado.nextLine());
		
		gestor= new Volcan[n];
	}

}


	