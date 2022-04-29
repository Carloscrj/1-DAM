package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.view.VSalario;

public class SalarioControlador implements ActionListener {
	static final int JORNADA=40;
	static final int SAL_HORA=16;
	static final int SAL_HORA_EXTRA=20;
	
	VSalario ventana;
	
	public SalarioControlador(VSalario ventana) {
		
		this.ventana= ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		double horas = ventana.obtenerDatos();
		double salario=0;
		String respuesta="";
		
		if (horas>0) {
			
			//String numero = String.valueOf(capicua);
		
				if (horas<=JORNADA) {   //
					salario=horas*SAL_HORA;
					respuesta= "El salario es "+salario+".";
				}else {
					salario=(JORNADA*SAL_HORA)+((horas-JORNADA)*SAL_HORA_EXTRA);
					respuesta= "El salario es "+salario+".";
				}
			
			ventana.mostrarResultado(respuesta);
			
		}
	}

}
