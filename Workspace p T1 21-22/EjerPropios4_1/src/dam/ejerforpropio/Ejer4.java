package dam.ejerforpropio;

public class Ejer4 {

	public static void main(String[] args) {
		
		int suma = 0;
		
		for (int cont=0; cont<=15; cont++) {
			suma= suma + (int)Math.pow(cont, 2); //(int)Math.pow(cont, 3)ser�a para hacer cubo
		}
		
		System.out.println("La suma de los quince cuadrados primeros n�meros naturales es "+suma);
	}

}
