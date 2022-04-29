package dam.ej2.pojo;

public class Lugar {
	private String ciudad;
	private String pais;
	private int prioridad;
	private String motivo;
	
	public Lugar(String ciudad, String pais, int prioridad, String motivo) {
		this.ciudad = ciudad;
		this.pais = pais;
		this.prioridad = prioridad;
		this.motivo = motivo;
	}

	
	public String toString() {
		return "Lugar [ciudad=" + ciudad + ", pais=" + pais + ", prioridad=" + prioridad + ", motivo=" + motivo + "]";
	}


	public String getCiudad() {
		return ciudad;
	}



	public int getPrioridad() {
		return prioridad;
	}


	public String getPais() {
		return pais;
	}
	
	
	
}
