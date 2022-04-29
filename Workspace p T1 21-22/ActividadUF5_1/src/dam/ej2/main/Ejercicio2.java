package dam.ej2.main;

import dam.ej2.pojo.Clase2;

public class Ejercicio2 {

	public static void main(String[] args) {
		Clase2 obj1= new Clase2(5,4);
		System.out.println(obj1.modificar(4)+"");
		
		Clase2 obj2= new Clase2(5,4);
		System.out.println(obj2.modificar(5)+"");
		
		obj2= obj1;
		System.out.println(obj2.modificar(5)+"");
	}

}
