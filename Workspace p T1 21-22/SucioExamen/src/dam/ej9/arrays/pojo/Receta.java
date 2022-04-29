package dam.ej9.arrays.pojo;

public class Receta {
	private String nombre;
	private String dificultad;
	private int minutos;
	
	public Receta(String nombre, String dificultad, int minutos) {
		
		this.nombre = nombre;
		this.dificultad = dificultad;
		this.minutos = minutos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDificultad() {
		return dificultad;
	}

	public int getMinutos() {
		return minutos;
	}

	@Override
	public String toString() {
		return "Receta [nombre=" + nombre + ", dificultad=" + dificultad + ", minutos=" + minutos + "]";
	}
	
	
	
	

}
