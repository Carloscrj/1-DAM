package dam.ejer1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class mapero {

	static final int TOTAL = 10;
	static HashMap<String, Integer> tablaPalabra;
	
	public static void main(String[] args) {
		tablaPalabra = new HashMap<String, Integer>();
		
		rellenarTabla();
		
		mostrarTablaOrd();
		
		mostrarTablaVOrd();

	}

	private static void mostrarTablaVOrd() {
		// OPCI�N 1
		System.out.println("\nPalabras ordenadas por valor de menor a mayor (opcion 1)");

		// ArrayList<Entry<String, Integer>> listaOrd = new ArrayList<Entry<String, Integer>>(tablaPalabra.entrySet());
		ArrayList<Entry<String, Integer>> listaOrd = new ArrayList<Entry<String, Integer>>();
		listaOrd.addAll(tablaPalabra.entrySet());
		listaOrd.sort(Entry.comparingByValue()); // Le decimos que compare por valores

		for (Entry<String, Integer> palabra : listaOrd) {
			System.out.println("La palabra: " + palabra.getKey() + " contiene: " + palabra.getValue() + " caractares");

		}
		
		// OPCI�N 2
		System.out.println("\nPalabras ordenadas por valor de menor a mayor (opcion 2)");
		ArrayList<String> listaPalabrasOrd = new ArrayList<String>(tablaPalabra.keySet());	

		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String uno, String dos) {
				return uno.length() - dos.length();
			}
		};

		listaPalabrasOrd.sort(comp);
		for (String palabra : listaPalabrasOrd) {
	  		System.out.println("La palabra: " + palabra + " contiene: " + tablaPalabra.get(palabra) + " caractares");
		}
		
		
	}

	private static void mostrarTablaOrd() {
		TreeMap<String, Integer> tablaPalabrasOrd = new TreeMap<String, Integer>(tablaPalabra);
		
		System.out.println("Palabras ordenadas alfabeticamente");
		for (String palabra : tablaPalabrasOrd.keySet()) {
			System.out.println("La palabra " + palabra + " tiene " + tablaPalabrasOrd.get(palabra)  + " caracteres");
		}
		
	}

	private static void rellenarTabla() {
		Scanner sc = new Scanner(System.in);
		String palabra;
		
		for (int i = 1; i <= TOTAL; i++) {
			
			palabra = solicitarPalabra(sc, i);
			tablaPalabra.put(palabra, palabra.length());
			
		}
		
		sc.close();
		
	}

	private static String solicitarPalabra(Scanner sc, int i) {
		String pal;
		
		do {
			System.out.println("\nIntroduce la palabra " + i);
			pal = sc.nextLine().toUpperCase();
			
			if (tablaPalabra.containsKey(pal)) {
				System.out.println("La palabra ya existe en la tabla");
			}
		} while (tablaPalabra.containsKey(pal));
		
		return pal;
	}
	

}

