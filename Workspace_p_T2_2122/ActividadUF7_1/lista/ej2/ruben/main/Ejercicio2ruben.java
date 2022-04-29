package lista.ej2.ruben.main;

import java.util.ArrayList;
import java.util.Scanner;
import productoej2.pojo.Producto;

public class Ejercicio2ruben {

	static Scanner sc;
	static ArrayList<Producto> listaCompra;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		listaCompra = new ArrayList<Producto>();
		
		mostrarOpciones();
		
		sc.close();

	}

	private static void mostrarLista() {
		if (listaCompra.isEmpty()) {
			System.out.println("La lista de la compra está vacía");
		} else {
			System.out.println("\n***Elementos de la lista***");
			for (Producto elemento : listaCompra) { //me define una variable con el tipo de dato que contiene la colecci�n y le ponemos un nombre; 'numero', por ejemplo
				System.out.println(elemento);
			}
		}
	}

	private static void eliminarProducto() {
		if(listaCompra.isEmpty()) {
			System.out.println("La lista está vacia, añada los productos.");
			 mostrarOpciones();
		}
		
		System.out.println("¿Que producto desea eliminar?, si no deseas eliminar introduce volver.");
		String elimpro = sc.nextLine();
		
		if(elimpro.equalsIgnoreCase("volver")){
			 mostrarOpciones();
		}
			
		
		for (int i = 0; i < listaCompra.size(); i++) { 
			if (listaCompra.get(i).getNombre().equalsIgnoreCase(elimpro)) {
				System.out.println("El producto: \n"+listaCompra.get(i)+"\n ha sido eliminado");
				listaCompra.remove(i);
			} else {
				System.out.println("El producto no se encuentra en la lista");
			}
		}
	}
	
	private static int solicitarCantidad(String nom) {
		int cantidad = 0;
		boolean continuar = true;
		
		while (continuar) {
			try {
				System.out.println("Introduce la cantidad de "+nom+":");
				cantidad = Integer.parseInt(sc.nextLine());
				
				if (cantidad>0) {
					continuar = false;
				} else {
					System.out.println("La cantidad debe ser mayor que 0");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser entero");
			}
		}
		return cantidad;
	}
	
	private static String solicitarNombre() {
		String nom = "";
		boolean continuar = true; 
		
		while (continuar) {
			System.out.println("Introduce el nombre del producto:");
			nom = sc.nextLine(); 
			
			if (nom.isBlank()) {
				System.out.println("Debe introducir un valor; no puede estar vacío");
			} else {
				continuar = false;
			}
		}
		return nom;
	}

	private static void addProducto() {
		String nombre;
		int cantidad;

		nombre = solicitarNombre();
		
		cantidad = solicitarCantidad(nombre); 
		
		Producto producto = new Producto(nombre, cantidad);

		if (!listaCompra.contains(producto)) {
			listaCompra.add(producto);
			System.out.println("El producto ha sido añadido a la lista\n");
		} else {
			System.out.println("Este producto ya está en la colección");
		}
	}

	private static int validarMenu() {
		boolean valNoOk = true;
		int opcion = 0;
		
		while (valNoOk) {
			try {
				System.out.println("***Bienvenido a la lista de la compra***"
						+"\nIntroduce una de las siguientes opciones:"
						+ "\n1 - Añadir producto de la lista de la compra"
						+ "\n2 - Eliminar producto de la lista de la compra"
						+ "\n3 - Mostrar la lista de la compra"
						+ "\n4 - Para terminar ");
				opcion = Integer.parseInt(sc.nextLine());
				
				if (opcion>0 && opcion<5) {
					valNoOk = false;
				} else {
					System.out.println("El número introducido no coincide con las posibles opciones");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("El valor introducido debe ser un número entre el 1 y el 4; prueba de nuevo:");
			}
		}
		return opcion;
	}
	
	private static void mostrarOpciones() {
		int opcionMenu;
		boolean continuar = true;

		while (continuar) {
			opcionMenu = validarMenu();
			
			if (opcionMenu==1) {
				addProducto();
			} else if (opcionMenu==2) {
				eliminarProducto();
			} else if (opcionMenu==3) {
				mostrarLista();
			} else {
				System.out.println("El programa ha finalizado. Gracias");
				continuar = false;
			}
		}
	}
}