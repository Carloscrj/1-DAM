package dam.ejerciciosfor;

public class ForEjercicio3 {

	public static void main(String[] args) {
		long mult = 1;
		for(int cont = 1; cont <= 50; cont++) {
			mult = mult * cont;
		}
		System.out.println("El producto de los 50 primeros numeros es "+mult);//Esta bien aunque el resultado de raro
	}

}
