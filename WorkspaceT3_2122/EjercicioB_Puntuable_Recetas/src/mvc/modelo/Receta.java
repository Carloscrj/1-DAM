package mvc.modelo;

public class Receta {
	
	public static final String[] DIFICULTAD= {"ALTA", "MEDIA", "BAJA"};
	private String nombre;
	private String descripcion;
	private int tiempoDeEjecucion;
	private String dificultad;
	
	public Receta(String nombre, String descripcion, int tiempoDeEjecucion, String dificultad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tiempoDeEjecucion = tiempoDeEjecucion;
		this.dificultad = dificultad;
	}

	@Override
	public String toString() {
		return "Receta [nombre=" + nombre + ", descripcion=" + descripcion + ", tiempoDeEjecucion=" + tiempoDeEjecucion
				+ ", dificultad=" + dificultad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getTiempoDeEjecucion() {
		return tiempoDeEjecucion;
	}

	public String getDificultad() {
		return dificultad;
	}

	
	
	
}
