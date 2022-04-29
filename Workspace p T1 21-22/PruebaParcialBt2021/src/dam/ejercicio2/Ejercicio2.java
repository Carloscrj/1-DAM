package dam.ejercicio2;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero positivo");
		int num1= Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca otro número entero positivo");
		int num2= Integer.parseInt(sc.nextLine());
		
		
		
		int x;
		
		for (int cont=1; cont<=10; cont++) {
			x=generarAleat(num1, num2);
			if (x%2==0) {
				System.out.println("El número "+x+" es par");
			}else {
				System.out.println("El número "+x+" es impar");
			}
			
		}
			
		
		sc.close();
		
	
	}

	private static int generarAleat(int num1, int num2) {
		Random rd = new Random();
		int x = rd.nextInt(num2+1-num1)+num1;
		return x;
	}

	
	}

  

