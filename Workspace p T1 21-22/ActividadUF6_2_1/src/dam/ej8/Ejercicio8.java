package dam.ej8;

import java.util.Scanner;

public class Ejercicio8 {
	  static Scanner sc;
	    static double [] notas;
	    static String [] nombres;
	    static String [] resultado;
	    static final int NUM_ALUMNOS = 10; //numero de huecos que tendrán los arrays

	    public static void main(String[] args) {
	        sc = new Scanner(System.in);

	        notas = new double [NUM_ALUMNOS];
	        nombres = new String [NUM_ALUMNOS];
	        resultado = new String [NUM_ALUMNOS];

	        rellenarArrays(); //para rellenar las notas y los nombres

	        sc.close();

	        calcularNota();//calcular nota y guardarla en un array

	        mostrarResultado();
	    }

	    private static void mostrarResultado() {
	        for (int i = 0; i < NUM_ALUMNOS; i++) {
	            System.out.println(nombres[i]+" ha sacado un: "+notas[i]+". Por lo tanto su evaluación es: "+resultado[i]);
	        }
	    }

	    private static void calcularNota() {
	        for (int i = 0; i < NUM_ALUMNOS; i++) {
	            if (notas[i]<=4.99) {
	                resultado[i]="Suspenso";
	            } else if (notas[i]<=6.99) {
	                resultado[i]="Bien";
	            } else if (notas[i]<=8.99) {
	                resultado[i]="Notable";
	            } else {
	                resultado[i]="Sobresaliente";
	            }
	        }
	    }

	    private static void rellenarArrays() {
	        for (int i = 0; i < NUM_ALUMNOS; i++) {
	            do {
	                System.out.println("Indica la nota del alumno. Puede ser decimal entre 0 y 10:");
	                notas[i] = Double.parseDouble(sc.nextLine());
	            } while (notas[i]<0 || notas[i]>10);

	            System.out.println("Introduce el nombre del alumno al que le corresponde esa nota:");
	            nombres[i] = sc.nextLine();
	        }

	    }

	}