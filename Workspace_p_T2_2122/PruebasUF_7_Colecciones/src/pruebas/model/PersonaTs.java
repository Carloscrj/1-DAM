package pruebas.model;

public class PersonaTs implements Comparable<PersonaTs> {
	
	private String nombre;
	private int edad;
	
	public PersonaTs(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}

	public String toString() {
		return "PersonaTS [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(PersonaTs p) {
		int result= 0;
		
		result =nombre.compareTo(p.nombre);
		
		if(result==0) { //esto lo hacemos por si los nombres son iguales los comparamos con la edad, si result es igual a 0 son iguales
			
			result = edad-p.edad;
		}
		return result;
	}
	
	
	

}
