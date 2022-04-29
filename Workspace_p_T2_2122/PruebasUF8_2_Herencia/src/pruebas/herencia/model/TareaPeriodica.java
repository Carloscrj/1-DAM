package pruebas.herencia.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TareaPeriodica {
	protected int periodo;
	protected Date ultimaEjec;
	
	public TareaPeriodica(int periodo, Date ultimaEjec) {
		this.periodo = periodo;
		this.ultimaEjec = ultimaEjec;
	}
	
	public TareaPeriodica() {
		periodo= 1;
		actualizarUltEjec();
	}
	public TareaPeriodica(int periodo) {
		this.periodo= periodo;
		actualizarUltEjec();
	}

	protected void actualizarUltEjec() {
		ultimaEjec = new Date();
	}
	
	public void ejecutarTarea() {
		System.out.println("EJECUTANDO TAREA PERIODICA");
	}
	
	public boolean necesitaEjecucion(){
		// Calcular la hora de la próxima ejecución
		Calendar calProximaEj = new GregorianCalendar();
		calProximaEj.setTime(ultimaEjec);
		calProximaEj.add(Calendar.SECOND, periodo);

		Calendar calAhora= new GregorianCalendar();

		// Comprobar si ha pasado a la hora actual
		return (calProximaEj.before(calAhora));
	}
	
	
}
