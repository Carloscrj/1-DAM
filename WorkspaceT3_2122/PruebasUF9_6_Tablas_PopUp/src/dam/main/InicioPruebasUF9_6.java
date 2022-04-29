package dam.main;

import java.awt.EventQueue;

import dam.control.PruebasUF9_6Controlador;
import dam.model.FuenteDatos;
import dam.view.VPruebasUF9_6;

public class InicioPruebasUF9_6 {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				FuenteDatos datos = new FuenteDatos();
				VPruebasUF9_6 ventana = new VPruebasUF9_6(datos); //para crear la ventana necesitamos los datos por parámetro
				PruebasUF9_6Controlador controlador = new PruebasUF9_6Controlador(ventana);
				
				ventana.setControlador(controlador);
				ventana.hacerVisible();
			}
		});
	}

}
