package dam.ejerciciosfor;

public class ForEjercicio5 {
	static int suma = 0;

	public static void main(String[] args) {
		for(int cont = 1 ; cont <= 50; cont +=2) {
			suma = suma+cont;
		}
		System.out.println("La suma de los n�meros impares del 1 al 50 es "+suma);
		
		for(int cont = 2 ; cont <= 50; cont +=2) {
			suma = suma+cont;
		}
		System.out.println("La suma de los n�meros pares del 1 al 50 es "+suma);
	}

}
