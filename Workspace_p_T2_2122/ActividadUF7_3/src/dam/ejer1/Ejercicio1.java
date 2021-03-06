package dam.ejer1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class Ejercicio1 {
	static HashMap<String, Integer> mapaPalabras;
	static TreeMap<String, Integer > tablaOrd;
	static Scanner sc;
	static int NUMPALA= 3;
	
	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		
		mapaPalabras = new HashMap<String,Integer>();
		
		solicitarPalabras();
		
		rellenarHashMap();
		
		tablaOrd = new TreeMap<String,Integer>();
		
		mostrarTablaOrdenAlfabetico();
		
		
		
		mostrarMenorAMayorCantLetras();
		
		sc.close();
	}

	private static void mostrarMenorAMayorCantLetras() {
	
		System.out.println("\nTabla ordenada de menor a mayor");

		ArrayList<Entry<String, Integer>> listaOrd = new ArrayList<Entry<String,Integer>>(mapaPalabras.entrySet());
		//listaOrd.addAll(mapaPalabras.entrySet());si quitamos el mapaPalabras.entrySet() de arriba y ponemos esto vale igual
		listaOrd.sort(Entry.comparingByValue()); // Le decimos que compare por valores

		for (Entry<String, Integer> palabra : listaOrd) {

			System.out.println("La palabra: " + palabra.getKey() + " contiene: " + palabra.getValue() + " letras");

		}
		
		
		
		System.out.println("\nPalabras ordenadas por valor de menor a mayor (opci?n 2)");
		ArrayList<String> palabrasOrd = new ArrayList<String>(mapaPalabras.keySet());	

		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String uno, String dos) {
				return uno.length() - dos.length();
			}
			
		};
		
		palabrasOrd.sort(comp);
		
		for (String palabra: palabrasOrd) {
			
			System.out.println("La palabra "+palabra+ " contiene "+mapaPalabras.get(palabra)+" caracteres.");
			
		}

	}

	private static void mostrarTablaOrdenAlfabetico() {
		
		tablaOrd.putAll(mapaPalabras); //volcamos todo el Hashmap de tablaAlea a TreeMap
		
		for (String palabra: tablaOrd.keySet()) {
				System.out.println("La palabra "+palabra+" tiene "+ tablaOrd.get(palabra)+" elementos");
			}
		
	}

	private static void rellenarHashMap() {
		
		String elemento;
		/*int cont=0;
		do {
			elemento= solicitarPalabras();
			if(mapaPalabras.containsKey(elemento)) {
				System.out.println("La palabra ya esta introducida");
			}else {
				mapaPalabras.put(elemento,elemento.length());
				cont++;
			}
			
		} while (mapaPalabras.containsKey(elemento) || cont<NUMPALA);*/
		
		for (int i = 1; i <= NUMPALA; i++) {
			elemento = solicitarPalabras();
			
			
				mapaPalabras.put(elemento,elemento.length());
			
		}
		
	}
		
		

	private static String solicitarPalabras() {
	
		//boolean valorNoval = true;
		String palabra="";
			
			/*while(valorNoval) {
				
					System.out.println("Introduzca la palabra.");
					palabra= sc.nextLine();
					
					if(mapaPalabras.containsKey(palabra)){ 
						System.out.println("Debe introducir la palabra.");
					} else {
						valorNoval=false;
					}
			
			}*/
		
		do {
			System.out.println("Introduce la palabra ");
			palabra = sc.nextLine().toUpperCase();
			
			if (mapaPalabras.containsKey(palabra)) {
				System.out.println("La palabra ya existe en la tabla");
			}
		} while (mapaPalabras.containsKey(palabra));
			
		
		return palabra;
			
		}
	
}
	


