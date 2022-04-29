package dam.ej11.main;

import java.util.Scanner;

import dam.ej11.pojo.Recetas;

public class Ejercicio11 {
	static Scanner teclado;
	static Recetas[]comida;
	public static void main(String[] args) {
		
		teclado= new Scanner(System.in);
		System.out.println("¿Cuantas recetas va a querer almacenar?");
		int numero= Integer.parseInt(teclado.nextLine());
		
		comida= new Recetas[numero];
		
		rellenarArray();
		
		mostrarArray();
		
		analizarArray();
		
		teclado.close();
		
	}
	private static void analizarArray() {
		int masTiempo=0;
		String recetaTarda= "";
		for (int i = 0; i < comida.length; i++) {
			
			if(comida[i].getDificultad().equals("alta")) {
				if(masTiempo<comida[i].getMinutos()) {
					masTiempo= comida[i].getMinutos();
					recetaTarda= comida[i].getNombre();
				}
			}
			
		}
		System.out.println("La receta con dificultad alta que tiene mas tiempo de ejecución es : "+recetaTarda);
		
	}
	private static void mostrarArray() {
		for (int i = 0; i < comida.length; i++) {
			System.out.println(comida[i].toString());
		}
	}
	private static void rellenarArray() {
		for (int i = 0; i < comida.length; i++) {
			System.out.println("Introduzca nombre de la receta: ");
			String nombre= teclado.nextLine();
			System.out.println("Introduzca dificultad de la receta: ");
			String dificultad= teclado.nextLine();
			System.out.println("Introduzca tiempo de la receta: ");
			int tiempo= Integer.parseInt(teclado.nextLine());
			
			comida[i]= new Recetas(nombre, dificultad, tiempo);
		}
	}

}
