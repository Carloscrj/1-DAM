package dam.whilepropio;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("�Cuanto n�mero enteros va a introducir?");
		int cantnum = Integer.parseInt(teclado.nextLine());
		
		int contposit=0;
		int contneg=0;
		int contcer=0;
		int cont=0;
		
		while(cantnum>cont) {
			System.out.println("Introduzca un n�mero entero");
			int num = Integer.parseInt(teclado.nextLine());
			if (num>0) {
				contposit++;
			}else if (num<0) {
				contneg++;
			}else {
				contcer++;
			}
			cont++;
		}
		
		System.out.println("La cantidad de n�meros positivos es "+contposit);
		System.out.println("La cantidad de n�meros negativos es "+contneg);
		System.out.println("La cantidad de n�meros ceros es "+contcer);
		
		teclado.close();
	}

}
