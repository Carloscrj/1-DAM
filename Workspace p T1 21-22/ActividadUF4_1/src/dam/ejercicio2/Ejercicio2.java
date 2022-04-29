package dam.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		
		System.out.println("Introduce 5 enteros separados por espacio");//Otra forma de pedir los números,pero en la misma linea.
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		num4 = teclado.nextInt();
		num5 = teclado.nextInt();
		
		
		System.out.println("Introduzca el primer numero");
		num1 = teclado.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = teclado.nextInt();
		System.out.println("Introduzca el tercer numero");
		num3 = teclado.nextInt();
		System.out.println("Introduzca el cuarto numero");
		num4 = teclado.nextInt();
		System.out.println("Introduzca el quinto numero");
		num5 = teclado.nextInt();
		
		
		if (num1> num2 && num1>num3 && num1>num4 && num1>num5) {
			System.out.println("El número mayor es "+num1);
		} else if (num2>num1 && num2>num3 && num2>num4 && num2>num5) {
			System.out.println("El número mayor es "+num2);
		} else if (num3>num1 && num3>num2 && num3>num4 && num3>num5) {
			System.out.println("El número mayor es "+num3);
		} else if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
			System.out.println("El número mayor es "+num4);
		} else {
			System.out.println("El número mayor es "+num5);
		}
		teclado.close();
	}

}
