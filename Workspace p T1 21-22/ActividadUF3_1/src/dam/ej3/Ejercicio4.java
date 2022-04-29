package dam.ej3;

public class Ejercicio4 {

	public static void main(String[] args) {
		int a = 3 ;
		int b = 7 ;
		int aux = a;
		System.out.println(" a = " + a + " y b = " + b );
		
		aux=a;
		a=b;
		b=aux;
		System.out.println(" Ahora el valor de a es " + a + " y el de b es " + b );
		
	}

}
