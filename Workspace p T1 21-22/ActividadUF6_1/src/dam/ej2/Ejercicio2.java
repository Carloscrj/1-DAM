package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena= teclado.nextLine();
		//String cadenaMay = cadena.toUpperCase();//esto lo hariamos si queremos que lo cuente este en mayusculas o minusculas
		                                          //abajo en el if tendriamos que poner (cadenaMay.charAt(i) == caracterMay)
		
		System.out.println("Introduce un caracter");
		char caracter= teclado.next().trim().charAt(0);
		//char caracterMay= Character.toUppercase();//esto lo hariamos si queremos que lo cuente este en mayusculas o minusculas
													//abajo en el if tendriamos que poner (cadenaMay.charAt(i) == caracterMay)
		
		int contCarac=0;
		
		for(int i=0; i<cadena.length(); i++) {
			
			if (cadena.charAt(i) == caracter) {
					contCarac++;
			} 
			
			
		}
		
		System.out.println("El caracter '"+caracter+"' se encuentra "+contCarac+" veces en la cadena.");
		teclado.close();
	}

}

