package list.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2copiado {
	
	static Scanner sc;
	static ArrayList<String>listaCompra;
	
	public static void main(String[] args) {
		
		 sc = new Scanner(System.in);
		
		listaCompra = new ArrayList<String>(); 
		
		realizarAccion();
		
		sc.close();
		
	}

	private static void mostrarLista() {
		
System.out.println("\n Elementos de la lista1");
		
		if(listaCompra.isEmpty()) {
			System.out.println("La lista está vacia.");
		}else {
		for (String product : listaCompra) { 
			System.out.println(product+" ");
			}
		}
		
		realizarAccion();
		
	}
	

	private static void añadirProducto() {
		
			System.out.println("Introduce un artículo al carrito.");
			String product = sc.nextLine();
	
			listaCompra.add(product);
			
			realizarAccion();
		
		
	}
		

	private static void realizarAccion() {
		
		int opcion=0;
		boolean continuar=true;
		
		while(continuar) { 
			try {
				System.out.println("Que acción desea realizar"+"\n Pulse 1 para añadir producto a la lista de la compra"+
						"\n Pulse 2 para eliminar producto"+"\n Pulse 3 para mostrar la lista"+"\n Pulse 4 para terminar");
				
				opcion= Integer.parseInt(sc.nextLine());
				
				if (opcion>0 && opcion<5) {
					continuar= false;
					
				} else {
					System.out.println("Introduzca un número entero del 1 al 4");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Introduzca un número y no una letra");
			}
		}
		
		
		if(opcion==1) {
			añadirProducto();
		}else if(opcion==2) {
			eliminarProducto();
		}else if(opcion==3) {
			mostrarLista();
		}else {
			System.out.println("La lista ha sido terminada.");
		}
		
		
	}
	

	private static void eliminarProducto() {
		System.out.println("¿Que producto desea eliminar?");
		String elimpro = sc.nextLine();
		
		if(listaCompra.contains(elimpro)) {
			listaCompra.remove(elimpro);
			System.out.println("El producto "+elimpro+" ha sido eliminado.");
		}else {
			System.out.println("El producto no se encuentra en su lista.");
		}
		
		realizarAccion();
	}

}
