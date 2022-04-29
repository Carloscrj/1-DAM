package dam.arraybi;

import java.util.Random;
import java.util.Scanner;

public class EjercicioEntrega {
	static int [][] matriz;
	
	static final int MIN = 3;
	static final int MAX = 180;
	
	public static void main(String[] args) {
		
		
		
		inicializarMatriz();
		
		rellenarMatriz();
		
		mostrarMatriz();
		
		analizarMatriz();
		
	}

	private static void analizarMatriz() {
		int sumaFilas=0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFilas+= matriz[i][j];
			}
			if(sumaFilas>matriz[i].length*20) {
				System.out.println("La fila "+(i+1)+" suma más de "+matriz[i].length+"*20");
			} else {
				System.out.println("La fila "+(i+1)+" no suma más de "+matriz[i].length+"*20");
			}
			sumaFilas=0;
		}
		
	}

	private static void mostrarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("| "+matriz[i][j]+" |");
			}
			System.out.println("\n");
		}
		
	}
	
	/*private static void mostrarMatriz() {
	 System.out.print("Elementos de la matriz");
		for (int i = 0; i < matriz.length; i++) {
			 System.out.print(Arrays.toString(mat[i]));
		}
	}	
}*/            //esto es otro método de Pilar
	

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
		} while (alea%3!=0 || alea%2!=0); // || porque con una de las dos que no valga ya no vale el número aleatorio
		
		return alea;
	}
	

	private static void inicializarMatriz() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántas filas tiene la matriz?"); 
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("¿Cuántas columnas tiene la matriz?");
		int m = Integer.parseInt(sc.nextLine());
		
		matriz = new int [n][m];
		
		sc.close();
		
	}

}
