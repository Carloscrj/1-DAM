package dam.ej5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	static Scanner sc; //no sería necesario hacerlo global porque solo se usa en un método
	
	static int [][] matriz; //la hacemos global para usarla dentro de los métodos
	
	static final int MIN = 10; // constantes min y max para generar el aleatorio
	static final int MAX = 90;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarMatriz();
		
		sc.close();
		
		rellenarMatriz(); //rellenar matriz con aleatorios entre 1 y 30, por ejemplo
		
		mostrarMatriz(); //mostrar matriz
		
		mostrarVertices(); //imprimimos los extremos de una matriz regular
	}


	private static void mostrarVertices() {
		/*int nFil = matriz.length; //longitud de la matriz
		int nCol = matriz[0].length; //longitud del array en cualquier fila; 0, por ejemplo*/
		System.out.println("La esquina sup.izq. es: "+matriz[0][0]);
		System.out.println("La esquina sup.der. es: "+matriz[0][matriz[0].length-1]);
		System.out.println("La esquina inf.izq. es: "+matriz[matriz.length-1][0]);
		System.out.println("La esquina inf.der. es: "+matriz[matriz.length-1][matriz[0].length-1]);
	}//le restamos 1 a la posición final porque si tiene 3 poisciones; la posición real será la 2 ya que empieza en 0

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
//se rellene con enteros de manera aleatoria y se imprima los valores de los vértices.