
package dam.pruebas.string;

import java.util.Scanner;

public class PruebasString {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase= teclado.nextLine();
		
		int cantLetras=frase.length();//vamos a ver la cantidad de letras que tiene la frase
		System.out.println("La frase introducida tiene "+cantLetras+" caracteres");
		
		String fraseSE=frase.trim();//creamos una variable nueva y le aplicamos trim para que no quite espacios al principio y al final
		System.out.println("La frase sin espacios al principio y al final tiene "+fraseSE.length()+" caracteres.");
		
		
		System.out.println("Indica una posición");
		int pos = Integer.parseInt(teclado.nextLine());
		
		if(pos<0 || pos>=fraseSE.length()) {
			System.out.println("No hay ninguna letra en la posición indicada");
		} else {
			System.out.println("En la posición "+pos+ " hay una "+fraseSE.charAt(pos));
		}
		
		String fraseMay = fraseSE.toUpperCase();
		System.out.println("Frase en mayúsculas: \n"+fraseMay);
		
		System.out.println("Frase en minúsculas: \n" + fraseSE.toLowerCase());
		
		int posComa = fraseSE.indexOf(',');
		
		String saludo = fraseSE.substring(0, posComa);
		System.out.println(saludo);
		
		
		String fraseC = fraseSE.replace(',', '¿');
		System.out.println(fraseC);
		
		int posA = fraseSE.indexOf('a');//almacenamos en nueva variable la possición de la primera "a" que encuentre empezando por el principio
		int ultPosA = fraseSE.lastIndexOf('a');// y la posición de la primera "a" que encuentre empezando por el final
		System.out.println("Posiciones de a: "+posA+ " y "+ultPosA);
		
		
		int posQ = fraseSE.indexOf('Q');
		int ultPosQ = fraseSE.lastIndexOf('Q');
		System.out.println("Posiciones de a: "+posQ+ " y "+ultPosQ);
		
		System.out.println("Es saludo igual a Adios? "+saludo.equals("Adios"));
		System.out.println("Es saludo igual a Hola? "+saludo.equals("Hola"));
		
		System.out.println("Empieza la frase por Adios"+frase.startsWith("Adios"));
		System.out.println("Empieza la frase por Hola"+frase.startsWith("Hola,"));
		
		System.out.println("Acaba la frase con '!'? "+frase.endsWith("!"));
		System.out.println("Acaba la frase con '?'? "+frase.endsWith("?"));
		
		teclado.close();

	}

}
