package dam.pruebasdowhile;

import java.util.Scanner;

public class PruebasDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
			boolean continuar;//aqui he quitado el igual a true por que va el do primero y ya lleva continuar= (resp==1)
		
			do {
			System.out.println("EJECUTANDO PROGRAMA");
			
			System.out.println("¿Desea seguir ejecutando? 1 - Si, 0 - No");
			int resp = Integer.parseInt(teclado.nextLine());
			
			continuar = (resp == 1);
			} while (continuar);
		
			System.out.println("FIN DEL PROGRAMA");
		
			teclado.close();
		}



	}


