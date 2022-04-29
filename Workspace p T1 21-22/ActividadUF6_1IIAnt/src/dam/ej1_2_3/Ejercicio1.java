package dam.ej1_2_3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca una frase");
		String cadena= teclado.nextLine();
		
		int contVocales = 0;
		
		for(int i=0; i<cadena.length(); i++) {
			
			if(cadena.charAt(i)=='a') {
				contVocales++;
			}else if(cadena.charAt(i)=='e')  {
				 contVocales++;	
			}else if(cadena.charAt(i)=='i')  {
				contVocales++;
			}else if(cadena.charAt(i)=='o')  {
				contVocales++;
			}else if(cadena.charAt(i)=='u')  {
				contVocales++;
			}else {
				
			
		}
		
	  }
		
		System.out.println("El número de vocales es: "+contVocales);
		teclado.close();
		
	}
	
}


