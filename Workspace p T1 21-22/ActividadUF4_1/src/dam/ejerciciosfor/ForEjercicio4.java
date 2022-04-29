package dam.ejerciciosfor;

public class ForEjercicio4 {

	public static void main(String[] args) {
		
		int suma = 0;
		
		for(int cont = 1; cont <= 15; cont++) {
			suma = suma + (int)Math.pow(cont, 2); //(int)Math.pow(cont, 3)sería para hacer cubo
		}
		
		System.out.println("El sumatorio de los 15 primeros números naturales es "+suma);
		
	}

}
