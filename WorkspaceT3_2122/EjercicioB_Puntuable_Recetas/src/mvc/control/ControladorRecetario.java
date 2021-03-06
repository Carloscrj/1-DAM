package mvc.control;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import mvc.modelo.ListaRecetas;
import mvc.modelo.Receta;
import mvc.view.PanelConsultar;
import mvc.view.PanelIntroducir;
import mvc.view.VRecetario;

public class ControladorRecetario implements ActionListener {
	
	VRecetario ventana;
	PanelIntroducir poIntroducir;
	PanelConsultar poConsultar;
	ListaRecetas liRecetas;
	
	

	public ControladorRecetario(VRecetario ventana, PanelIntroducir poIntroducir, PanelConsultar poConsultar, ListaRecetas liRecetas) {
		this.ventana = ventana;
		this.poIntroducir = poIntroducir;
		this.poConsultar = poConsultar;
		this.liRecetas = liRecetas;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JMenuItem) { //Si se hace click en cada uno de los submen?s
			if (e.getActionCommand().equals(VRecetario.MNTN_INTRODUCIR)) {
				ventana.cargarPanel(poIntroducir);
			} else if (e.getActionCommand().equals(VRecetario.MNTN_CONSULTAR)) {
				ventana.cargarPanel(poConsultar);
				poConsultar.hacerVisibleScrp(false); //para hacer invisible el scrollpanel antes de cargar la tabla y quede m?s bonito
			} else if (e.getActionCommand().equals(VRecetario.MNTN_SALIR)) {
				int resp=JOptionPane.showConfirmDialog(ventana,
						"Se va a cerrrar la aplicaci?n, ?Desea continuar?",
						"Confirmar salida",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
						if (resp== JOptionPane.YES_NO_OPTION) {
							System.exit(0);
						}
				//ventana.mostrarMensaje("Se ha pulsado la opci?n 1.3", "Men?");
			} 
		}else if (e.getSource() instanceof JButton) { //si el componente en el que se ha producido el evento es un bot?n
			if (e.getActionCommand().equals(PanelIntroducir.BTN_GUARDAR)) { //as? identifico que se ha seleccionado el bot?n limpiar
				Receta receta = poIntroducir.obtenerReceta(); //almacenamos los datos con este objeto a trav?s del m?todo y despu?s
				liRecetas.nuevaReceta(receta);//a?adimos al ArrayList del pojo ListaEncuestas, una nueva encuesta con los datos obtenido en la l?nea anterior
				if ( receta!= null) {
					poIntroducir.mostrarMensaje("Receta guardada", "Guardar Receta");
					poIntroducir.limpiarRecetas();
				}
				
			} else if (e.getActionCommand().equals(PanelConsultar.BTN_MOST)) {
				poConsultar.rellenarTabla(liRecetas.getListaRecetas()); //rellenamos la table con el arraylist de listaRecetas, lo hemos invocado arriba
				poConsultar.hacerVisibleScrp(true); //para hacer visible el scrollpanel cuando carguemos la tabla para ver todo bien, subir y bajar
			}
		

		}

	}
	
}
