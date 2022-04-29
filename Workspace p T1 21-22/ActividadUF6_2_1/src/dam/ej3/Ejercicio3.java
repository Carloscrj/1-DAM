package dam.ej3;

import java.util.Scanner;

public class Ejercicio3 {
	static final int TAM = 10;
	static int[] numeros;

	public static void main(String[] args) {
		
		numeros = new int[TAM];
		
		rellenarArray();
		
		mostrarArray();
		
		realizarAnalisis();
	}



	private static void realizarAnalisis() {
		
		int sumaPos = 0;
		int sumaNeg = 0;
		double mediaPos= 0;
		double mediaNeg= 0;
		int contPos = 0;
		int contNeg= 0;
		
	
		
	
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>0) {
				sumaPos=sumaPos+numeros[i];
				contPos++;
			}else if(numeros[i]<0) {
				sumaNeg=sumaNeg+numeros[i];
				contNeg++;
				
			}
		
		}
		
		if(contPos>0) {
			mediaPos= (double)sumaPos/contPos; //el double se pone porque la media es double y metemos enteros
			System.out.println("La media de los positivos es: "+mediaPos);
		} else {
			System.out.println("No hay positivos para hacer media");
		}
		
		if(contNeg>0) {
			mediaNeg=(double)sumaNeg/contNeg;
			System.out.println("La media de los negativos es: "+mediaNeg);
		} else {
			System.out.println("No hay negativos para hacer media");
		}

	}

	private static void mostrarArray() {
		System.out.print("{"); //estético para empezar con una llave
        
        for (int i = 0; i < numeros.length; i++) { //la longitud del array la coge de la array "enteros"
        	
            if (i != numeros.length-1 ) {
                System.out.print(numeros[i]+", "); //si es la última posición no pongas una coma; es estético
            } else {
                System.out.println(numeros[i]);
            }
        
        
        System.out.print("}"); //estético para finalizar con una llave el array

        }

	}

	private static void rellenarArray() {
		 Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Introduce el valor "+(i+1)+"º");
	            numeros[i] = Integer.parseInt(sc.nextLine()); //así asignamos los valores del array

	        }

	        sc.close();
	}

}
