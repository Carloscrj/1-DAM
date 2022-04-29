package dam.ep.model;

public class CDSoftware extends CD {
	private String identificador;
	//private ArrayList<String> listaAplicaciones;
	
	public CDSoftware(int capacidadMB, String tipo, String identificador) {
		super(capacidadMB, tipo);
		this.identificador = identificador;
		
	}

	@Override
	public String toString() {
		return super.toString()+"CDSoftware [identificador=" + identificador + "]";
	}

	

	
	
	
	
	
	
	
}
