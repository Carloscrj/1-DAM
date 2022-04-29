package dam.estudio.art.model;

public class Salon extends Estancia {

	private int numPuntosRed;
	private boolean tieneTerraza;
	private double m2Terraza;
	
	public Salon(String nombre, double m2, int numPuertas, int numVentanas, int numPuntosRed, boolean tieneTerraza,
			double m2Terraza) {
		super(nombre, m2, numPuertas, numVentanas);
		this.numPuntosRed = numPuntosRed;
		this.tieneTerraza = tieneTerraza;
		this.m2Terraza = m2Terraza;
	}

	public double getM2Terraza() {
		return m2Terraza;
	}
	
	public boolean isTieneTerraza() {
		return tieneTerraza;
	}
	

	@Override
	public String toString() {
		return super.toString()+",numero de puntos de red: "+numPuntosRed+traducirTerraza()+"\n tendedero " + m2Terraza + "m2";
	}

	
	private String traducirTerraza() {
		return "\n¿Tiene terraza?"+ (tieneTerraza? "SI":"NO");
	}
	

}
