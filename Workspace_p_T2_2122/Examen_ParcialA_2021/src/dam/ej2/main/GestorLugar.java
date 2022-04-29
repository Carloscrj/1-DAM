package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Lugar;

public class GestorLugar {
	static Scanner sc;
	static Lugar [] gestor;
	
	public static void main(String[] args) {
		 
		sc= new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		sc.close();
		
		mostrarArray();
		
		analizarArray();
		

	}

	

	private static void analizarArray() {
		int mayorPrioridad=0;
		String masPrioridad="";
		
		for (int i = 0; i < gestor.length; i++) {
			
			if(gestor[i].getPais().toUpperCase().equals("ESPAÑA")) {
				if(mayorPrioridad<gestor[i].getPrioridad()) {
				mayorPrioridad=gestor[i].getPrioridad();
				masPrioridad=gestor[i].getCiudad();
				}
			}
		}
		
		System.out.println("El lugar de España con mayor prioridad es "+masPrioridad);
		
	}



	private static void mostrarArray() {
		for (int i = 0; i < gestor.length; i++) {
			System.out.println(gestor[i].toString());
			
		}
	}

	private static void rellenarArray() {
		
		String ciudad;
		String pais;
		int prioridad=0;
		String motivo;
		
		for (int i = 0; i < gestor.length; i++) {
			System.out.println("Introduzca la ciudad");
			ciudad= sc.nextLine();
			System.out.println("Introduzca el país");
			pais= sc.nextLine();
			prioridad=solicitarPrioridad();
			motivo=solicitarMotivo();
			
			gestor[i]= new Lugar(ciudad, pais, prioridad, motivo);
					
			}
		
	}

	private static String solicitarMotivo() {
		boolean valorNoval = true;
		String motivo="";
		
		while(valorNoval) {
			try {
				System.out.println("Introduzca el motivo de la visita");
				motivo= sc.nextLine();
				
				if(motivo.replaceAll("\\s+","").length()<151) {
					valorNoval = false;
				} else {
					throw new Exception("ATENCIÓN introduzca un máximo de 150 caracteres");
				}
				
				
				}catch (Exception e) { 
					System.out.println(e.getMessage());
				}
		
		}
		return motivo;
	}

	private static int solicitarPrioridad() {
		boolean valorNoVal = true;
		int prioridad = 0;
		
		while(valorNoVal) {
			try {
				System.out.println("Introduzca el nivel de prioridad con un nivel del 1 al 10");
				prioridad= Integer.parseInt(sc.nextLine());
				
				if(prioridad>0 && prioridad<11) {
					valorNoVal = false;
				} else {
					System.out.println("Introduzca valores entre 1 y 10");
				}
				
				
				}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un número y no una letra");
				}
		
		}
		
		return prioridad;
	}
	

	private static void inicializarArray() {
		
		boolean valorNoVal = true;
		
		while(valorNoVal) {
			try {
				System.out.println("Introduzca el número de lugares");
				int n= Integer.parseInt(sc.nextLine());
				if(n>0) {
					valorNoVal = false;
					
					gestor= new Lugar[n];
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
