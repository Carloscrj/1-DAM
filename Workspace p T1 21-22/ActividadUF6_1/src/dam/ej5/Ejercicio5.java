package dam.ej5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		String cadena = teclado.nextLine();
		
		String cadenaSE = cadena.replaceAll("\\s+","");
		System.out.println("La frase sin espacios es: "+cadenaSE);

		teclado.close();
	}

}
