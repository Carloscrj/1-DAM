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
            valorNoVal = true; //tenemos que "resetear" el booleano para que vuelva a probar en la próxima iteración
            while (valorNoVal) {
                try {
                    vector[i] = solicitarEntero(sc, i); //le pasamos el teclado y el índice como parámetro
                    valorNoVal = false; //si llega aquí es que hemos conseguido asignarle un valor al vector
                } catch (NumberFormatException e) {
                    System.out.println("El valor no es válido; debe ser entero");
                }
            }
        }
        sc.close();

    }

    private static int solicitarEntero(Scanner sc, int i) throws NumberFormatException { //nos creamos un método específico para rellenar el vector porque vamos a controlar con exceptions
        int valor = 0;

        System.out.println("Introduce el valor de la posición "+(i+1));
        valor = Integer.parseInt(sc.nextLine());

        return valor;
    }
}
//Clase que rellena un vector por teclado y lo muestra por consola; vamos a pasar la exceptión a rellenar vector/

