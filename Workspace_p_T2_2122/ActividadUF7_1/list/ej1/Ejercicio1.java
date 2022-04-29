package list.ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio1 {

	
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		ArrayList<Integer> fichero1 = new ArrayList<Integer>();
		ArrayList<Integer> fichero2 = new ArrayList<Integer>();
		ArrayList<Integer> fichero3 = new ArrayList<Integer>();
		ArrayList<Integer> ficheroFinal = new ArrayList<Integer>();
		
		rellenarFichero(fichero1,1); //rellenamos los 3 ficheros con el mismo método
		rellenarFichero(fichero2,2);
		rellenarFichero(fichero3,3);
		
		//Añadimos en fichero final los datos de los 3 ficheros:
		ficheroFinal.addAll(fichero1);
		ficheroFinal.addAll(fichero2);
		ficheroFinal.addAll(fichero3);
		
		ficheroFinal.sort(null); //Ordena el fichero; como le pasamos null, le decimos que lo ordene como pueda y, en este caso, será numéricamente
		
		mostrarficheroFinal(ficheroFinal);
		
		//Ordenar de mayor a menor con Comparator (que es una interface) (no lo usaremos este año):
		ficheroFinal.sort(new Comparator<Integer>() { //esto solo nos da error y el error nos sugiere el override del método compare

			@Override
			public int compare(Integer i1, Integer i2) {
				
				return 0 - (i1 - i2); //le damos la vuelta aquí al resultado de los 2 enteros, con la resta
			}
		});
		
		sc.close();
		
	}

	private static void mostrarficheroFinal(ArrayList<Integer> ficheroFinal) {
		System.out.println("***Total de kg ordenados***");
		for (Integer kilos : ficheroFinal) {
			System.out.println(kilos+"kg");
		}
	}

	private static void rellenarFichero(ArrayList<Integer> fichero, int num) {
		int kilos = 1;
		System.out.println("- Rellenando el fichero"+num+":");
		while (kilos != 0) {
			kilos = solicitarKilos();
			if (kilos != 0) {
				fichero.add(kilos);
			}
		}
		System.out.println("***Fichero rellenado****");
	}

	private static int solicitarKilos() {
		int k = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				System.out.println("Introduce los kilos");
				k = Integer.parseInt(sc.nextLine());
				
				if (k < 0) {
					System.out.println("El valor no puede ser negativo");
				} else {
					valNoVal = false;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser un número entero");
			}
		}
		return k;
	}


}
