package Productoej2HS.pojo;

public class ProductoHS {
	
	private String nombre;
	private int cantidad;
	
	public ProductoHS(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "***Producto***"
				+ "\nNombre: " + nombre
				+ "\nCantidad: " + cantidad;
	}


	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
	boolean iguales = false;
	 
	if (nombre.equals(((ProductoHS)obj).nombre) && cantidad == ((ProductoHS)obj).cantidad) { //si coinciden nombre y cantidad, los consideramos iguales
		iguales = true;
	}
	return iguales;
	}
	
	@Override
	public int hashCode() {
	int hCode = nombre.hashCode() + Integer.valueOf(cantidad).hashCode();
	return hCode;
	}
	
}
