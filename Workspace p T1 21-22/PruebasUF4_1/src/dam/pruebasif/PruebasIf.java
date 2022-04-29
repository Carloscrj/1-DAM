package dam.pruebasif;

import java.util.Scanner;

public class PruebasIf {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		int num = Integer.parseInt(teclado.nextLine());
		//OPCION SIMPLE
		if (num%7==0) {
			System.out.println(" El numero es multiplo de 7");
		}
		
		//OPCION SI Y SI NO
		if (num%2==0) {
			System.out.println("El numero es PAR");
		} else {
			System.out.println("El número es IMPAR");
		}
		
		//OPCIÓN ANALIZAMOS MAS DE UNA POSIBILIDAD
		if (num%6==0) {
			System.out.println("El número es multiplo de 6");
		} else if (num%3==0) {
			System.out.println("El número es multiplo de 3");
		} else {
			System.out.println("El número no es multiplo ni de 6 ni de 3");
		}
		
		
		
		System.out.println("Fin del programa");
		teclado.close();
		
	}

}
