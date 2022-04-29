package dam.estudio.art.model;

public class Banio extends Estancia {
	
	private boolean banera;
	private boolean ducha;
	
	public Banio(String nombre, double m2, int numPuertas, int numVentanas, boolean banera, boolean ducha) {
		super(nombre, m2, numPuertas, numVentanas);
		this.banera = banera;
		this.ducha = ducha;
	}

	@Override
	public String toString() {
		return super.toString()+ "¿El baño tiene bañera? " + banera + "¿Tiene ducha? " + ducha + ".";
	}
	

}
