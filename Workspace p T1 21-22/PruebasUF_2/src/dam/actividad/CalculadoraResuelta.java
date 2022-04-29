package dam.actividad;

import java.util.Scanner;

public class CalculadoraResuelta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Pilar aquí dice sc al teclado
		
		
		System.out.println("introduce el primer número:");
		double num1 = Double.parseDouble(sc.nextLine());//podemos recoger directamente en double
		                                                //lo que introduzca el usuario; sin necesidad de coger en String y luego pasar a principio
	
		System.out.println("introduce el segundo número");
		double num2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce la operación: \n 1 Suma \n 2 Resta" + "\n 3 Multiplicación \n 4 División");
		int operacion = Integer.parseInt(sc.nextLine());
		
		double resultado = (operacion ==1)? num1+num2 : (operacion==2)? num1-num2 :
			(operacion ==3)? num1*num2 : num1/num2;
		
		System.out.println("El resultado de la operación es" +resultado);
		
		sc.close();
		
	
	}
	

}
