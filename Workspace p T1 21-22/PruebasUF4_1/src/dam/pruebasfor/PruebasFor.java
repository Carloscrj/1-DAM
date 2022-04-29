package dam.pruebasfor;

import java.util.Scanner;

public class PruebasFor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numRep=Integer.parseInt(teclado.nextLine());
		
		for (int i = 1; i <=5; i++) { // el i es un contador la i< es las veces que quiero usar el contador
										//si me interesa que empiece en 0 tengo que poner i=0
			
			System.out.println("Repetición "+i);
		}
		
		//convertimos el for en un while
		int i = 1;
		while (i<= numRep)
			System.out.println("Repetición "+1);
			i++;
			
			System.out.println("Fin del programa");
			
			teclado.close();
		
		
	}
	
	
}
