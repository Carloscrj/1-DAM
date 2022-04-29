package ejercicios.sentequipos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2DoWhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero");
		int num = Integer.parseInt(teclado.nextLine());
		
		int alea;
		
		do {
			alea = generarAleatorio(num);
			
			}while (alea % 7 != 0);
				
			System.out.println(alea);
			
			teclado.close();
  }

	private static int generarAleatorio(int num) {
		
		Random rd = new Random();
		int alea = rd.nextInt(num);
		return alea;
	}
}
		



