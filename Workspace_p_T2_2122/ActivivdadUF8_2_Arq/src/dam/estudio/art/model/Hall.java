package dam.estudio.art.model;

public class Hall extends Estancia {
	
	private boolean puertaBlind;

	public Hall(String nombre, double m2, int numPuertas, int numVentanas, boolean puertaBlind) {
		super(nombre, m2, numPuertas, numVentanas);
		this.puertaBlind = puertaBlind;
	}

	@Override
	public String toString() {
		String hall= super.toString()+ traducirPuertaBlindada();
		return hall;
	}

	public String traducirPuertaBlindada() {
		return "\n ¿Tiene puerta blindada? "+(puertaBlind? "SI":"NO");
	}
	
	

}
