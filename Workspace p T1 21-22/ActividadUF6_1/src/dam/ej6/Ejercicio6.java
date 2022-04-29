package dam.ej6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca una palabra");
		String cadena= teclado.nextLine();
		
		int cont=0;
		
		while(cont<cadena.length()) {
			cadena.substring(cont,cont+1);
			System.out.println(cadena.substring(cont,cont+1));
			cont++;
		}
		
		teclado.close();
  }

}
   