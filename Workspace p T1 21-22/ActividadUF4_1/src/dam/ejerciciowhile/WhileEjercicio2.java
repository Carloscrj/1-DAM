package dam.ejerciciowhile;

import java.util.Scanner;

public class WhileEjercicio2 {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Cuantos numeros enteros quiere introducir");
		 int numeros = Integer.parseInt(teclado.nextLine());
		 int cont = 0;
		 int numero;
				 
		 while(numeros>cont) {
				System.out.println("Dime un número");
				numero =  Integer.parseInt(teclado.nextLine());
				if (numero%2==0) {
					System.out.println("El numero es PAR");
				} else {
					System.out.println("El número es IMPAR");
				}
				cont = cont+1;
				}
		 
		 teclado.close();
	}
	
}
