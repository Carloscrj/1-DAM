package ejercicios.sentequipos;

public class Ejercicio3For {

	public static void main(String[] args) {
		System.out.println("¿El número 5 es primo?");
		
		int num = 5;
		int primo;
		
		for (int cont =1; cont<=5; cont++) {
			primo = num/cont;

			if (primo==5||primo==1) {
			System.out.println("El número 5 es primo");
	  }

	}
  }
}