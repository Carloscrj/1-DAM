package dam.ej5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un día de la semana");
		String cadena = teclado.nextLine();
		
		String sab = "sabado";
		String dom = "domingo";
		
		if (cadena.equalsIgnoreCase( sab ) || cadena.equalsIgnoreCase( dom )  ) {
			System.out.println("Es dia de fin de semana");
		}else {
			System.out.println("No es dia de fin de semana");
		}
			teclado.close();
	}

}
