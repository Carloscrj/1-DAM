package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {
	
	static final int TAM = 10;
	
	public static void main(String[] args) {
		
		 int [] enteros = new int[TAM];

	        rellenarArray(enteros);

	        mostrarArray(enteros);
	    }

	    private static void mostrarArray(int[] array) { //método para mostrar los valores de un array
	        System.out.println("{"); //estético para empezar con una llave
	        
	        for (int i = 0; i < array.length; i++) { //la longitud del array la coge de la array "enteros"
	        	
	            if (i != array.length-1 ) {
	                System.out.print(array[i]+", "); //si es la última posición no pongas una coma; es estético
	            } else {
	                System.out.println(array[i]);
	            }
	        }
	        
	        System.out.println("}"); //estético para finalizar con una llave el array

	    }

	    private static void rellenarArray(int[] enteros) {
	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < enteros.length; i++) {
	            System.out.println("Introduce el valor "+(i+1)+"º");
	            enteros[i] = Integer.parseInt(sc.nextLine()); //así asignamos los valores del array

	        }

	        sc.close();
	    }

	}
	/*Crea un array de 10 posiciones de números con valores pedidos por teclado. 
	 * Muestra por consola el índice y el valor al que corresponde. 
	 * Haz dos métodos, uno para rellenar valores y otro para mostrar.*/