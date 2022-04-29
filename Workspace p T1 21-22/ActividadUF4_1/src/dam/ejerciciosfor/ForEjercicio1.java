package dam.ejerciciosfor;


public class ForEjercicio1 {
	
	static int tabla = 7;//se hace nada más nombrar la clase(la variable estática) antes del public o private porque pertenece a la clase.

	public static void main(String[] args) {
		
		System.out.println("La tabla del 7 es:");
		
		
		int resultado;
		
		
		for(int cont =0; cont <= 10; cont++) {
			resultado = tabla*cont;
			System.out.println("7*"+cont+"="+resultado);
		}
	}

}
