package dam.ej1_2_3;


import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca una frase");
		String cadena = teclado.nextLine();
		
		System.out.println("Introduzca un caracter");
		char caracter = teclado.next().charAt(0);
		
		int contCaract = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i)==caracter) {
				contCaract++;
			}
			
		}
			
		System.out.println("El número de veces que se repite el caracter es: "+contCaract);
		teclado.close();
		
	}

}
