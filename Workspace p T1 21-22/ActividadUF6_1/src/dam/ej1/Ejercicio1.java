package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena= teclado.nextLine();
		
		int contMay=0;
		int contMin=0;
		
		String fraseMay = cadena.toUpperCase();
		System.out.println("Frase en mayúsculas: \n"+fraseMay);
		
		for(int i=0; i<cadena.length(); i++) {
		if(cadena.charAt(i) !=' ' && cadena.charAt(i) !='?' && cadena.charAt(i) !=',') {
			
			if (cadena.charAt(i)==fraseMay.charAt(i)) {
				contMay++;
			} else {
				contMin++;
			}
		}

	}
		System.out.println("El número de mayusculas es "+contMay+" y el de minusculas "+contMin);
		
		teclado.close();
	}
}
