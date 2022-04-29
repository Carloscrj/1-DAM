package dam.ep.model;

public class CDMp3 extends CD {
	private String nombre;
	private int numCanciones;
	
	public CDMp3(int capacidadMB, String tipo, String nombre, int numCanciones) {
		super(capacidadMB, tipo);
		this.nombre = nombre;
		this.numCanciones = numCanciones;
	}

	@Override
	public String toString() {
		return super.toString()+"CDMp3 [nombre=" + nombre + ", numCanciones=" + numCanciones + "]";
	}
	
	
	
}
