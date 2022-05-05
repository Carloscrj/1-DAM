package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.Hipoteca;
import mvc.view.VCalculoHipoteca;

public class ControladorHipoteca implements ActionListener {
	
	VCalculoHipoteca ventana;

	public ControladorHipoteca(VCalculoHipoteca ventana) {
		this.ventana = ventana;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Hipoteca hipoteca = ventana.obtenerHipoteca();
		
		if (hipoteca != null) {
			hipoteca.calcularCuotaMes(); //llamamos al método que hemos creado en el Pojo para crear el cálculo de la hipoteca
			ventana.mostrarResultado(hipoteca.calcularCuotaMes());
		}
	}

}
