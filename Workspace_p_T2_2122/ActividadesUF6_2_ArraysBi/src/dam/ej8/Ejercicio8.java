package dam.ej8;

import java.util.Scanner;

public class Ejercicio8 {

	static Scanner sc;
	static int [][] matriz1;
	static int [][] matriz2;

	public static void main(String[] args) {
	sc = new Scanner(System.in);

	inicializarMatrices();

	rellenarMatrices();

	sc.close();

	mostrarMatrices();

	compararMatrices();

	}

	private static void mostrarMatrices() {
	System.out.println("**Primera Matriz**");
	for (int i = 0; i < matriz1.length; i++) {
	for (int j = 0; j < matriz1[i].length; j++) {
	System.out.print("| "+matriz1[i][j]+" |");
	}
	System.out.println("\n");
	}
	System.out.println("**Segunda Matriz**");
	for (int i = 0; i < matriz2.length; i++) {
	for (int j = 0; j < matriz2[i].length; j++) {
	System.out.print("| "+matriz2[i][j]+" |");
	}
	System.out.println("\n");
	}
	}

	private static void compararMatrices() {
	boolean iguales = true;
	for (int i = 0; i < matriz1.length; i++) {
	for (int j = 0; j < matriz1[i].length; j++) {
	if (matriz1[i][j] != matriz2[i][j] ) {
	iguales = false;
	j = matriz1[i].length-1;
	i = matriz1.length-1;

	}
	}
	}
	if (iguales) {
	System.out.println("Las matrices son iguales");
	} else {
	System.out.println("Las matrices son diferentes");
	}
	}

	private static void rellenarMatrices() {
	System.out.println("Rellenar primera matriz:");
	for (int i = 0; i < matriz1.length; i++) {
	for (int j = 0; j < matriz1[i].length; j++) {
	System.out.println("Introduce el número para la posición: fila "+(i+1)+" y columna "+(j+1));
	matriz1[i][j] = Integer.parseInt(sc.nextLine());
	}
	}

	System.out.println("Rellenar segunda matriz:");
	for (int i = 0; i < matriz2.length; i++) {
	for (int j = 0; j < matriz2[i].length; j++) {
	System.out.println("Introduce el número para la posición: fila "+(i+1)+" y columna "+(j+1));
	matriz2[i][j] = Integer.parseInt(sc.nextLine());
	}
	}
	}

	private static void inicializarMatrices() {
	int filas;
	int columnas;

	System.out.println("Indica número de filas para las tablas: ");
	filas = Integer.parseInt(sc.nextLine());
	System.out.println("Indica el número de columnas para las tablas: ");
	columnas = Integer.parseInt(sc.nextLine());

	matriz1 = new int [filas][columnas];
	matriz2 = new int [filas][columnas];

	}
	}
