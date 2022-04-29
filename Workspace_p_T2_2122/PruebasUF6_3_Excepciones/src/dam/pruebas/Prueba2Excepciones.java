package dam.pruebas;

public class Prueba2Excepciones {

	public static void main(String[] args) {
		
		String vectorS[] = {"Hola mundo 1", "Hola mundo 2", "Hola mundo 3" };
		
		int i = 0;
		
		try {
			while (i < 4) {
				System.out.println(vectorS[i]);
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Se esta intentando acceder a una posición fuera de los limites del vector");
			
			e.printStackTrace();//esto es para que se imprima la excepción de todas formas
		}
			
System.out.println("Fin del programa");
	}
}
