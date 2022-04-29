package dam.ejer4if.main;

import java.util.Scanner;

import dam.ejer4if.pojo.Rueda;

public class UsoRueda {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la marca de la rueda");
		String marca = teclado.nextLine();
		System.out.println("Introduzca el diametro de la rueda");
		double diametro = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduzca el grosor de la rueda");
		double grosor = Double.parseDouble(teclado.nextLine());
		
		Rueda rueda1 = new Rueda(marca, diametro, grosor);
		
		System.out.println(rueda1.toString());
		
		System.out.println(rueda1.comprobarDiametro());
		
		System.out.println(rueda1.comprobarGrosor());
		
		teclado.close();
	}

}
