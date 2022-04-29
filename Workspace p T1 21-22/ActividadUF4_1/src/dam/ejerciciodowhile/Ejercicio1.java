package dam.ejerciciodowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero entero positivo");
		int num = Integer.parseInt(teclado.nextLine());
		
		int alea;
		do {
		alea = generarAleatorio(num);
		System.out.println(alea);
		}while (alea % 2 != 0);
			
		System.out.println(alea);
		
		teclado.close();
		
	}

	private static int generarAleatorio(int num) {
		Random rd = new Random();
		int alea = rd.nextInt(num);
		return alea;
	}

}
//Random rd = new Random();
//int alea = rd.nextInt(num) ESTO ES LO QUE ESTABA ESCRITO HASTA QUE LO REFACTORICE Y SE CONVIRTIO EN int alea = generarAleatorio(num);
                            //Y TAMBIEN SE PUSO ESTO DE ABAJO SOLO
             