package dam.emp.model;

public class EmpleadoProduccion extends Empleado {
	private String turno;
	private double plusNoct;
	
	public EmpleadoProduccion(String nombre, String dni, double salario, String turno, double plusNoct) {
		super(nombre, dni, salario);
		this.turno=turno;
		this.plusNoct=plusNoct;
	}

	public double getPlusNoct() {
		return plusNoct;
	}
	
	public String getTurno() {
		return turno;
	}

	@Override
	public String toString() {
		if(turno.equalsIgnoreCase("MAÑANA")|| turno.equalsIgnoreCase("TARDE")){
			return super.toString()+"\n -Empleado de Produccion con turno de " + turno +".";
		}
		return super.toString()+"\n -Empleado de Produccion con turno de " + turno + " y plus de nocturnidad de " + plusNoct + ".";
	}

	

	

	
	
	
	
	
}
