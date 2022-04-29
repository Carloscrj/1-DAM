package dam.model;

public class Persona {
	private String DNI;
	private String nombre;
	private String apellido;
	private int edad;
	
	
	public Persona(String dNI, String nombre, String apellido, int edad) {
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public String getDNI() {
		return DNI;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public int getEdad() {
		return edad;
	}
	
	//no necesitamos toString
	
	
}
