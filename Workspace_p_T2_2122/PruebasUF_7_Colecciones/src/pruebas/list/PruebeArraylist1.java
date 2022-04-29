package pruebas.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PruebeArraylist1 {
	static final int BUSCAR_NUM=5;
	static ArrayList<Integer> listaNumeros; //no deja crear tipo primitivos por lo tanto para n�meros
											//usamos el envoltorio Integer
	public static void main(String[] args) {
		
		inicializarLista();
		
		mostrarTamanio();
		
		rellenarLista();
		
		mostrarTamanio();
		
		mostrarLista();
		
		mostrarLista2();
		
		mostrarLista3();
		
		buscarNumero();

	}
	
	
	private static void buscarNumero() {
		System.out.println("\n�Se encuentra el n�mero "+BUSCAR_NUM+" en la lista? "
					+(listaNumeros.contains(BUSCAR_NUM)? "SI": "NO"));
	}


	//tercera opci�n para recorrer una lista y segunda para otras colecciones
	private static void mostrarLista3() {
		System.out.println("\n Elementos de la lista(tercera opci�n)");
		Iterator<Integer> it =listaNumeros.iterator();
		
		int numero;
		
			if(listaNumeros.isEmpty()) {
				System.out.println("La lista est� vacia.");
			}else {
				
				while (it.hasNext()) {	
					numero= it.next();
					System.out.print(numero+" ");
				}
			}
	}
	

	//segunda opci�n para recorrer una lista y primera para otras colecciones
	//la segunda es para cuando te da igual donde est�n los elementos
	private static void mostrarLista2() {
		System.out.println("\n Elementos de la lista(segunda opci�n)");
		
		if(listaNumeros.isEmpty()) {
			System.out.println("La lista est� vacia.");
		}else {
		for (Integer numero : listaNumeros) { //la primera parte es cada elemento, la segunda es la colecci�n
			System.out.print(numero+" ");
			}
		}
	}
	

	//las lista las podemos recorrer de tres maneras 
	//esta sirve para cuando la quieres recorre y te interesa la posici�n de cada elemento
	private static void mostrarLista() {
		System.out.println("\n Elementos de la lista(primera opci�n)");
		
		if(listaNumeros.isEmpty()) {
			System.out.println("La lista est� vacia.");
		}else {
			System.out.println("\n Elementos de la lista");
			for (int i = 0; i < listaNumeros.size(); i++) {
				System.out.print(listaNumeros.get(i)+" ");
			}
		}
		
		
	}
	
	
	
	
	private static void rellenarLista() {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean continuar=true;
		
		while(continuar) {  //aqu� utuliza este metodo para parar(no para que siga como en los arrays).
			try {
				System.out.println("Introduce un entero o si no quieres continuar introduce otra cosa");
				num= Integer.parseInt(sc.nextLine());
				
				listaNumeros.add(num);
			} catch (Exception e) {
				continuar=false;
			}
		}
		
		sc.close();
		
	}
	
	private static void mostrarTamanio() {
		if(listaNumeros.size()==0) { //if(listaNumeros.isEmpty()) as� tambi�n se podria hacer
			System.out.println("La lista esta vac�a");
		}else {
			System.out.println("La lista tiene "+listaNumeros.size()+" elementos");
		}
		
		
	}
	
	private static void inicializarLista() {
		//inicializamos la lista de manera que no apunte a null pero est� vacia
		listaNumeros = new ArrayList<Integer>();
		
	}

}
