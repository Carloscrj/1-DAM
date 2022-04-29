package dam.ep.model;

public class CD {
	public static final String [] CDs = {"CDAudio", "CDMp3", "CDsoftware", "CDDatos"};
	private int capacidadMB;
	private String tipo;
	
	public CD(int capacidadMB, String tipo) {
		this.capacidadMB = capacidadMB;
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "CD [capacidadMB=" + capacidadMB + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
