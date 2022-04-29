package dam.pruebas;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		
		String preguntaColor = "¿ Cual es tu color favorito?"; //definimos (declarar e nicializar) una variable local de referencia tipo string
		
		Scanner teclado = new Scanner(System.in);//definimos una variable local de referencia, es decir, un objeto de tipo scanner
		                                        //que nos facilita comunicación con una fuente extrerna
		                                       //al crearlo usando el constructor le indico que la fuente de la entrada es estandar
		
		System.out.println(preguntaColor);//le pedimos al usuario que escriba. Muestra al usuario el cursor para que escriba
		String respuestaColor = teclado.nextLine() ; //almacenamos la cadena de caracteres que ha escrito el usuario en la variable
		                                             //nextLine() es un método de la clase Scanner, que se usa a través del objeto "teclado"
		
		System.out.println( " Tu color favorito es el " + respuestaColor);//imprimir respuesta del usuario
		
		String preguntaEdad="¿Cuál es tu edad?";
		System.out.println(preguntaEdad);
		String respuestaEdad=teclado.nextLine();
		
		int edad = Integer.parseInt(respuestaEdad);//Queremos guardad una nueva variable de tipo entero nombrada "edad"
												   //la cadena que hemos recibido del usuario en "respuesta 2"
		
		System.out.println("Dentro de 10 años tu edad sera: "+(edad+10));
		
		teclado.close(); //hay que cerrarlo al terminar de usar la variable que hemos iniciado, en este caso, en la línea 14
		

		

	}

}
