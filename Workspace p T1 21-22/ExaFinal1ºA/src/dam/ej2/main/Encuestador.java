package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Covid;

public class Encuestador {

	static Scanner teclado;
	static Covid [] encuestas;
	public static void main(String[] args) {
		
		teclado= new Scanner(System.in);
		
	inicializarArray();
	
	rellenarArray();
	
	mostrarArray();
	
	analizarArray();

	}

	private static void analizarArray() {
		int contCovid=0;
		int contSint=0;
		for (int i = 0; i < encuestas.length; i++) {
			if (encuestas[i].getPasado().equals("SI")) {
				contCovid++;
			}
			
			if(encuestas[i].getNivelGravedad()>3 || encuestas[i].numSintomas()>=3) {
				contSint++;
			}
		}
		System.out.println("El número de personas que han pasado el covid son: "+contCovid);
		System.out.println("Número personas con sintos moderados o graves: "+contSint);
	}

	private static void mostrarArray() {
		for (int i = 0; i < encuestas.length; i++) {
			System.out.println(encuestas[i].toString());
		}
		
	}

	private static void rellenarArray() {
		int edad;
		String pasado;
		String sintomas;
		int gravedad;
		for (int i = 0; i < encuestas.length; i++) {
			
			System.out.println("¿Cual es su edad");
			edad = Integer.parseInt(teclado.nextLine());
			System.out.println("¿Ha pasado el covid?");
			pasado = teclado.nextLine().toUpperCase();
				if(pasado.equals("SI")) {
					System.out.println("¿que sintomas padecio?(indiquelos separados por comas)");
					sintomas = teclado.nextLine();
					System.out.println("Indique nivel de gravedad seran el 1: Ninguna, el 2: Leve, el 3: Media, el 4: Alta y el 5: Hospitalización.");
					gravedad= Integer.parseInt(teclado.nextLine());
			
					encuestas[i] = new Covid(edad, pasado, sintomas, gravedad);
			
				}else {
					sintomas="no ha tenido";
					gravedad=1;
				}
		}
	}

	private static void inicializarArray() {
		System.out.println("Introduzca cuantas encuestas quiere realizar");
		int n= Integer.parseInt(teclado.nextLine());
		encuestas= new Covid [n];
		
	}

}
