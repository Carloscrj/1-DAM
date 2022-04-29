package exa1final.main;

import java.util.Scanner;

import exa1final.pojo.Encuesta;

public class Encuestador {
	static Scanner teclado;
	static Encuesta [] encuestador;
	public static void main(String[] args) {
		
		teclado= new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		mostrarArray();
		
		analizarArray();
		
	}

	private static void analizarArray() {
		int contCovid=0;
		int contSintomas=0;
		Encuesta encuestaMayorLeve = new Encuesta(-1, "NO", "", 6);
		
		for (int i = 0; i < encuestador.length; i++) {
			
			if(encuestador[i].getPasado().equals("si")) {
				contCovid++;
			}
			
			if(encuestador[i].getGravedad()>=3) {
				contSintomas++;
			}
			
			if (i == 0 || encuestador[i].getEdad() > encuestaMayorLeve.getEdad() 
					|| (encuestador[i].getEdad() == encuestaMayorLeve.getEdad()
					&& encuestador[i].getGravedad() < encuestaMayorLeve.getGravedad())) {
				encuestaMayorLeve = encuestador[i];
			}
			
		}
		
		System.out.println("Las personas con covid son: "+contCovid+" y las personas con sintomas mayores o igual de nivel 3 son: "+contSintomas);
		System.out.println("El encuestado con mayor edad y menor gravedad es :"+encuestaMayorLeve);
	}

	private static void mostrarArray() {
		for (int i = 0; i < encuestador.length; i++) {
			System.out.println(encuestador[i].toString());
		}
		
	}

	private static void rellenarArray() {
		for (int i = 0; i < encuestador.length; i++) {
			System.out.println("¿que edad tiene?");
			int edad= Integer.parseInt(teclado.nextLine());
			System.out.println("¿ha pasado el covid?(si/no)");
			String pasado= teclado.nextLine();
			if(pasado.equals("si")) {
				System.out.println("Indicar los sintomas:fiebre,tos,mocos,dolor(separados por coma)");
				String sintomas=teclado.nextLine();
				System.out.println("Introduzca el nivel de gravedad: el 1: Ninguna, el 2: Leve, el 3: Media, el 4: Alta y el 5: Hospitalización. ");
				int gravedad= Integer.parseInt(teclado.nextLine());
				
				encuestador[i]= new Encuesta(edad, pasado, sintomas, gravedad);
				
			}else {
				System.out.println("El paciente no ha pasado el covid");
			}
			
			
		}
	}

	private static void inicializarArray() {
		System.out.println("Introduzca cuantas encuestas va a rellenar");
		int n= Integer.parseInt(teclado.nextLine());
		
		encuestador = new Encuesta [n];
	}

}
