package prueba.alea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3PruebaAlea {
	static final int MIN=1;
	static final int MAX=100;
	static ArrayList<Integer> listaNumAlea;
	static ArrayList<Integer> listaNumNoRepetidos;
	
	public static void main(String[] args) {
		
		listaNumAlea = new ArrayList<Integer>();
		
		rellenarLista();
		
		imprimirLista();
		
		mostrarElementosSinRepetir();
		
		mostrarElementosSinRepetirDescendente();

	}

	

	private static void mostrarElementosSinRepetirDescendente() {
		System.out.println();
		System.out.println("Los elementos no repetidos en orden descendente son:");
		listaNumNoRepetidos.sort(null);
		Collections.reverse(listaNumNoRepetidos);
		for (Integer entero : listaNumNoRepetidos) {
			System.out.print(entero + ", ");
		}
		System.out.println();

		
	}



	private static void imprimirLista() {
		
		
		if(listaNumAlea.isEmpty()) {
			System.out.println("La lista está vacia.");
		}else {
			System.out.println("\n Elementos de la lista");
			listaNumAlea.sort(null);
			for (int i = 0; i < listaNumAlea.size(); i++) {
				System.out.println(listaNumAlea.get(i)+" ");
			}
		}
		
	}



	private static void rellenarLista() {
		
		int alea;
		System.out.println("Rellenar Lista");

			for(int i=1; i<=100 ;i++) {
				
				alea= crearAleatorio();
				listaNumAlea.add(alea);
			}
			
		
	}



	private static int crearAleatorio() {
		Random rd = new Random();
		return rd.nextInt(MAX+1-MIN)+MIN;
	}


	private static void mostrarElementosSinRepetir() {
		listaNumNoRepetidos= new ArrayList<Integer>();
		
		System.out.println("Los elementos no repetidos son: ");
		
		for (int i = MIN; i <= MAX; i++) {
			//si el número i se encuentra en la lista y la posición de su primera aparicion coincide con la posición de la
			//última aparición no esta repetido
			if (listaNumAlea.indexOf(i) != -1 && listaNumAlea.indexOf(i)==listaNumAlea.lastIndexOf(i)) {
				System.out.print((i)+", ");
				listaNumNoRepetidos.add(i);
			}
		}
		
		/*for ( int i = 0; i < listaNumAlea.size()  ;i++) {
			for(int j=0; j<listaNumAlea.size() ; j++ ) {
				if(listaNumAlea.get(i)==listaNumAlea.get(j) && j!=i) {
					System.out.println("El número "+listaNumAlea.get(i)+" está repetido.");
				}else {
					System.out.println("El número "+listaNumAlea.get(i)+" no está repetido.");
				}
			}
		}*/
		
		/*for ( int i = 0; i < listaNumAlea.size(); i++) {
			if(listaNumAlea.contains(i)) {
				for (i=listaNumAlea.get(i); i<listaNumAlea.size(); i++ ) {
					if(listaNumAlea.contains(i)) {
					System.out.println("El número "+listaNumAlea.get(i)+" esta repetido.");
					}else {
						System.out.println("El número"+listaNumAlea.get(i)+" no está repetido.");
					}
				}							  
			}
				
		} */
					
	
	} 
	
}



	
