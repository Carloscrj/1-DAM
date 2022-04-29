import java.util.Scanner;

public class Ejercicio4 {
	static final int TAM = 10;
	static int[] numeros;
	public static void main(String[] args) {
		
		numeros = new int[TAM];
		
		rellenarArray();
		
		mostrarArray();
		
		analisisArray();
	}
	private static void analisisArray() {
		int sumaPar = 0;
		double mediaPar= 0;
		int contPar = 0;
		
		for (int i = 0; i < numeros.length; i++) { //tambien se podria recorrer el contador de 2 en 2 y no hace falta el if solo operar.
			if(i % 2==0) {
				contPar++;
				sumaPar= sumaPar+numeros[i];
				
			} 
				
		}
		
		mediaPar= (double) sumaPar/contPar;
		System.out.println("La media de los n�meros que estan en las posici�nes pares es "+mediaPar);
		
	}
	private static void mostrarArray() {
		System.out.print("{"); //est�tico para empezar con una llave
        
        for (int i = 0; i < numeros.length; i++) { //la longitud del array la coge de la array "enteros"
        	
            if (i != numeros.length-1 ) {
                System.out.print(numeros[i]+", "); //si es la �ltima posici�n no pongas una coma; es est�tico
            } else {
                System.out.println(numeros[i]);
            }
        
        
        System.out.print("}"); //est�tico para finalizar con una llave el array

        }
		
	}
	private static void rellenarArray() {
		
		 Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Introduce el valor "+(i+1)+"�");
	            numeros[i] = Integer.parseInt(sc.nextLine()); //as� asignamos los valores del array

	        }

	        sc.close();
		
	}

}
