package dam.ej6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca una frase:");
		String cadena = teclado.nextLine();
		
		String cadenaSinE = cadena.replaceAll(" ", "");
		System.out.println("La frase sin espacios es: "+cadenaSinE);
		
		teclado.close();
		
	}
}
