package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {
	
	static final int TAM = 10;
	
	public static void main(String[] args) {
		
		 int [] enteros = new int[TAM];

	        rellenarArray(enteros);

	        mostrarArray(enteros);
	    }

	    private static void mostrarArray(int[] array) { //m�todo para mostrar los valores de un array
	        System.out.println("{"); //est�tico para empezar con una llave
	        
	        for (int i = 0; i < array.length; i++) { //la longitud del array la coge de la array "enteros"
	        	
	            if (i != array.length-1 ) {
	                System.out.print(array[i]+", "); //si es la �ltima posici�n no pongas una coma; es est�tico
	            } else {
	                System.out.println(array[i]);
	            }
	        }
	        
	        System.out.println("}"); //est�tico para finalizar con una llave el array

	    }

	    private static void rellenarArray(int[] enteros) {
	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < enteros.length; i++) {
	            System.out.println("Introduce el valor "+(i+1)+"�");
	            enteros[i] = Integer.parseInt(sc.nextLine()); //as� asignamos los valores del array

	        }

	        sc.close();
	    }

	}
	/*Crea un array de 10 posiciones de n�meros con valores pedidos por teclado. 
	 * Muestra por consola el �ndice y el valor al que corresponde. 
	 * Haz dos m�todos, uno para rellenar valores y otro para mostrar.*/