package dam.ej7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio7 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una serie de 10 numeros enteror separados por comas");
		String serie1 = sc.nextLine();
		
		System.out.println("Introduce otra serie de 10 numeros enteros separados por comas");
		String serie2 = sc.nextLine();
		
		int suma1 = 0;
		int suma2 = 0;
		
		StringTokenizer st1 = new StringTokenizer(serie1, ",");
		StringTokenizer st2 = new StringTokenizer(serie2, ",");
		
		while (st1.hasMoreTokens()) {
			suma1 += Integer.parseInt(st1.nextToken());
			
		}
		
		while (st2.hasMoreTokens()) {
			suma2 += Integer.parseInt(st2.nextToken());
			
		}
		
		if (suma1 > suma2) {
			System.out.println("La serie \n" + serie1 + " \ntiene mayor suma: " + suma1);
		} else if (suma1 < suma2) {
			System.out.println("La serie \n" + serie2 + " \ntiene mayor suma: " + suma2);
		} else {
			System.out.println("Las series \n" + serie1 + " y \n" + serie2 
					+ " \ntienen la misma suma: " + suma1);
		}
		
		// OPCI�N 2
		
		int suma;
		String serie;
		StringTokenizer st;
		int sumaMayor = 0;
		String serieMay = "";
		
		for (int i = 0; i < 2; i++) {
			suma = 0;
			
			System.out.println("Introduce una serie de 10 numeros enteros separados por comas");
			serie = sc.nextLine();
			
			st = new StringTokenizer(serie, ",");
			
			while (st.hasMoreTokens()) {
				suma += Integer.parseInt(st.nextToken());
				
			}
			
			if (i == 0 || suma > sumaMayor) {
				sumaMayor = suma;
				serieMay = serie;
			}
			
		}
		
		System.out.println("La serie \n" + serieMay + " \ntiene mayor suma: " + sumaMayor);
		
		sc.close();
	}

}
