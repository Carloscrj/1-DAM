package dam.ej3;

import java.util.Random;

public class Ejercicio3 {

	static int [][] matriz; //declaramos global el array bidimensional para poder usarlo en métodos de rellenar y mostrar
	
	public static void main(String[] args) {
		matriz = new int [3][4];
		
		// ---------------------
		// | ----------------- |
		// | | 0 | 0 | 0 | 0 | |
		// | ----------------- |
		// ---------------------
		// | ----------------- |
		// | | 0 | 0 | 0 | 0 | |
		// | ----------------- |
		// ---------------------
		// | ----------------- |
		// | | 0 | 0 | 0 | 0 | |
		// | ----------------- |
		// ---------------------
		
		rellenarMatriz();
		
		mostrarMatriz();
		
		encontrarMayor();

	}

	private static void encontrarMayor() {
		int mayor = 0; //para guardar el mayor valor
		int fila = 0; //para guardar la fila (i) en que se encuentra el mayor
		int columna = 0; //para guardar la columna (j) en que se encuentra el mayor
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((i == 0 && j == 0) || (matriz[i][j] > mayor)) { //asignamos el primer valor a mayor o ya cuando sea mayor a ese primer valor
					mayor = matriz[i][j];
					fila = i;
					columna = j;
				}
			}
		}
		System.out.println("El mayor valor es "+mayor+" y ser encuentra en la fila "+(fila+1)+ " y la columna "+(columna+1));  
		//ponemos fila y columna +1 para que estéticamente quede mejor al imprimirlo por pantalla
	}

	private static void mostrarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" "); //mostrar sin salto de línea el elemento seguido de un espacio
			}
			System.out.println();//para que salte de línea al terminar cada columna de dentro
		}
	}

	private static void rellenarMatriz() { //indice i para recorrer filas e indice j para columnas de cada fila
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) { //para poder recorrer las posiciones del array que hay dentro de cada array
				matriz[i][j] = obtenerAleatorio(1,20); //rellenamos el array bidimensional con números aleatorios entre 1 y 20
			}
		}
	}

	private static int obtenerAleatorio(int min, int max) {
		Random rd = new Random();
		return rd.nextInt(max+1-min)+min; //para que sea un número entre min y máx, incluyendo ambos
	}
}

//Realiza un programa en el que se cree una matriz 3x4, se imprima el mayor elemento y la fila y la columna en la que se encuentra.
//(inicializarla con código; sin escaner)
