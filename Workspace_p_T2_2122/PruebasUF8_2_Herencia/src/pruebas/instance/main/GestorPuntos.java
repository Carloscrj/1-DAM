package pruebas.instance.main;

import pruebas.instance.model.Punto2D;
import pruebas.instance.model.Punto3D;

public class GestorPuntos {

	public static void main(String[] args) {
		 Punto2D p2D= new Punto2D(1,2);
		 Punto3D p3D= new Punto3D(3,4,5);
		 
		 if (p2D instanceof Punto3D) {
			System.out.println("p2D es un punto 3D");
		} else {
			System.out.println("punto 2D no es un punto 3D");
		}
		 
		 if (p3D instanceof Punto2D) {
			System.out.println("p3D es un punto 2D");
		} else {
			System.out.println("p3D no es un punto 2D");
		}

	}

}
