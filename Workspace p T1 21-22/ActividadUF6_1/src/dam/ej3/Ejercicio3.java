package dam.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca una palabra");
		String cadena = teclado.nextLine();
		
		StringBuilder sb = new StringBuilder(cadena);//esto lo hago para darle valor a sb para poder darle valor a cadena y sacar su inverso
			                                         //en StringBuilder cambia la cadena de caracteres es decir su valor, no solo la invierte				
		String cadenaInv=sb.reverse().toString();
		System.out.println(cadenaInv);
		
		if(cadena.equalsIgnoreCase( cadenaInv )) { // true
			System.out.println("La palabra "+cadena+" es palíndromo.");
		}else {
			System.out.println("La palabra "+cadena+" no es palíndromo.");
		}
		

                                                                //equalsIgnorecase a diferencia de equals no tiene en cuenta las mayusculas
		                                                        //y las minusculas tan solo que se lea igual
		
		teclado.close();
  }
	
	
}
