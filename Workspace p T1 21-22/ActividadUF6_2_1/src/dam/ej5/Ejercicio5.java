package dam.ej5;

import java.util.Scanner;

public class Ejercicio5 {
	static double [] alturas;
	static Scanner teclado;
	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		System.out.println("¿De cuantas personas quieres introducir la altura?");
		int numPersonas = Integer.parseInt(teclado.nextLine());
		
		
		alturas = new double[numPersonas];
		
		rellenarArray();
		
		mostrarArray();
		
		double media = calcularMedia();
		
		realizarAnaliMedia(media);
	}

	private static void realizarAnaliMedia(double media) {
		int contEnciMedia=0;
		int contDebMedia=0;
		for (int i = 0; i < alturas.length; i++) {
			if(alturas[i]>media) {
				contEnciMedia++;
			}else if(alturas[i]<media){
				contDebMedia++;
			}
		}
		System.out.println("Las personas que están por encima de la media son: "+contEnciMedia);
		System.out.println("Las personas que están por debajo de la media son: "+contDebMedia);
	}

	private static double calcularMedia() {
		double sumaAlturas=0;
	
		for (int i = 0; i < alturas.length; i++) {
			sumaAlturas+=alturas[i];
		}
		return sumaAlturas/alturas.length;
		
		
	}

	
	

	private static void mostrarArray() {
		System.out.print("{"); //estético para empezar con una llave
        
        for (int i = 0; i < alturas.length; i++) { //la longitud del array la coge de la array "enteros"
        	
            if (i != alturas.length-1 ) {
                System.out.print(alturas[i]+", "); //si es la última posición no pongas una coma; es estético
            } else {
                System.out.println(alturas[i]);
            }
        
        
        System.out.print("}"); //estético para finalizar con una llave el array

        }
	}

	private static void rellenarArray() {
		 for (int i = 0; i < alturas.length; i++) {
	            System.out.println("Introduce la altura "+(i+1)+"ª");
	            alturas[i] = Double.parseDouble(teclado.nextLine()); //así asignamos los valores del array

	        }

	        teclado.close();
	}

}
