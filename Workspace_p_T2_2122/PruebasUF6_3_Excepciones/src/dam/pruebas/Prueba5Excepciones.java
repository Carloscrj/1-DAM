package dam.pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba5Excepciones {
	static final int TAM=10;
	static int [] vector;
	
	public static void main(String[] args) {
		
		vector = new int [TAM];
		
		rellenarVector();
		
		mostrarVector();
		
		

	}

	private static void mostrarVector() {
		System.out.println(Arrays.toString(vector));
		
	}

	private static void rellenarVector() {
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]= solicitarEntero(sc, i);		}
		
		sc.close();
		
	}

	private static int solicitarEntero(Scanner sc, int i) {
		int valor=0;
		boolean valorNoVal = true;
		
		while(valorNoVal) {
			try  {
				System.out.println("Introduce el valor de la posición "+(i+1));
				valor= Integer.parseInt(sc.nextLine());
				valorNoVal = false;
			} catch (NumberFormatException e) {
				System.out.println("El valor no es válido, debe ser un valor entero");
			}
			
		}
			return valor;
		
		

		}
	}

