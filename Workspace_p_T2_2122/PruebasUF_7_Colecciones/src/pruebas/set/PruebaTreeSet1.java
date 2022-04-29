package pruebas.set;

import java.util.Scanner;
import java.util.TreeSet;

public class PruebaTreeSet1 {
	
	static TreeSet<String> setNumeros;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		
		setNumeros= new TreeSet<String>();
		
		mostrarSet();
		
		rellenarSet();
		
		mostrarSet();

	}

	private static void rellenarSet() {
		String numero;
		boolean continuar=true;
		
		while(continuar) {  //aqu� utuliza este metodo para parar(no para que siga como en los arrays).
			
				System.out.println("Introduce un n�mero en palabras, si no quieres mas no introduzcas nada");
				numero= sc.nextLine().trim();
				
				setNumeros.add(numero);
				
				if (numero.isEmpty()) {
					continuar= false;
				}else {
					setNumeros.add(numero);
				} 
		}
		
	}

	private static void mostrarSet() {
		if(setNumeros.isEmpty()) {
			System.out.println("El conjunto est� vacio.");
			}else {
			System.out.println("\n El conjunto tiene "+setNumeros.size()+" n�meros.");
			
			System.out.println("\n Elementos del conjunto");
			
			for (String numero : setNumeros) { //la primera parte es cada elemento, la segunda es la colecci�n
			System.out.println(numero);
			}
			System.out.println();
		}
	}

}
