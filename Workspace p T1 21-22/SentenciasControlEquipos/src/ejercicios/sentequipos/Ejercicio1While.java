package ejercicios.sentequipos;

import java.util.Scanner;

public class Ejercicio1While {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		int num = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce otro número entero mayor que el anterior");
		int numay = Integer.parseInt(teclado.nextLine());
		
		while (num<=numay) {
			if (num % 3 ==0) {
				System.out.println("El número "+num+" es multiplo de 3");
			
		}
			num++;
			teclado.close();
	}
  }
}
	
