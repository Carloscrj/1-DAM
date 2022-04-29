package dam.ej4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	static Scanner sc; //no sería necesario hacerlo global porque solo se usa en un método
	
	static int [][] matriz; //la hacemos global para usarla dentro de los métodos
	
	static final int MIN = 10; // constantes min y max para generar el aleatorio
	static final int MAX = 90;
	
	/*static final int FILA_INT_1 = 0;*/
	/*static final int FILA_INT_2 = 1;*/
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		inicializarMatriz();
		
		sc.close();
		
		rellenarMatriz(); //rellenar matriz con aleatorios entre 1 y 30, por ejemplo
		
		mostrarMatriz(); //mostrar matriz
		
		cambiarOrden(); //intercambiar fila 0 y 1
		
		mostrarMatriz();//mostrar matriz de nuevo
	}

	private static void cambiarOrden() {
		int [] arrAux = new int [matriz[0].length];
			for (int j = 0; j < matriz[0].length; j++) {
				arrAux = matriz[0];
		        matriz[0] = matriz[1];
		        matriz[1] = arrAux;
			}
		System.out.println("Cambio de fila 2 por fila 1:\n");
	}

	/*private static void cambiarOrden() {
		int aux;
		for (int j = 0; j < matriz[0].length; j++) {
			aux = matriz[FILA_INT_1][j];
			matriz[FILA_INT_1][j] = matriz[FILA_INT_2][j];
			matriz[FILA_INT_2][j] = aux;
		}
		System.out.println("Cambio de fila 2 por fila 1\n");
	}*/

	private static void mostrarMatriz() { 
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("| "+matriz[i][j]+" |");
			}
			System.out.println("\n");
		}
	}

	private static void rellenarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = generarAleatorio(); //creamos método para generarlos
			}
		}	
	}

	private static int generarAleatorio() {
		Random rd = new Random();
		return rd.nextInt(MAX+1-MIN)+MIN; 
	}

	private static void inicializarMatriz() {
		int n;
		do {
			System.out.println("¿Cuántas filas tiene la matriz?"); //solicitar número de filas --> n (debe ser mayor que 1)
			n = Integer.parseInt(sc.nextLine());
		} while (n<=1);
		
		System.out.println("¿Cuántas columnas tiene la matriz?"); //solicitar número de columnas --> m
		int m = Integer.parseInt(sc.nextLine());
		
		matriz = new int [n][m]; //incialiar la matriz nxm con los valores dados por teclado
	}
}
//Realiza un programa en el que se cree una matriz nxm, solicita n y m por teclado, 
//se rellene con enteros de manera aleatoria, se intercambie la primera fila por la segunda y se imprima la matriz antes y después del cambio.

