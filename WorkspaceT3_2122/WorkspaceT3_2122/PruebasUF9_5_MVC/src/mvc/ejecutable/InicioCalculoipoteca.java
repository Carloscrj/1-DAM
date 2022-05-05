package mvc.ejecutable;

import java.awt.EventQueue;

import mvc.control.ControladorHipoteca;
import mvc.view.VCalculoHipoteca;

public class InicioCalculoipoteca {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VCalculoHipoteca ventana = new VCalculoHipoteca();
				ControladorHipoteca controlador = new ControladorHipoteca(ventana);
				
				ventana.setControlador(controlador);
				ventana.hacerVisible();
			}
		});
	}

}
