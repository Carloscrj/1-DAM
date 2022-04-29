package dam.ep.model;

public class CDDatos extends CD {
	private String identificador;
	private String tipoDeDatos;
	
	public CDDatos(int capacidadMB, String tipo, String identificador, String tipoDeDatos) {
		super(capacidadMB, tipo);
		this.identificador = identificador;
		this.tipoDeDatos = tipoDeDatos;
	}

	@Override
	public String toString() {
		return "CDDatos [identificador=" + identificador + ", tipoDeDatos=" + tipoDeDatos + "]";
	}
	
	
	
}
