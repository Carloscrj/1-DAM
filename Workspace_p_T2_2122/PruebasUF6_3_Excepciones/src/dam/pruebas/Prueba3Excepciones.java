package dam.pruebas;

import java.util.Scanner;

public class Prueba3Excepciones {
	
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 boolean valNoOk=true;
		 
		 while(valNoOk) {
			 try {
				 System.out.println("Introduce tu edad");
				 int edad= Integer.parseInt(teclado.nextLine());
				 
				 if(edad>=0 && edad <=130) {
					 valNoOk=false;
					 
					 System.out.println("Tienes "+edad+ " años");
				 }else {
					 throw new Exception("El valor debe ser un entero entre 0 y 130"); //creamos una excepción nosotros
				 }
				 
				 
				 }catch (NumberFormatException e) { //para dejar que siga si es un número y no una letra
					 System.out.println("El valor introducido debe ser un valor entero");
					// e.printStackTrace(); //información destinada al programador para poder ver que ha pasado
					 
				 }catch (Exception e) { // para dejar que siga si es negativo
					 System.out.println(e.getMessage());
				 }
		 }
		
		 
		 
		 teclado.close();
	}

}
