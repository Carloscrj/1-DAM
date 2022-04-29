package dam.estudio.art.model;

public class Estancia {
	public static final String [] ESTANCIAS = {"HALL", "COCINA", "SALÓN", "HABITACIÓN","BAÑO"};
	protected String nombre;
	protected double m2;
	protected int numPuertas;
	protected int numVentanas;
	
	public Estancia(String nombre, double m2, int numPuertas, int numVentanas) {
		this.nombre = nombre;
		this.m2 = m2;
		this.numPuertas = numPuertas;
		this.numVentanas = numVentanas;
	}

	public double getM2() {
		return m2;
	}

	@Override
	public String toString() {
		return "Estancia " + nombre + ", " + m2 + "m2, numPuertas " + numPuertas + "y numero de ventanas"
				+ numVentanas;
	}

	
	
	
	
	
}
