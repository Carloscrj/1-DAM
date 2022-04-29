package dam.emp.model;

public class Empleado {
	public static final String [] EMPLEADOS = {"PRODUCCIÓN", "DISTRIBUCIÓN"};
	protected String nombre;
	protected String dni;
	protected double salario;
	
	public Empleado(String nombre, String dni, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "\n -Nombre del empleado:" + nombre + "\n -dni:" + dni + "\n -Salario=" + salario;
	}

	
	
	
	
	
}
