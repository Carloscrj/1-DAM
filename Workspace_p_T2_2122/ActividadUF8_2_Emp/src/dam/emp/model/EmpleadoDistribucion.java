package dam.emp.model;

public class EmpleadoDistribucion extends Empleado {
	
	private String zona;

	public EmpleadoDistribucion(String nombre, String dni, double salario, String zona) {
		super(nombre, dni, salario);
		this.zona=zona;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n -Empleado de distribución cuya zona es " + zona + ".";
	}
	
	
	
	
}
