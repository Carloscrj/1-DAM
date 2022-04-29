package pruebas.set;

import java.util.HashSet;
import java.util.Scanner;

public class PruebaHashSet1 {
	
	static HashSet<String> setColores;
	
	public static void main(String[] args) {
		
		setColores = new HashSet<String>();
		
		rellenarLista();
		
		mostrarSet();		

	}

	private static void mostrarSet() {
		
			if(setColores.isEmpty()) {
			System.out.println("El conjunto está vacio.");
			}else {
			System.out.println("\n El conjunto tiene "+setColores.size()+" colores");
			
			System.out.println("\n Elementos del conjunto");
			
			for (String color : setColores) { //la primera parte es cada elemento, la segunda es la colección
			System.out.println(color);
			}
			System.out.println();
		}
	}
		
	

	private static void rellenarLista() {
		Scanner sc = new Scanner(System.in);
		String color;
		boolean continuar=true;
		
		while(continuar) {  //aquí utuliza este metodo para parar(no para que siga como en los arrays).
			
				System.out.println("Introduce un color o nada si quieres acabar");
				color= sc.nextLine().trim();
				
				setColores.add(color);
				
				if (color.isEmpty()) {
					continuar= false;
				}else {
					setColores.add(color);
				} 
		}
		
		sc.close();
		
	}

}
