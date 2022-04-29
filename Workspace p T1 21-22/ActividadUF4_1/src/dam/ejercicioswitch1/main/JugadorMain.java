package dam.ejercicioswitch1.main;

import java.util.Scanner;

import dam.ejercicioswitch1.pojo.Jugador;

public class JugadorMain {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		

		System.out.println("Introduzca el nombre");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca la edad");
		int edad =  Integer.parseInt(teclado.nextLine());
		
		Jugador jugador1 = new Jugador(nombre, edad);
		
		System.out.println(jugador1.getNombre());
		System.out.println(jugador1.IndicarCategoria());
		
		teclado.close();
		
		
			

	}

}
