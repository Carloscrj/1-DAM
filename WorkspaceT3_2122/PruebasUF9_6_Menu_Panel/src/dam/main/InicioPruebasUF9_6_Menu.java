package dam.main;

import java.awt.EventQueue;

import dam.control.PruebasUF9_6Controlador;
import dam.model.FuenteDatos;
import dam.view.PanelOpcion11;
import dam.view.PanelOpcion12;
import dam.view.VPruebasUF9_6;

public class InicioPruebasUF9_6_Menu {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPruebasUF9_6 ventana = new VPruebasUF9_6(); //para crear la ventana necesitamos los datos por parámetro
				PanelOpcion11 po11 = new PanelOpcion11(); //también creamos los objetos de las nuevas ventanas creadas
				PanelOpcion12 po12 = new PanelOpcion12();
				
				PruebasUF9_6Controlador controlador = new PruebasUF9_6Controlador(ventana, po11, po12); //añadimos las 3 ventanas al controlador
				
				ventana.setControlador(controlador);
				ventana.hacerVisible();
			}
		});
	}

}
