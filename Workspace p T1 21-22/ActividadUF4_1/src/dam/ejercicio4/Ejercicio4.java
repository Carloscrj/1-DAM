package dam.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un año");
		int num  = Integer.parseInt(teclado.nextLine());
		
	
		
		if (4%num==0 && 100%num!=0) {
			System.out.println("El año es bisiesto.");
		}else if (100%num==0 && 400%num==0) {
			System.out.println("El año es bisiesto.");
		}else {
			System.out.println("El año no es bisiesto.");
		}

		teclado.close();
		
	}


}
