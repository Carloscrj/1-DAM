package dam.emp.model;

import java.util.ArrayList;


public class Empresa {
	private ArrayList<Empleado> listaEmpleados;
	private String nombre;
	
	public Empresa(String nombre) {
		
		this.nombre = nombre;
		listaEmpleados = new ArrayList<Empleado>();
	}
	
	public void addEmpleado(Empleado empleado) {// creao un metoda para añadir empleados
		listaEmpleados.add(empleado);
	}
	
	
	public double calcularTotalSalarios() {
		double totalSalario=0;
		
		
		for (Empleado empleado : listaEmpleados) {
			
			if (empleado instanceof EmpleadoProduccion) {
				if (((EmpleadoProduccion)empleado).getTurno().equalsIgnoreCase("NOCHE")) {
					totalSalario += ((EmpleadoProduccion) empleado).getPlusNoct();
				}
			}
			totalSalario += empleado.getSalario();
		}
		
		
		return totalSalario;
	}

	@Override
	public String toString() {
		String empresa=  "Nombre de la empresa=" + nombre;
		
		for (Empleado empleado : listaEmpleados) {
			empresa+= "\n" + empleado;
		}
		return empresa;
	}
	

	 
}
