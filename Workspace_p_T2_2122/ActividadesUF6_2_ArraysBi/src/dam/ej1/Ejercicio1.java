package dam.ej1;

public class Ejercicio1 {
	
	static int [][] matriz; //declaramos global el array bidimensional para poder usarlo en métodos de rellenar y mostrar

	public static void main(String[] args) {
		matriz = new int [4][4]; //inicializamos matriz; el primer [] son filas y el segundo [] son columnas
		
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
		// | ----------------- |
		// | | 0 | 0 | 0 | 0 | |
		// | ----------------- |
		// ---------------------
		
		rellenarMatriz();
		
		mostrarMatriz();
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
			for (int j = 0; j < matriz[i].length; j++) { //para poder recorrer las posiciones del array que hay dentro de cada array/fila
				matriz[i][j] = i + j; //datos con los que se va rellenando el array bidimensional
			}
		}
	}
}
//1. Realiza un programa en el que se cree una matriz 4x4, se rellene de enteros y se muestre por pantalla.
