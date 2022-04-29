package dam.ej4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena= teclado.nextLine();
		//String cadenaMay = cadena.toUpperCase();//esto lo hariamos si queremos que lo cuente este en mayusculas o minusculas
		                                          //abajo en el if tendriamos que poner (cadenaMay.charAt(i) == caracterMay)
		
		System.out.println("Introduce un caracter en minúsculas");
		char caracter= teclado.next().charAt(0);
		//char caracterMay= Character.toUppercase();//esto lo hariamos si queremos que lo cuente este en mayusculas o minusculas
													//abajo en el if tendriamos que poner (cadenaMay.charAt(i) == caracterMay)
		
		char caracterMay= Character.toUpperCase(caracter);
		System.out.println(caracterMay);
		
		char caracterMen =  Character.toLowerCase(caracter);
		
		StringBuilder sb = new StringBuilder(cadena);
		
		for(int i=0; i<cadena.length(); i++) {
			
			if(cadena.charAt(i)==caracter) {
				caracter=caracterMay;
			 sb.setCharAt(i, caracterMay);
			    caracter=caracterMen;
			}
				
	    }
			
			System.out.println(sb);
			
			teclado.close();
			
     }
  }

