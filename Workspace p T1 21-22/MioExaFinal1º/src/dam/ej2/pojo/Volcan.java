package dam.ej2.pojo;

public class Volcan {
	private String nombre;
	private String pais;
	private String estado;
	private int inicio;
	private int fin;
	
	public Volcan(String nombre, String pais, String estado, int inicio, int fin) {
		
		this.nombre = nombre;
		this.pais = pais;
		this.estado = estado;
		this.inicio = inicio;
		this.fin = fin;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public String getPais() {
		return pais;
	}



	public String getEstado() {
		return estado;
	}



	public int getInicio() {
		return inicio;
	}



	public int getFin() {
		return fin;
	}



	@Override
	public String toString() {
		return "Volcan [nombre=" + nombre + ", pais=" + pais + ", estado=" + estado + ", inicio=" + inicio + ", fin="
				+ fin + "]";
	}



	public int getActividadContinuada() {
		int yearActual= 2021;
		int yearactividad= 0;
		
		if (estado.equals("ACTIVO")) {
			yearactividad= yearActual-inicio;
			
		} else if (estado.equals("INACTIVO")) {
			yearactividad= fin-inicio;
		}
		
		return yearactividad;
		
	}
	
	
	public int getTiempoInactivo() {
		int yearactual1= 2021;
		int yearinactivo= 0;
		
		if(estado.contentEquals("INACTIVO")) {
			
			yearinactivo= yearactual1-fin;
		}
		
		return yearinactivo;
	}
	
}


