package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos números enteros va a introducir?");
		int nnum = Integer.parseInt(teclado.nextLine());
		
		int divisores=0;
		int multiplos=0;
		int num;
		for (int cont = 1; cont <= nnum; cont++) {
			System.out.println("Introduce un número");
			num = Integer.parseInt(teclado.nextLine());
			
			if (num%7==0) {
				multiplos++;
			} else if (150%num==0) {
				divisores++;
			} 
			
			
		}
		System.out.println("La cantidad de multiplos de 7 es "+multiplos+" y la cantidad de divisores de 150 es "+divisores);
		teclado.close();
		

	}

}
