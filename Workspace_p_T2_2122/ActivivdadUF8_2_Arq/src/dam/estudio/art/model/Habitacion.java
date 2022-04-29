package dam.estudio.art.model;

public class Habitacion extends Estancia {
	
	private int numPuertasArm;
	private boolean accesoBanio;
	
	public Habitacion(String nombre, double m2, int numPuertas, int numVentanas, int numPuertasArm,
			boolean accesoBanio) {
		super(nombre, m2, numPuertas, numVentanas);
		this.numPuertasArm = numPuertasArm;
		this.accesoBanio = accesoBanio;
	}

	@Override
	public String toString() {
		return super.toString()+ "La habitación tiene " + numPuertasArm + " puertas. ¿Tiene acceso a baño? " + accesoBanio + ".";
	}
	

}
