package dam.ej1;

import java.util.Scanner;

public class Telesilla {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contPeso= 0;
		int contPersonas= 0;
		
	
		for (int i=0; i<15; i++) { //vamos a contabilizar para 15 personas en la fila
			System.out.println("Introduzca su peso");
			int peso = Integer.parseInt(teclado.nextLine());
			contPeso+=peso; //vamos a sumar el peso de las personas que suben
			contPersonas++; //y las contamos
			
			if(contPeso>150 || contPersonas==4) { //condicion para que el telesilla salga
				System.out.println("El telesilla debe salir");
				contPeso=0;
				contPersonas=0; //como ya ha salido el telesilla y viene el otro, reiniciamos a 0 las personas y el peso
			}else {
				if(i==14) { //la última ppersona, no podra subir si se acaba de cumplir la condición del if anterior
					System.out.println("El telesilla no puede salir");
				} else {
					System.out.println("Debe subir otra persona");
				}
			}
			
			
		}
		
		
	
		
		teclado.close();
		
	}

	
	
	
}
	
	
