package dam.pruebas.operadores;

public class PruebasOPlog {

	public static void main(String[] args) {
		
		int m= 2, n= 5;
		boolean res;
		System.out.println("m= " +m+ "n=" +n);
		
		res =m > n && m >= n; 	//res=false
		System.out.println("res =m > n && m >= n" + res);
		
		res =!(m < n || m != n); 	//res=false
		System.out.println("res =!(m < n || m != n)" + res);
		
		
		/* 		A	B		A%B
		 * &&  true true-> true
		 * &&  true false-> false
		 * && false true-> false
		 * && false false-> false
		 */
		
		
		/*		A    B		A|B
		 * ||  true false   true
		 * ||  true false   true
		 * || false true    true
		 * || false false   false
		 */
		
		/*		A     !A
		 *   !true -> false
		 * ! fals -> tru
		 */

		
		

	}

}
