package dam.ej7.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6Sucio {
		static Scanner teclado;
		static int [] numeros;

	public static void main(String[] args) {
		
		
		
		teclado = new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		mostrarArray();
		
		teclado.close();

	}

	private static void mostrarArray() {
		int suma=0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+"  ");
			suma+=numeros[i];
		}
			System.out.println("la suma de los aleatorios es :"+suma);
	}

	private static void rellenarArray() {
		int limSup=9;
		int limInf=0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=generarAleatorio(limInf,limSup);
		}
	}

	private static int generarAleatorio(int limInf,int limSup) {
		Random rd = new Random();
		return rd.nextInt(limSup+1-limInf)+limInf;
	}

	private static void inicializarArray() {
		
		System.out.println("¿De que tamaño quiere el array?");
		int taman = Integer.parseInt(teclado.nextLine());
		
		numeros = new int [taman];
	}

}
