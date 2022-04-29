package ej3HasMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio3 {
	static Scanner sc;
	static HashMap<Integer, String> mapaJugadores;

	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		
		mapaJugadores = new HashMap<Integer,String>();
		
		alineacion();
		
		presentacionDeLosJugadores();
		
		simularFalta();
		
		finalDelPartido();
		
		
		sc.close();

	}

	private static void alineacion() {
		
		System.out.println("¡¡¡¡Ya tenemos el once inicial de la Selección Española!!!!");
		
		mapaJugadores.put(1, "Casillas");
		mapaJugadores.put(3, "Pique");
		mapaJugadores.put(5, "Puyol");
		mapaJugadores.put(6, "Iniesta");
		mapaJugadores.put(7, "Villa");
		mapaJugadores.put(8, "Xavi Hernández");
		mapaJugadores.put(1, "Casillas");
		mapaJugadores.put(11, "Capdevila");
		mapaJugadores.put(14, "Xabi Alonso");
		mapaJugadores.put(15, "Ramos");
		mapaJugadores.put(16, "Busquets");
		mapaJugadores.put(18, "Pedrito");
		
	}

	private static void finalDelPartido() {
		boolean valNoval = true;
		String respuesta;
		
		
		while (valNoval) {
				
				System.out.println("¿Quiere finalizar el partido?");
				respuesta= sc.nextLine();
				
				if (respuesta.equalsIgnoreCase("SI")||respuesta.equalsIgnoreCase("NO")) {
					
					if(respuesta.equalsIgnoreCase("SI")) {
						mapaJugadores.clear();
						if(mapaJugadores.isEmpty()) {
							System.out.println("Final del partido");
							
					    }
					}else {
						System.out.println("El partido sigue en juego");
					}
					valNoval= false;
					
				} else {
					System.out.println("Introduzca SI o NO");
				}
				
		}	
		
}
		
  

	private static void simularFalta() {
		boolean valNoval = true;
		int dorsal=0;
		
		while (valNoval) {
			System.out.println("Introduce dorsal de jugador que hace la falta.");
			dorsal= Integer.parseInt(sc.nextLine());
			
			if(mapaJugadores.containsKey(dorsal)) {
				System.out.println("El jugador " +mapaJugadores.get(dorsal)+ " ha sido expulsado.");
				mapaJugadores.remove(dorsal);
				valNoval=false;
			}else {
				System.out.println("El jugador no se encuentra");
			}
			
		}
		
		
		
	}

	private static void presentacionDeLosJugadores() {
		System.out.println("Alineación de la Selección Española de Futbol");
		for (Entry<Integer, String> elemento : mapaJugadores.entrySet()) {
			
			System.out.println("¡¡¡¡Con el número "+elemento.getKey()+ "!!!!! -"+elemento.getValue());
			
		}
		
	}

}
