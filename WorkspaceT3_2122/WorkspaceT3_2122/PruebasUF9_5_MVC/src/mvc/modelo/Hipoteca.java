package mvc.modelo;

public class Hipoteca {
	
	private int cantidad;
	private int anios;
	private double interes;
	
	
	public Hipoteca(int cantidad, int anios, double interes) {
		this.cantidad = cantidad;
		this.anios = anios;
		this.interes = interes;
	}
	
	
	public double calcularCuotaMes() {
		//Cálculo de la cuota:
		return (cantidad * (interes/12)) / (100 * (1 - Math.pow((1 + (interes/1200)), -(anios*12))));

	}
	
}
