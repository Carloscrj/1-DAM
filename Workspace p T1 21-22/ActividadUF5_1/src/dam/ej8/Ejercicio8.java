package dam.ej8;

import java.util.Scanner;

public class Ejercicio8 { //Esta es nuestra forma de hacerlo que vale solo para cuatro digitos
	public static final int DIGITOS_ANIO=4;
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

	        int digito;
	        int divEntera;
	        int sumaDigito = 0;

	        for (int i = 0; i < DIGITOS_ANIO; i++) {
	            digito = sumaDiaMesAnio%10;
	            System.out.println(digito);
	            divEntera = sumaDiaMesAnio/10;
	            sumaDiaMesAnio=divEntera;
	            sumaDigito+=digito;
	        } 
	        System.out.println(sumaDigito);

	        int digito2;
	        int divEntera2;
	        int sumaDigito2 = 0;
	        

	        if (sumaDigito>=10) {
	            for (int i = 0; i < 2; i++) {
	                digito2 = sumaDigito%10;
	                System.out.println(digito2);
	                divEntera2 = sumaDigito/10;
	                sumaDigito=divEntera2;
	                sumaDigito2+=digito2;
	            }

	        }
	        System.out.println("Tu número de la suerte es: "+sumaDigito2);

	        sc.close();
	    }

	}