package prueba.map;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;


public class Ejercicio2PruebaMap {
	static int MIN=1;
	static int MAX=100;
	static HashMap<Integer, Integer> tablaAlea;
	
	
	public static void main(String[] args) {
		
		tablaAlea = new HashMap<Integer,Integer>();
		
		
		
		rellenarTabla();
		
		mostrarNumerosNoEstan();
		
		mostrarNumeroQueCincoVeces();
		
		mostrarNumeroQueDosVeces();
		
		mostrarEnOrden();
		
	

	}



	private static void mostrarEnOrden() {
		TreeMap<Integer,Integer> tablaOrd = new TreeMap<Integer,Integer>();
		tablaOrd.putAll(tablaAlea); //volcamos todo el Hashmap de tablaAlea a TreeMap
		
		for (Integer num: tablaAlea.keySet()) {
				System.out.println(num+"-"+ tablaOrd.get(num)+" veces");
			}
		
	}

	private static void mostrarNumeroQueDosVeces() {
		for (Integer num: tablaAlea.keySet()) {
			if (tablaAlea.get(num)==2 ) {
				System.out.println("El número "+num+" está repetido 2 veces.");
			}
			
		}
	}

	private static void mostrarNumeroQueCincoVeces() {
		for (Integer num: tablaAlea.keySet()) {
			if (tablaAlea.get(num)==5 ) {
				System.out.println("El número "+num+" está repetido 5 veces.");
			}
			
		}
	}

	private static void mostrarNumerosNoEstan() {
		for (int num=MIN; num<=MAX; num++) {
			if (!tablaAlea.containsKey(num)) {
				System.out.println("El número "+num+" no está en la lista");
			}
			
		}
		
	}

	private static void rellenarTabla() {
		
		int cont=0;
		int alea;
		
		while (cont<100) {
			
			alea= crearAleatorio();
			
			if(tablaAlea.containsKey(alea)) {
				tablaAlea.put(alea, tablaAlea.get(alea)+1);
			}else {
				tablaAlea.put(alea,1);
			}
			cont++;
		}
		
		
	}

	private static int crearAleatorio() {
		
		Random rd = new Random();
		return rd.nextInt(MAX+1-MIN)+MIN;
		
	
	}

}
