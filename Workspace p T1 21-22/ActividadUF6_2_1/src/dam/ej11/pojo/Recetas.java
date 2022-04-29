package dam.ej11.pojo;

public class Recetas {
	
	private String nombre;
	private String dificultad;
	private int minutos;
	
	public Recetas(String nombre, String dificultad, int minutos) {
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
		String plato = "\n - Nombre: " + getNombre() + "\n - Dificultad: " + getDificultad()+ "\n - Tiempo: "+getMinutos();
		return plato;
	}

	
	
	
	
	
	

}
