package damej1y2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuantos números enteros va a introducir");
		int num = Integer.parseInt(teclado.nextLine());
		
		int cont= 0;
		int contm=0;
		int contdiv=0;
		
		while(num>cont) {
			
			System.out.println("Introduzca un número entero positivo");
			int ent = Integer.parseInt(teclado.nextLine());
			
			if (ent%7==0) {
				contm++;
			} else if (150%ent==0) {
				
				contdiv++;
			} else {
				System.out.println("El numero"+ent+"no es múltiplo de 7, ni divisor de 150");
			}
			
			cont++;
		}
		
		System.out.println("La cantidad de número enteros multiplos de 7 es: "+contm);
		System.out.println("La cantidad de número enteros divisores de 150 es: "+contdiv);
		
		teclado.close();

	}

}
