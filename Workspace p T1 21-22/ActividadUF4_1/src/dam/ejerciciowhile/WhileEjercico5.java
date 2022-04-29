package dam.ejerciciowhile;

import java.util.Scanner;

public class WhileEjercico5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Introduzca un número");
		 int numero= Integer.parseInt(teclado.nextLine());
		 
		 int cont = 1;
		 
		 
		 while(numero>=cont) {
			 if (numero%cont==0) {
				 System.out.println("Es divisible "+cont);
			cont = cont+1;          
			 }else {                        //lo había hecho antes así en vez de else a secas    }else if (numero/cont!=0){
				 cont = cont+1;             // esta bien pero con el else a secas vale              cont=cont+1;
			 }                              //                                                  }                         
				  
		 }
	
		 teclado.close();
	
	}
	
	
	}
