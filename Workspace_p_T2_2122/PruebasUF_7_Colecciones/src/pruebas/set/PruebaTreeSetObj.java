package pruebas.set;

import java.util.TreeSet;
import java.util.Scanner;

import pruebas.model.PersonaTs;

public class PruebaTreeSetObj {
	static TreeSet<PersonaTs> setPersonas;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		
		setPersonas= new TreeSet<PersonaTs>();
		
		mostrarSet();
		
		rellenarSet();
		
		mostrarSet();
		
		sc.close();
		
	}

	private static void rellenarSet() {
	
		String nombre;
		int edad;
		PersonaTs persona;
		boolean continuar=true;
		
		while(continuar) {  //aquí utuliza este metodo para parar(no para que siga como en los arrays).
			
			
				nombre= solicitarNombre();
				edad=solicitarEdad();
				
				persona = new PersonaTs(nombre, edad);
				
				if(!setPersonas.contains(persona)){
					setPersonas.add(persona);
				}else {
					System.out.println("Esta persona esta en la colección");
				}
				
				
				continuar= preguntarContinuar();
		}
		
		
		
	}
	

	private static boolean preguntarContinuar() {
		boolean continuar= true;
		
		System.out.println("¿Desea introducir más datos?(SI/NO)");
		continuar= sc.nextLine().trim().equalsIgnoreCase("SI");
		
		return continuar;
	}
	

	private static int solicitarEdad() {
		
		boolean valorNoval = true;
		int edad= 0;
		
		while(valorNoval) {
				
			try {
				
				System.out.println("Introduzca la edad de la persona");
				edad= Integer.parseInt(sc.nextLine());
				
				if(edad>0 || edad<130){ // es lo mismo que if(nom.lenght()==0)
					valorNoval=false;
				} else {
					throw new Exception("Introduzca valores entre 0 y 130 ambos incluidos");
				}
				
				}
				
				catch (NumberFormatException e) {
				System.out.println("El valor introducido debe ser un número y no una letra");
				
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
		
		}
		return edad;

		
	}
	

	private static String solicitarNombre() {
		
		boolean valorNoval = true;
		String nom="";
		
		while(valorNoval) {
			
				System.out.println("Introduzca el nombre de la persona");
				nom= sc.nextLine();
				
				if(nom.isEmpty()){ // es lo mismo que if(nom.lenght()==0)
					System.out.println("Debe introducir un valor");
				} else {
					valorNoval=false;
				}
		
		}
		return nom;
	}

	
	private static void mostrarSet() {
		
		if(setPersonas.isEmpty()) {
			System.out.println("El conjunto está vacio.");
			}else {
			System.out.println("\n El conjunto tiene "+setPersonas.size()+" colores");
			
			System.out.println("\n Elementos del conjunto");
			
			for (PersonaTs persona : setPersonas) { //la primera parte es cada elemento, la segunda es la colección
			System.out.println(persona);
			}
			System.out.println();
		}
		
	}

}
