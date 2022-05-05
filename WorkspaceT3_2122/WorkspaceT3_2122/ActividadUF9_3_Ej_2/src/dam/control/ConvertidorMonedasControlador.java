package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.view.VConvertidorDeMonedas;


public class ConvertidorMonedasControlador implements ActionListener {
	VConvertidorDeMonedas ventana;
	
	public ConvertidorMonedasControlador(VConvertidorDeMonedas ventana) {
		
		this.ventana= ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		double dolar = ventana.obtenerDatos();
		
		if (dolar>=0) {
			double euro = dolar*0.91;
			
			String resultado = String.valueOf(euro);
			
			ventana.mostrarResultado(resultado);
			
		}
		

	}

}
