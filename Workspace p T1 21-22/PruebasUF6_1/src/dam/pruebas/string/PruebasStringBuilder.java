package dam.pruebas.string;

import java.util.Scanner;

public class PruebasStringBuilder {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

		System.out.println("Introduce un número");
		String sNum = teclado.nextLine();
		
		StringBuilder sb = new StringBuilder(sNum);
		sb.setLength(10);
		System.out.println("El valor sb es "+sb.toString());
		
		String sNumInv=sb.reverse().toString();
		
		
		System.out.println("El número invertido es "+sNumInv);
		
		teclado.close();
	}

}
