package dam.ej4;

import java.util.Scanner;

public class Ejercio4 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Introduzca una contrase�a");
		 String password = teclado.nextLine();
		 
		 String passwCorrecta = "crj";
		 
		 boolean acertado=false;
		 
		 
		 for(int i=1; i<=2; i++)  {
			
			 if(password.equals(passwCorrecta)) {
			 System.out.println("Enhorabuena");
			 acertado=true;
			 i=2;
			
			 } else  {
			 System.out.println("Contrase�a incorrecta, intentelo de nuevo"); 
			 
			 System.out.println("Introduzca una contrase�a");
			 password = teclado.nextLine();
			 
			 }
			
			 }	 
		 
		 if(acertado==false) {
				System.out.println("Contrase�a incorrecta, no hay mas intentos.");
	    }
		 
		
		 teclado.close();
	}

  
}

	
