package dam.ej7;

import java.util.Random;

public class Ejercicio7 {
	
	static int [][] matriz;
	
	static final int MIN = 10;
	static final int MAX = 90;
	
	public static void main(String[] args) {
		matriz = new int [3][3];
		
		rellenarMatriz();
		
		mostrarMatriz();
		
		sumarDiagInv();
		
		sumarDiagNormal(); //este lo calculamos voluntariamente,
						  //no lo piede el ejercicio
		
	}

	private static void sumarDiagNormal() {
		int sumaDiagNormal = 0; 
		int j = matriz[0].length-1; 
		for (int i = 0; i < matriz.length; i++) {
			sumaDiagNormal += matriz[i][j];
			j--;
		}
		System.out.println("La suma de la diagonal normal es: "+sumaDiagNormal);
	}

	private static void sumarDiagInv() {
		int sumaDiagInv = 0; //sumatorio de cada valor
		int j = 0; //para desplazarnos dentro de los índices de I
		for (int i = 0; i < matriz.length; i++) {
			sumaDiagInv += matriz[i][j];
			j++; //incrementando j de uno en uno, hacemos que en la siguiente array de i, j se desplace un valor más creando así la diagonal
		}
		System.out.println("La suma de la diagonal inversa es: "+sumaDiagInv);
	}

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
				matriz[i][j] = generarAleatorio();
			}
		}
	}

	private static int generarAleatorio() {
		Random rd = new Random();
		int alea = 0;
		do {
			alea = rd.nextInt(MAX+1-MIN)+MIN;
		} while (alea%2!=0);
		return alea;
	}
}
//7.Crea una matriz nxn, rellénala con valores aleatorios pares y, calcula y muestra la suma de la diagonal inversa