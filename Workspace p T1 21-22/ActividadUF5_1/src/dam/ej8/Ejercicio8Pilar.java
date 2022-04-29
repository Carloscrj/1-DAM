package dam.ej8;

import java.util.Scanner;

public class Ejercicio8Pilar {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu d�a de nacimiento: ");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.print("Dime tu mes de nacimiento: ");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.print("Dime tu a�o de nacimiento: ");
        int anio = Integer.parseInt(sc.nextLine());

        int sumaDiaMesAnio = dia+mes+anio;
        System.out.println(sumaDiaMesAnio);

        int cociente;

        while (sumaDiaMesAnio >= 10) { //bucle para entrar en el a�o
            cociente=sumaDiaMesAnio; //le damos a cociente el valor de la suma 
            sumaDiaMesAnio = 0;

            while (cociente>0) {
                sumaDiaMesAnio+=cociente%10;
                cociente=cociente/10;        //Te hace las operaciones hasta que el cociente es mayor que 0,
            }                                //Cuando se pone a 0 o menos salta al primer while
        }

        System.out.println("Tu n�mero de la suerte es: "+sumaDiaMesAnio);


        sc.close();

    }
	
}




//Se desea conocer el lucky number (n�mero  de  la  suerte) de cualquier persona.
//El n�mero de la suerte se consigue reduciendo la fecha de nacimiento a un n�mero de un solo d�gito.
//Por ejemplo, la fecha de nacimiento de Mar�a es la siguiente:
//16-08-1973 -> 16+8+1973 = 1997
//1997->1+9+9+7 = 26
//26-> 2+6=8
//El n�mero de la suerte de Mar�a ser�a el 8/*





