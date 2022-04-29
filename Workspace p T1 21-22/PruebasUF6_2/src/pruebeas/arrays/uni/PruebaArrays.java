package pruebeas.arrays.uni;

public class PruebaArrays {

	public static void main(String[] args) {
		
		//tipo de dato, indicar de array y nombre, para declarar un array(como abajo)
		int [] numeros;
		
		//inicialización opción 1
		//palabra clave new, tipo de dato y tamaño entre corchetes
		// estoy cogiendo 7 huecos en memoria, ahora mismo tendrían un 0 todos dentro
		numeros=new int [7];
		//para ir introduciendo datos
		numeros[0]=2;
		numeros[1]=4;
		//rellenando el array completo
		for (int i = 0;  i < numeros.length; i++) {
			numeros[i]=(i+1)*2;//esto es para que te saque los 7 primeros numeros pares menos el cero
			System.out.println(numeros[i]);	
		}
		
		
		//inicialización opción 2
		//aquí ya se los datos que van dentro del array por eso pongo{} con los datos dentro
		int[]primos= {2,3,5,7,11,13,17,19};
		extractedPrimos(primos);
		
		
		
		//un array de tipo String
		String[] colores= {"rojo","azul","verde","amarillo"};
		extractedColores(colores);
			

	}

	private static void extractedColores(String[] colores) {
		System.out.println("{");
		for (int i = 0; i < colores.length; i++) {
				if(i!=colores.length-1) {
					System.out.println(colores[i]+",");
					}else {
					System.out.println(colores[i]);
				}
				
			}
			
			System.out.println("}");
	}

	private static void extractedPrimos(int[] primos) {
		System.out.println("{");
		for (int i = 0; i < primos.length; i++) {
			if(i!=primos.length-1) {
				System.out.println(primos[i]+",");
				}else {
				System.out.println(primos[i]);
			}
			
		}
		
		System.out.println("}");
	}

}
