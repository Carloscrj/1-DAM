package dam.ej9.arrays.main;

import java.util.Scanner;

import dam.ej9.arrays.pojo.Receta;

public class RecetaAlta {
	
	static Scanner teclado;
	static Receta [] menu;
	public static void main(String[] args) {
		teclado =  new Scanner(System.in);
		
		inicializarArray();
		
		mostrarArray();
		
		analizarArray();
		
		teclado.close();

	}

	private static void analizarArray() {
		int masTiempo=0;
		String recetaMasTarda="";
		for (int i = 0; i < menu.length; i++) {
			if(menu[i].getDificultad().equals("alta")) {
				if(menu[i].getMinutos()>masTiempo) {
					masTiempo=menu[i].getMinutos();
					recetaMasTarda=menu[i].getNombre();
				}
				
			}
		}
		
		System.out.println("El plato con mayor dificultad, que mas tarda es: "+recetaMasTarda);
	}

	private static void mostrarArray() {
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println("Introduzca el nombre del plato");
			String nombre = teclado.nextLine();
			System.out.println("Introduzca la dificultad de la receta(baja/media/alta)");
			String dificultad= teclado.nextLine();
			System.out.println("Introduzca el tiempo de ejecución en minutos");
			int minutos= Integer.parseInt(teclado.nextLine());
			
			menu[i]= new Receta(nombre,dificultad,minutos);
		}
	}

	private static void inicializarArray() {
		System.out.println("¿cuantas recetas quiere en su rectario?");
		int n = Integer.parseInt(teclado.nextLine());
		
		menu= new Receta [n]; 
		
	}

}
