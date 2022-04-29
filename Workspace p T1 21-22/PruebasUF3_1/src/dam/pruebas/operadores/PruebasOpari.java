package dam.pruebas.operadores;

public class PruebasOpari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracion e inicializacion de la variable primitiva local de tipo int n1
		int n1 = 2;
		//declaración de la variable primitiva y local de tipo int n2
		int n2 = 0;
		System.out.println(" n1 = " + n2);
		
		//asignar a la variable n2 el resultado de multiplicar n1 por n1
		n2 = n1 * n1; // n2=4
		System.out.println("n2 = n1 * n1 = " + n2);
		
		//como n2 ya tiene valor lo podemos usar en la operación
		//asignar a n2 el resultado de restarle a n2 n1
		n2 = n2-n1; // n2=2
		System.out.println("n2 = n2 - n1=" + n2);
		
		n2 = n2+n1+15; // n2=19
		System.out.println("n2 = n2+n1+15= " + n2);

		n2 = n2/n1; // n2=9
		System.out.println("n2 = n2+n1+15=" + n2);
		n2 = n2%n1; // n2=1
		System.out.println("n2 = n2+n1+15=" + n2);
		
	}

}
