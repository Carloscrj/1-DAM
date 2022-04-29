package dam.ej9;

import java.util.Scanner;

public class Ejercicio9 {

	
		    public static void main(String[] args) {
		       Scanner teclado = new Scanner(System.in);
		       
		        System.out.print("Dime un número: ");
		        int num= Integer.parseInt(teclado.nextLine());

		        boolean esPrimo;
		        esPrimo = comprobarPrimo(num);
		        
		        
		        int invertido=0;
		        
		        esOmirp(num, esPrimo, invertido);

		       teclado.close();
		    }



			private static void esOmirp(int num, boolean esPrimo, int invertido) {
				int resto;
				if (esPrimo) {
					System.out.println("El numero "+num+" es primo.");
		        	 while( num > 0 ) {
				            resto = num % 10;
				            invertido = invertido * 10 + resto;
				            num /= 10;
				        }
		        	 
		        	 System.out.println("El número invertido es "+invertido+".");
		        	 
		        	 if (comprobarPrimo(invertido)){
		        		 
		        		 System.out.println("El número "+invertido+" es primo.");
		        		 System.out.println("¿Es el número inicial, un número Omirp?: "+esPrimo+".");
		        		 
		        	 } else {
		        		 
		        		 System.out.println("El número "+invertido+" no es primo, por lo tanto el número inicial no es Omirp.");
		        	 }
		  
		        	} else {
		        		
		            System.out.println("El número "+num+" no es primo, por lo tanto no es Omirp.");
		            
		        	}
			} 
		       
		   

		    private static boolean comprobarPrimo(int n) {
		        boolean esPrimo = true;
		        for (int i = 2; i <= n/2; i++) {
		            if (n % i == 0) {
		                esPrimo = false;
		                i = n;
		            }
		        }
		        return esPrimo;
		    }
		    
		    
		      
		        
		    }
		
		//Realiza una clase MiNumero con un método llamado esOmirp que diga si un número es Omirp o no.
		//Un número es Omirp si es número primo y, además, al invertir sus dígitos da otro número primo.
		//Por ejemplo: 7951 y 1597/

		
