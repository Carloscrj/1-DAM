package pruebas.set;

import java.util.Scanner;  //la unica diferencia entre Hash y Tree es que el Tree al mostartelo te lo muestra en orden alfab�tico o num�rico.
import java.util.TreeSet;

public class PruebaTreeSet2 { // esto lo vamos a usar para que si no queremos seguir para que coja el empty
							//  porque si no no podr�amos hacer eso
	
	static TreeSet<Integer> setNumeros;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		
		setNumeros= new TreeSet<Integer>();
		
		mostrarSet();
		
		rellenarSet();
		
		mostrarSet();
		
		sc.close();
	}

	private static void rellenarSet() {
		int numero;
		String sNum;
		boolean continuar=true;
		
		while(continuar) {  //aqu� utuliza este metodo para parar(no para que siga como en los arrays).
			try {
				System.out.println("Introduce un n�mero, si no quieres m�s pulsa enter.");
				sNum= sc.nextLine().trim();
				
				
				if (sNum.isEmpty()) {
					continuar= false;
				}else {
					numero= Integer.parseInt(sNum);
					setNumeros.add(numero);
				} 
				
			} catch (NumberFormatException e) {
				System.out.println("Introduce un valor entero.");
			}
				
		}
		
	}

	private static void mostrarSet() {
		if(setNumeros.isEmpty()) {
			System.out.println("El conjunto est� vacio.");
			}else {
			System.out.println("\n El conjunto tiene "+setNumeros.size()+" n�meros.");
			
			System.out.println("\n Elementos del conjunto");
			
			for (int numero : setNumeros) { //la primera parte es cada elemento, la segunda es la colecci�n
			System.out.println(numero);
			}
			System.out.println();
		}
	}

}
