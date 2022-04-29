package dam.estudio.art.model;

public class Cocina extends Estancia {
	
	private boolean tendedero;
	private double m2Tend;
	
	public Cocina(String nombre, double m2, int numPuertas, int numVentanas, boolean tendedero, double m2Tend) {
		super(nombre, m2, numPuertas, numVentanas);
		this.tendedero = tendedero;
		this.m2Tend = m2Tend;
	}

	public boolean isTendedero() {//este es el get de tendedero que lo saca el constructor
		return tendedero;
	}

	public double getM2Tend() {
		return m2Tend;
	}

	@Override
	public String toString() {
		return super.toString()+traducirTendedero()+"\n tendedero " + m2Tend + "m2";
	}

	private String traducirTendedero() {
		return "\n¿Tiene tendedero?"+ (tendedero? "SI":"NO");
	}
	
	
}
