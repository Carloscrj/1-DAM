package dam.ej6;

import java.util.Random;

public class Ejercicio6 {

	static int [][] matriz; //declaramos global el array bidimensional para poder usarlo en métodos de rellenar y mostrar
	
	public static void main(String[] args) {
		matriz = new int [3][3];
		
		// ---------------------
		// | ----------------- |
		// | | 0 | 0 | 0 |
		// | ----------------- |
		// ---------------------
		// | ----------------- |
		// | | 0 | 0 | 0 |
		// | ----------------- |
		// ---------------------
		// | ----------------- |
		// | | 0 | 0 | 0 |
		// | ----------------- |
		// ---------------------
		
		rellenarMatriz();
		
		mostrarMatriz();
		
		sumarFilasYColumnas();

	}
	
	/*private static void sumarFilasYColumnasIrregulares() {
    int [] sumaF = new int [matriz.length];
    int [] sumaC = new int [matriz[0].length];

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            sumaF[i] += matriz[i][j]; 
             sumaC[j] += matriz[i][j];
        }
    }
    for (int i = 0; i < sumaF.length; i++) {
        System.out.println("suma de la fila " + i + ": " + sumaF[i]);
    }

    for (int i = 0; i < sumaC.length; i++) {
        System.out.println("suma de la columna " + i + ": " + sumaC[i]);
    }
}*/

	private static void sumarFilasYColumnas() {
		int sumaFilas = 0;
		int sumaColumnas = 0;
		for (int i = 0; i < matriz.length; i++) {   //este metodo nos vale para sumarfilasycolumnas porque es regular, para todo tipo PracticaPropias 1B
			for (int j = 0; j < matriz[i].length; j++) {                      //con un for anidado más para las filas
				sumaFilas += matriz[i][j];       //va recorriendo valores de izq a derecha incrementando J y manteniendo I
 				sumaColumnas += matriz[j][i];    //va recorriendo valores de arriba a abajo incrementando J y manteniendo I
			}
			System.out.println("La suma de la fila "+(i+1)+" es: "+sumaFilas);
			System.out.println("La suma de la columna "+(i+1)+" es: "+sumaColumnas);
			sumaFilas=0; //reiniciamos sumas antes de pasar a la siguiente fila y columna
			sumaColumnas=0;
		}
	}

	private static void mostrarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");     //mostrar sin salto de línea el elemento seguido de un espacio
			}
			System.out.println();    //para que salte de línea al terminar cada columna de dentro
		}
	}

	private static void rellenarMatriz() {    //indice i para recorrer filas e indice j para columnas de cada fila
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {    //para poder recorrer las posiciones del array que hay dentro de cada array
				matriz[i][j] = obtenerAleatorio(1,20);    //rellenamos el array bidimensional con números aleatorios entre 1 y 20
			}
		}
	}

	private static int obtenerAleatorio(int min, int max) {
		Random rd = new Random();
		return rd.nextInt(max+1-min)+min; //para que sea un número entre min y máx, incluyendo ambos
	}
}
//Crear y cargar de manera aleatoria una matriz de tamaño 3x3 y mostrar la suma de cada fila y la suma de cada columna.