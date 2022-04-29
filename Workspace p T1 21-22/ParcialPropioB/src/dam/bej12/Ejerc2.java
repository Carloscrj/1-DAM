package dam.bej12;

import java.util.Random;
import java.util.Scanner;

public class Ejerc2 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca un número entero positivo");           //do{
		int num1 = Integer.parseInt(teclado.nextLine());                      //while(num1<=0||max<=0); mientras que uno de los dos números o los dos sea 0 o - 
		                                                                                                //volver a pedir números al usuario
		System.out.println("Introduzca otro número entero positivo");
		int num2 = Integer.parseInt(teclado.nextLine());
		
		int aux=num1;
		if(num1>num2) {
			num1=num2;
			num2=aux;	
		}
		
		int contpar = 0;
		int contimpar = 0;
		int aleatorio;
		
		for(int cont=1; cont<=10; cont++  ) {
		
		aleatorio = getAleatorio(num1, num2);
		System.out.println("El número aleatorio es: "+aleatorio);
		if (aleatorio%2==0) {
			contpar++;
		} else {
			contimpar++;
		}
		
		}

		System.out.println("La cantidad de números aleatorios pares son "+contpar+" y la cantidad de números aleatorios impares son "+contimpar);
		
		teclado.close();
	}

	private static int getAleatorio(int num1, int num2) {
		Random rd = new Random();
		int aleatorio = rd.nextInt(num2+1-num1)+num1; 
		return aleatorio;
	}
}