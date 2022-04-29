package dam.ej8;

import java.util.Scanner;

public class Ejercicio8Pilar {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu día de nacimiento: ");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.print("Dime tu mes de nacimiento: ");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.print("Dime tu año de nacimiento: ");
        int anio = Integer.parseInt(sc.nextLine());

        int sumaDiaMesAnio = dia+mes+anio;
        System.out.println(sumaDiaMesAnio);

        int cociente;

        while (sumaDiaMesAnio >= 10) { //bucle para entrar en el año
            cociente=sumaDiaMesAnio; //le damos a cociente el valor de la suma 
            sumaDiaMesAnio = 0;

            while (cociente>0) {
                sumaDiaMesAnio+=cociente%10;
                cociente=cociente/10;        //Te hace las operaciones hasta que el cociente es mayor que 0,
            }                                //Cuando se pone a 0 o menos salta al primer while
        }

        System.out.println("Tu número de la suerte es: "+sumaDiaMesAnio);


        sc.close();

    }
	
}




//Se desea conocer el lucky number (número  de  la  suerte) de cualquier persona.
//El número de la suerte se consigue reduciendo la fecha de nacimiento a un número de un solo dígito.
//Por ejemplo, la fecha de nacimiento de María es la siguiente:
//16-08-1973 -> 16+8+1973 = 1997
//1997->1+9+9+7 = 26
//26-> 2+6=8
//El número de la suerte de María sería el 8/*





