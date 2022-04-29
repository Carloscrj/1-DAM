package dam.ej1_2_3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena = teclado.nextLine();
		
		StringBuilder sb = new StringBuilder(cadena);
		String cadenaInv = sb.reverse().toString();
		
		System.out.println("La palabra o frase al reves es: "+cadenaInv);
		
		teclado.close();

	}

}
