package dam.sort;

import java.util.Arrays;
import java.util.Random;

// clase para implementar el algoritmo burbuja, para ordenar un vector de menor a mayor
public class PruebaBurbuja {
	static final int TAM = 10;
	static int [] array;
	public static void main(String[] args) {
		
		array = new int [TAM];
		
		
		rellenarArray();
		
		mostrarArray();
		
		Arrays.sort(array); //este es el metodo para ordenar array no haria falta hacer el metodo ordenar
		
		//ordenarArray();
		
		mostrarArray();
		
		System.out.println(Arrays.toString(array));// con esto no hace falta el metodo mostrar array
		
		

	}
	
	private static void ordenarArray() {
		
		int aux;
		for (int i = 0; i < array.length-1; i++) { //no es necesario que i llegue a la ultima possición del array, sera j quien lo haga para comparar
			for (int j = i+1; j < array.length; j++) { // j empieza a rorrer en ka siguiente posición de i; es decir, i+1, para compararlo con i
				if (array[i]>array[j]) {
					//intercambiarlos
					aux= array[i];
					array[i]=array[j];
					array[j]= aux;
					
					
				}
			}
		}
		
		
	}
	
	private static void mostrarArray() {
		System.out.println("\n Elementos del array: ");
		for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]+", ");
			}
			
		}
		
	
	private static void rellenarArray() {
		Random rd = new Random ();
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(50); //valores entre 0 y 49
			
		}
		
		
	}

}
