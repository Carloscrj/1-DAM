package pruebas.model;

public class PersonaHS {
	
	private String nombre;
	private int edad;
	
	public PersonaHS(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}

	public String toString() {
		return "PersonaHS [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	//metodo para evitar meter dos personas que se llamen igual y tengan el mismo nombre
	public boolean equals(Object obj) {
		boolean iguales= false;
		
		if(nombre.equals(((PersonaHS)obj).nombre)&& edad== ((PersonaHS)obj).edad) {
			iguales= true;
		}
		return iguales;
	}
	
	
	public int hashCode() {
		int hashCode= nombre.hashCode()+ edad;
		
		return hashCode;
	}

}
