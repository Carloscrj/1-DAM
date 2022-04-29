package pruebas.model;

import java.util.Scanner;

public class PruebaCompareTo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("introduce una palabra");
		String palabra1 = sc.nextLine();
		
		System.out.println("introduce otra palabra");
		String palabra2 = sc.nextLine();
		
		int res = palabra1.compareTo(palabra2);
		
		System.out.println("\n Resultado de comparar palabra1 con palabra2: "+res);
		
		System.out.println("Introduce ahora un número");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce otro número");
		int num2 = Integer.parseInt(sc.nextLine());
		
		res = Integer.valueOf(num1).compareTo(Integer.valueOf(num2));
		
		System.out.println("\n Resultado de comparar num1 con num2: "+res);
		
		sc.close();

	}

}
