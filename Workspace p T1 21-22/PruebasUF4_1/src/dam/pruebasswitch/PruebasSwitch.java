package dam.pruebasswitch;

import java.util.Scanner;

public class PruebasSwitch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("**¿A que curso?**");
		System.out.println("Indica la edad del niño");
		int edad = Integer.parseInt(teclado.nextLine());
		
		switch (edad) {
		case 6 :
			System.out.println("Su curso es 1º de primaria");
			break;
		case 7 :
			System.out.println("Su curso es 2º de primaria");
			break;
		case 8:
			System.out.println("Su curso es 3º de primaria");
			break;
		case 9:
			System.out.println("Su curso es 4º de primaria");
			break;
		case 10:
			System.out.println("Su curso es 5º de primaria");
			break;
		case 11:
			System.out.println("Su curso es 6º de primaria");
			break;
		default:
			System.out.println("No va a primaria");
			break;
			
		}
		
		teclado.close();

	}

}
