package string6II_ej4;


import java.util.Scanner;

public class Ej4String6II {
		static Scanner teclado;
	public static void main(String[] args) {
	
		String passwordCorrecta="crj";
		
		System.out.println("Introduzca la contrase�a");
		String password = teclado.nextLine();
		
		for(int i = 0; i>=1; i++) {
			if(password.equals(passwordCorrecta)) {
				System.out.println("Enhorabuena");
			} else{
				System.out.println("Contrase�a incorrecta intentelo de nuevo");
				
				 System.out.println("Introduzca una contrase�a");
				 password = teclado.nextLine();
				
			}
		}
		
		if(password.equals(passwordCorrecta)) {
			
		}
		
		
		

	}

}
