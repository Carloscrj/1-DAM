package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {
	static final int TAM = 10;
	static int[] numeros;
	public static void main(String[] args) {
		
		numeros = new int[TAM];
		
		rellenarArray();
		
		mostrarArray();
		
		realizarAnalisis();
	}

	private static void realizarAnalisis() {
		int contPos = 0;
		int contNeg = 0;
		int contCeros = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>0) {
				contPos++;
			}else if(numeros[i]<0){
				contNeg++;
			}else {
				contCeros++;
			}
			System.out.println("El número de positivos son "+contPos);
			System.out.println("El número de negativos son "+contNeg);
			System.out.println("El número de ceros es "+contCeros);
		}
	}

	private static void mostrarArray() {
		 System.out.println("{"); //estético para empezar con una llave
	        
	        for (int i = 0; i < numeros.length; i++) { //la longitud del array la coge de la array "enteros"
	        	
	            if (i != numeros.length-1 ) {
	                System.out.print(numeros[i]+", "); //si es la última posición no pongas una coma; es estético
	            } else {
	                System.out.println(numeros[i]);
	            }
	        }
	        
	        System.out.println("}"); //estético para finalizar con una llave el array

	}

	private static void rellenarArray() {

		 Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Introduce el valor "+(i+1)+"º");
	            numeros[i] = Integer.parseInt(sc.nextLine()); //así asignamos los valores del array
	            
	            sc.close();
	        }

	       
			
			
		}
	
	
	 	
	}


