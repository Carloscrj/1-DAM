  package pruebas.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class PruebaHasMap {
	//al crear un mapa debemos poner primero el dato que no queremos que se repita
	static HashMap<String, String> mapaPersonas;
	
	public static void main(String[] args) {
		
		mapaPersonas = new HashMap<String,String>();
		
		mapaPersonas.put("12345678S", "Sara");
		mapaPersonas.put("87654321C", "Juan");
		mapaPersonas.put("23456789V", "Pedro");
		
		System.out.println("El mapa contiene "+mapaPersonas.size()+" elementos.");
		
		mostrarMapa();
		
		mostrarMapa2();
		
		mostraMapa3();

	}

	private static void mostraMapa3() {
		System.out.println("Elementos del mapa recorrido con values");
		for (String valor: mapaPersonas.values()) {
			System.out.println(valor);
			
		}
		
	}

	private static void mostrarMapa2() {

		System.out.println("Elementos del mapa recorrido con KeySet");
		for (String clave: mapaPersonas.keySet()) {
			System.out.println(clave+"-"+mapaPersonas.get(clave));//le paso la clave con elemento get para imprimirlo
			
		}
		
	}

	private static void mostrarMapa() {
		System.out.println("Elementos del mapa recorrido con Entry-set");
		for (Entry<String, String> elemento : mapaPersonas.entrySet()) {
			
			System.out.println(elemento.getKey()+ "-"+elemento.getValue());
			
		}
		
	}

}
