package mcv.ejecutable;

import java.awt.EventQueue;
import mvc.control.ControladorRecetario;
import mvc.modelo.ListaRecetas;
import mvc.view.PanelConsultar;
import mvc.view.PanelIntroducir;
import mvc.view.VRecetario;



public class InicioRecetario {

	public static void main(String[] args) {
		
	EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VRecetario ventana = new VRecetario(); //para crear la ventana necesitamos los datos por par?metro
				PanelIntroducir poIntroducir = new PanelIntroducir(); //tambi?n creamos los objetos de las nuevas ventanas creadas
				PanelConsultar poConsultar = new PanelConsultar();
				ListaRecetas liRecetas= new ListaRecetas();
				ControladorRecetario controlador = new ControladorRecetario(ventana,poIntroducir,poConsultar, liRecetas); //a?adimos las 3 ventanas al controlador
				
				ventana.setControlador(controlador);
				poIntroducir.setControlador(controlador);
				poConsultar.setControlador(controlador);
				
				ventana.hacerVisible();
			}
		});
	}
	
}
	

