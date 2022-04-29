package dam.ej7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
	
	static int [] numeros;
	static Scanner sc; //vamos a necesitar varias veces el Scanner; por eso lo creamos global
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		mostrarMayor();
		
		sc.close();
	}

	private static void mostrarMayor() {
		int mayor = 0; //suponemos que el l�mite inferior es mayor que 0;
		System.out.print("{");
		for (int i = 0; i < numeros.length; i++) {
			if (i != numeros.length-1) {
				System.out.print(numeros[i]+", ");
			} else {
				System.out.print(numeros[i]);
			}
			if (numeros[i] > mayor) { //aqu� vamos calculando cu�l es el mayor en cada iteraci�n; pero no lo mostramos
				mayor=numeros[i];
			}
		}
		System.out.println("}");
		
		System.out.println("\nEl mayor valor es "+mayor);
	}

	private static void rellenarArray() {
		System.out.print("Indica el l�mite inferior mayor que cero para aleatorio: ");
		int limInf = Integer.parseInt(sc.nextLine());
		System.out.print("Indica el l�mite superior mayor que el anterior de aleatorio: ");
		int limSup = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generarAleatorio(limInf,limSup); //aqu� guardamos el primo aleatorio
		}
	}

	private static int generarAleatorio(int limInf, int limSup) {
		Random rd = new Random();
		int alea = 0;
		do {
			alea = rd.nextInt(limSup + 1 - limInf) + limInf; //as� nos saca un randrom entre dos n�meros; ambos incluidos.
		} while (!esPrimo(alea)); //que se repita si el n�mero generado NO es primo; vamos al m�todo
		
		return alea;
	}
	//retornar� true si alea es primo y false si no lo es:
	private static boolean esPrimo(int alea) {
        boolean esPrimo = true;
        for (int i = 2; i <= alea / 2; i++) {
            if (alea % i == 0) {
                esPrimo = false;
                i = alea;
            }
        }
        return esPrimo;
	}

	private static void inicializarArray() {
		System.out.print("Introduce la cantidad de n�meros que quieres generar: ");
		int cant = Integer.parseInt(sc.nextLine());
		
		numeros = new int [cant];//iniciamos el array con la cantidad que nos diga el usuario
	}

}
/*Crea un array de n�meros de un tama�o pasado por teclado, el array contendr� n�meros aleatorios primos entre los n�meros deseados,
 *  por �ltimo nos indicar cual es el mayor de todos. Haz un m�todo para comprobar que el n�mero aleatorio es primo, 
 * puedes hacer todos lo m�todos que necesites.*/
 