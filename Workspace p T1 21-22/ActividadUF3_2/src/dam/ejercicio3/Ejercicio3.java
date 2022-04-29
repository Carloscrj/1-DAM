package dam.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Escriba un número entero");
		int num = Integer.parseInt(teclado.nextLine());
		
		System.out.println("El doble de "+num+" es "+(num*2)+" y el triple de "+num+" es "+(num*3));
		
		teclado.close();
		
		
	}
}
