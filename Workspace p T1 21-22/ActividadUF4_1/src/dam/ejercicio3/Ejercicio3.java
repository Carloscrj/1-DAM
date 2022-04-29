package dam.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce horas trabajadas");
		double trabajo = Double.parseDouble(teclado.nextLine());
		
		double sueldo;
		
		if (trabajo<=40) {
			sueldo = trabajo * 16;
			System.out.println("El sueldo del trabajador es "+sueldo);
		} else if (trabajo>40){
			sueldo = ((trabajo - 40)*20) + (40*16);
			System.out.println("El sueldo del trabajador es "+sueldo);
		}
		
		teclado.close();
}
	

	}


