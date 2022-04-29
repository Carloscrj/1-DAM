package examen11;

import java.util.Scanner;

public class Ejercicios3_2 {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		
		System.out.println("El valos de a es "+a+", el valor de b es "+b+", la suma de los dos es "+(a+b));
		
		
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Escriba un nombre");
		String nombre=teclado.nextLine();
		
		System.out.println("Buenos dias "+nombre);
		
		
		System.out.println("Escriba un número entero");
		int num=Integer.parseInt(teclado.nextLine());
		
		int doble= num*2;
		int triple= num*3;
		
		System.out.println("El doble de ese número es "+doble+" y el triple de ese número es "+triple);
		
		teclado.close();
		
		
		
		
		
	}

}
