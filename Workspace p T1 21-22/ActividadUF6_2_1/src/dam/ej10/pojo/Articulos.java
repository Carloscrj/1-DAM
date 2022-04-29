package dam.ej10.pojo;

public class Articulos {
	private int precio;
	private String nombre;
	
	public Articulos(int precio, String nombre) {
	
		this.precio = precio;
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "El precio del artículo es: " + precio + " y el nombre del artículo es: " + nombre;
	}

	
	
	
	
	
	
}
