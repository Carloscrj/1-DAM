package dam.ejerciciowhile;

import java.util.Scanner;

public class WhileEjercicio3 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("´¿Cuantos números enteros quiere introducir?");
		 int numeros = Integer.parseInt(teclado.nextLine());
		 int cont = 0;
		 int acum_pos = 0;
		 int acum_neg = 0;
		 int acum_cero = 0;
		 int numero;
		 
		 while(numeros>cont) {
				System.out.println("Dime un número");
				numero =  Integer.parseInt(teclado.nextLine());
				if (numero>0) {
					acum_pos = acum_pos + 1;
					
				} else if (numero<0){
					acum_neg = acum_neg+1;
					
				} else if (numero==0) {
					acum_cero = acum_cero+1;
					
				}
				cont = cont+1;
				}
		 System.out.println("El número de positivos es "+acum_pos+ " , el número de negativos es "+acum_neg+ " y el número de ceros es "+acum_cero);
		 teclado.close();
			
	}
		
}
