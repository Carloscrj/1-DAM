package dam.pruebas.operadores;

public class PruebasOpReI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=2, n=5;
		boolean res;
		System.out.println(" m= "+m + " y n= "+n); 
		//la variable res no esta inicializada
		
		res = m > n; //res=false
		System.out.println("res = m > n" + res);
		res = m < n; //res=true
		System.out.println("res = m < n" + res);
		res = m < n; //res=false
		System.out.println("res = m < n" + res);
		res = m <= n; //res=true
		System.out.println("res = m <= n" + res);
		res = m == n; //res=false
		System.out.println("res = m == n" + res);
		res = m != n; //res=true
		System.out.println("res = m != n" + res);



	}

}
