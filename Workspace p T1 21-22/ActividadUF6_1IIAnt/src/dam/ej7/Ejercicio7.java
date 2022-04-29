package dam.ej7;

import java.util.Scanner;

public class Ejercicio7 {
	
	static String cadena = "";

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String espacio = "";
		
		boolean igual;
		
		
		do {
			
			System.out.println("Introduzca una frase");
			String cadena = teclado.nextLine();
			System.out.println("La introducción de frases no acabara,hasta que no inserte una frase vacía.");
			int cantCarac = cadena.length();
			System.out.println("La longitud de la frase es: "+cantCarac);
			String fraseMay = cadena.toUpperCase();
			System.out.println("La frase en mayúsculas es: "+fraseMay);
			
			igual = (cadena==espacio);
			
		} while (igual==false);
		
		if(cadena.equals(espacio)) {
			System.out.println("Ha introducido una cadena vacia, enhorabuena el juego ha terminado");
		}
		teclado.close();
		
	}
		
		
		
	
		
	}


