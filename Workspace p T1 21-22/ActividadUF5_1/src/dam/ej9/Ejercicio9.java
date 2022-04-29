package dam.ej9;

import java.util.Scanner;

public class Ejercicio9 {

	
		    public static void main(String[] args) {
		       Scanner teclado = new Scanner(System.in);
		       
		        System.out.print("Dime un n�mero: ");
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
		        	 
		        	 System.out.println("El n�mero invertido es "+invertido+".");
		        	 
		        	 if (comprobarPrimo(invertido)){
		        		 
		        		 System.out.println("El n�mero "+invertido+" es primo.");
		        		 System.out.println("�Es el n�mero inicial, un n�mero Omirp?: "+esPrimo+".");
		        		 
		        	 } else {
		        		 
		        		 System.out.println("El n�mero "+invertido+" no es primo, por lo tanto el n�mero inicial no es Omirp.");
		        	 }
		  
		        	} else {
		        		
		            System.out.println("El n�mero "+num+" no es primo, por lo tanto no es Omirp.");
		            
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
		
		//Realiza una clase MiNumero con un m�todo llamado esOmirp que diga si un n�mero es Omirp o no.
		//Un n�mero es Omirp si es n�mero primo y, adem�s, al invertir sus d�gitos da otro n�mero primo.
		//Por ejemplo: 7951 y 1597/

		
