package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Festival;



public class GestorFestival {
	static Scanner sc;
	static Festival [] gestor;
	
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		sc.close();
		
		mostrarArray();
		
		analizarArray();

	}

	private static void analizarArray() {
		
		int sumaFestival=0;
		
		for (int i = 0; i < gestor.length; i++) {
			
			if(gestor[i].getMes()>6 && gestor[i].getMes()<9) {
					sumaFestival++;
			}
			
		}
		
			
			if(sumaFestival==0) { //con solo poner el syso del else me valdría, pero creamos el if por si es que salga más perfecto
			System.out.println("No hay festivales en los meses de Julio y Agosto.");
			}else {
				System.out.println("Los festivales que hay en los meses de Julio y Agosto son: "+sumaFestival+".");
			}
		
	}
	

	private static void mostrarArray() {
		
		for (int i = 0; i < gestor.length; i++) {
			//System.out.println("/n Festivales registrado:");// para que salga mas bonito
			System.out.println(gestor[i].toString());
		}
		
	}

	private static void rellenarArray() {
		String nombre;
		String ciudad;
		String cartel;
		int mes = 0;
		
		for (int i = 0; i < gestor.length; i++) {
			System.out.println("Introduzca el nombre del festival");
			nombre= sc.nextLine();
			System.out.println("Introduzca la ciudad");
			ciudad= sc.nextLine();
			cartel=solicitarCartel();
			mes=solicitarMes();
			
			gestor[i]= new Festival(nombre, ciudad, cartel, mes);
					
			}
	}

	private static int solicitarMes() {
		boolean valorNoVal = true;
		int mes = 0;
		
		while(valorNoVal) {
			try {
				System.out.println("Introduzca el mes en el que se celebra el festival");
				mes= Integer.parseInt(sc.nextLine());
				
				if(mes>0 && mes<13) {
					valorNoVal = false;
				} else {
					throw new Exception("El número de meses tiene que estar dentro del 1 al 12");
				}
				
				
				}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un número y no una letra");
				}catch (Exception e) { 
					System.out.println(e.getMessage());
				}
		
		}
		
		return mes;
	}

	private static String solicitarCartel() {
		boolean valorNoval = true;
		String cartel="";
		
		while(valorNoval) {
			try {
				System.out.println("Introduzca el cartel del festival");
				cartel= sc.nextLine();
				
				if(cartel.replaceAll("\\s+","").length()>29) {
					valorNoval = false;
				} else {
					throw new Exception("El cartel tiene que tener al menos 30 caracteres");
				}
				
				
				}catch (Exception e) { 
					System.out.println(e.getMessage());
				}
		
		}
		return cartel;
	}

	private static void inicializarArray() {
		
		boolean valorNoVal = true;
		
		while(valorNoVal) {
			try {
				System.out.println("Introduzca el número de festivales");
				int n= Integer.parseInt(sc.nextLine());
				if(n>0) {
					valorNoVal = false;
					
					gestor= new Festival[n];
					
				}else {
					throw new Exception("El valor debe ser un entero mayor que 0.");
				}
				
				
			}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un número y no una letra");
				 
			}catch (Exception e) {
					System.out.println(e.getMessage());
			
			}
		
	  }
		
	}

}
