package pruebas.herencia.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TPReloj extends TareaPeriodica {
	
	/*public TPReloj() {
		periodo= 30;
		actualizarUltEjec();
	}*/
	
	
	
	public String leerHora() {
		Calendar cal = new GregorianCalendar();
		return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE)+":" + cal.get(Calendar.SECOND);
	}

	public TPReloj() {
		super(10);
	}
	
	@Override
	public void ejecutarTarea() {
		System.out.println(leerHora());
	}
	
	
}
