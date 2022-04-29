package dam.biblioteca.model;

public class CDAudio extends CD {
	private int nunCanciones;

	public CDAudio(int totalEjem, int numEjemPrest, String nombre, double duracion, int nunCanciones) {
		super(totalEjem, numEjemPrest, nombre, duracion);
		this.nunCanciones = nunCanciones;
	}

	@Override
	public String toString() {
		return super.toString()+" -Tipo: CDAudio, -N�mero de canciones:" + nunCanciones + ".";
	}
	
	
	
	
}
