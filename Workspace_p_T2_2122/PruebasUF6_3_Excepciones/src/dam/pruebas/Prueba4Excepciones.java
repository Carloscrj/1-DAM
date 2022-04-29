package dam.pruebas;

import java.util.Scanner;

public class Prueba4Excepciones {

	public static void main(String[] args) {
		
		boolean edadNoOk = true;
		
		int edad= -1;
		
		while (edadNoOk) {
			
			try {
			
			
				edad= solicitarEdad();
				edadNoOk= false;
				System.out.println("Edad: "+edad);
			
			} catch(NumberFormatException e) {
			System.out.println("El valor debe ser entero");
			}
		
		}
		
	}
		
		

	private static int solicitarEdad() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		int edad= Integer.parseInt(teclado.nextLine());
		
		teclado.close();
		return edad;
	}
 
		 
		

}
