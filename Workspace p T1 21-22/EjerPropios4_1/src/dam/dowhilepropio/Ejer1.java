package dam.dowhilepropio;

import java.util.Random;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int num = Integer.parseInt(teclado.nextLine());
		
		int alea;
		
		do {
			alea = generarAleatorio(num);
			System.out.println(+alea);
		} while (alea%2 != 0); // si saca uno diferente a par que vuelva a do, hasta que saque par
			System.out.println("El numero "+alea+" es par");
		
		teclado.close();
			
		}
		

	

	private static int generarAleatorio(int num) {
		Random rd = new Random();
		int alea = rd.nextInt(num);
		return alea;
	}


}


	
	
	

	
		
	

