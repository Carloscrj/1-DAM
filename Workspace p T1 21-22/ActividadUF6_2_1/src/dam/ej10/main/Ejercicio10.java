package dam.ej10.main;

import java.util.Scanner;

import dam.ej10.pojo.Articulos;


public class Ejercicio10 {
	static Articulos[]objeto;
	static Scanner teclado;
	public static void main(String[] args) {
		
		teclado= new Scanner(System.in);
		
		System.out.println("¿Cuantos artículos quiere registrar?");//para las líneas 15 al 18 se podría crear
		int cosas = Integer.parseInt(teclado.nextLine());		   //el metodo inicializar array
		
		objeto = new Articulos [cosas];
		
		rellenarArray();
		
		mostrarArray();
		
		analizarArray();
		
		
		teclado.close();

	}
	private static void analizarArray() {
		int totalPrecio=0;
		double masCaro=-1;
		String objMasCaro = "";
		for (int i = 0; i < objeto.length; i++) {
			
			if(objeto[i].getPrecio()>0) {
				totalPrecio+=objeto[i].getPrecio();
			}
			
			if(masCaro<objeto[i].getPrecio()) {
				masCaro=objeto[i].getPrecio();
				objMasCaro= objeto[i].getNombre();
				
			}
			
		}
		System.out.println("El precio total es: "+totalPrecio);
		System.out.println("El artículo más caro es: "+objMasCaro);
	}
	private static void mostrarArray() {
		for (int i = 0; i < objeto.length; i++) {
			System.out.println(objeto[i].toString());
		}
	}
	private static void rellenarArray() {
	
		for (int i = 0; i < objeto.length; i++) {
			
			System.out.println("Introduzca el precio del artículo");
			int precio=Integer.parseInt(teclado.nextLine());
			System.out.print("Introduzca nombre del artículo:");
			String nombre = teclado.nextLine();
			
			objeto[i] = new Articulos(precio, nombre);
			
			
		}
	}
	
	

}
