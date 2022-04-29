package dam.pruebas.string;

import java.util.StringTokenizer;

public class PruebasStringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Uno dos tres perico de los palotes");//si detras ponemos,"de" nos contaria desde que tiene una d y e
		
		System.out.println("El StringTokenizer st tiene "+ st.countTokens()+" elementos.");//te cuenta las palabras(elementos) que tiene
																							//sin contar los espacios
		String s;
		while (st.hasMoreTokens()) {
			s=st.nextToken();
			System.out.println("El token "+s+" tiene"+s.length()+" carateres"); //cuando te da el next token el elemento ya desaparece. 
												                           //si lo quisisesemos volver a utilizar tendríamos que almacenarlo como aquí hacemos
			
			//utilizar dos veces el next token en la misma dirección da error
			System.out.println("El token "+st.nextToken()+" tiene"+st.nextToken().length()+" caracteres");
			
			}


	}

}
