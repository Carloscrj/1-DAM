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
		int mayor = 0; //suponemos que el límite inferior es mayor que 0;
		System.out.print("{");
		for (int i = 0; i < numeros.length; i++) {
			if (i != numeros.length-1) {
				System.out.print(numeros[i]+", ");
			} else {
				System.out.print(numeros[i]);
			}
			if (numeros[i] > mayor) { //aquí vamos calculando cuál es el mayor en cada iteración; pero no lo mostramos
				mayor=numeros[i];
			}
		}
		System.out.println("}");
		
		System.out.println("\nEl mayor valor es "+mayor);
	}

	private static void rellenarArray() {
		System.out.print("Indica el límite inferior mayor que cero para aleatorio: ");
		int limInf = Integer.parseInt(sc.nextLine());
		System.out.print("Indica el límite superior mayor que el anterior de aleatorio: ");
		int limSup = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generarAleatorio(limInf,limSup); //aquí guardamos el primo aleatorio
		}
	}

	private static int generarAleatorio(int limInf, int limSup) {
		Random rd = new Random();
		int alea = 0;
		do {
			alea = rd.nextInt(limSup + 1 - limInf) + limInf; //así nos saca un randrom entre dos números; ambos incluidos.
		} while (!esPrimo(alea)); //que se repita si el número generado NO es primo; vamos al método
		
		return alea;
	}
	//retornará true si alea es primo y false si no lo es:
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
		System.out.print("Introduce la cantidad de números que quieres generar: ");
		int cant = Integer.parseInt(sc.nextLine());
		
		numeros = new int [cant];//iniciamos el array con la cantidad que nos diga el usuario
	}

}
/*Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados,
 *  por último nos indicar cual es el mayor de todos. Haz un método para comprobar que el número aleatorio es primo, 
 * puedes hacer todos lo métodos que necesites.*/
 