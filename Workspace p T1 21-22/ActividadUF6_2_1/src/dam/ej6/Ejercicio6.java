package dam.ej6;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	static int[]numeros;
	static int MAX = 9;
	public static void main(String[] args) {
		
		inicialiazarArray();
		
		rellenarArray();
		
		mostrarArray();
	}

	private static void mostrarArray() {
		int suma=0;
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i]+",");
			suma+=numeros[i];
		}

		System.out.println("La suma de todos los valores es: "+suma);
	}

	private static void rellenarArray() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generarAleatorio();
		}
	}

	private static int generarAleatorio() {
		Random rd = new Random();
		return rd.nextInt(MAX+1);//lo hacemos así porque al ser el mínimo cero es una tonteria hacerlo con la formula habitual
	}

	private static void inicialiazarArray() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de números a generar");
		int n = Integer.parseInt(teclado.nextLine());
		
		numeros= new int [n];
		
		teclado.close();
		
	}

}
