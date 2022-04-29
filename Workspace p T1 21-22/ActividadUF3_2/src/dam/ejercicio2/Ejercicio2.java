package dam.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = teclado.nextLine();
		
		System.out.println("Buenos dias "+nombre);
		teclado.close();
		
		
	}

}
