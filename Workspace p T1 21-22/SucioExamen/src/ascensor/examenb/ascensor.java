package ascensor.examenb;

import java.util.Scanner;

public class ascensor {

	public static void main(String[] args) {
		
		
				Scanner sc = new Scanner(System.in);
				
				double peso;
				int contPers=0;
				double sumaPeso=0;
				
				for (int i = 1; i <= 14; i++) {
					System.out.println("Introduce el peso de la "+i+" persona");
					peso = Double.parseDouble(sc.nextLine());
					sumaPeso+=peso;
					
					if (sumaPeso<500 && contPers<6) { //tienen que cumplirse las 2 condiciones para que pueda entrar al ascensor
						System.out.println("Puede entrar en el ascensor");
						contPers++; //si las cumple, sube
					} else {
						System.out.println("El ascensor está lleno, ya han subido "+contPers+" personas y suman "+(sumaPeso-peso)+" kg");
						System.out.println("Debe esperar al siguiente");
						contPers=1; //el que no ha podido subir, sube en el siguiente
						sumaPeso=0;
						sumaPeso+=peso; //teniendo en cuenta ya su peso para la próxima iteración
					}
				}
				System.out.println("En el último ascensor han subido "+contPers+" personas y suman "+sumaPeso+" kg");
				
				sc.close();
			}

		
		/*En un edificio hay 14 personas esperando en fila el ascensor, en el ascensor caben hasta 6 personas o un máximo 500 kg de peso.
		Se debe solicitar el peso de las 14 personas que están esperando y a cada persona, antes de subir al ascensor,
		indicarle si “Puede entrar en el ascensor” o “Debe esperar al siguiente”. 
		(A la persona a la que se le dice que Debe esperar al siguiente se supone que entra directamente al siguiente ascensor)
		Tras la última persona se informará de cuántas personas y cuánto peso sumaban en el último ascensor. 
		*/

	}


