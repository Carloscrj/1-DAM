package dam.pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba6Excepciones {

    static final int TAM = 10;
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
        Scanner sc = new Scanner(System.in);

        boolean valorNoVal = true;

        for (int i = 0; i < vector.length; i++) {
            valorNoVal = true; //tenemos que "resetear" el booleano para que vuelva a probar en la pr�xima iteraci�n
            while (valorNoVal) {
                try {
                    vector[i] = solicitarEntero(sc, i); //le pasamos el teclado y el �ndice como par�metro
                    valorNoVal = false; //si llega aqu� es que hemos conseguido asignarle un valor al vector
                } catch (NumberFormatException e) {
                    System.out.println("El valor no es v�lido; debe ser entero");
                }
            }
        }
        sc.close();

    }

    private static int solicitarEntero(Scanner sc, int i) throws NumberFormatException { //nos creamos un m�todo espec�fico para rellenar el vector porque vamos a controlar con exceptions
        int valor = 0;

        System.out.println("Introduce el valor de la posici�n "+(i+1));
        valor = Integer.parseInt(sc.nextLine());

        return valor;
    }
}
//Clase que rellena un vector por teclado y lo muestra por consola; vamos a pasar la excepti�n a rellenar vector/

