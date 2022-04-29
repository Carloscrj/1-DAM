package dam.ej2.pojo;

public class Festival {
	private String nombre;
	private String ciudad;
	private String cartel;
	private int mes;
	public Festival(String nombre, String ciudad, String cartel, int mes) {
		
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.cartel = cartel;
		this.mes = mes;
	}
	
	
	public String toString() {
		return "Festival [nombre=" + nombre + ", ciudad=" + ciudad + ", cartel=" + cartel + ", mes=" + mes + "]";
	}

	public int getMes() {
		return mes;
	}
	
	
	
}
