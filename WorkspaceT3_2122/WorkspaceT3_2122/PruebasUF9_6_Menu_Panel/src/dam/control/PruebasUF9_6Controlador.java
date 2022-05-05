package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.view.PanelOpcion11;
import dam.view.PanelOpcion12;
import dam.view.VPruebasUF9_6;

public class PruebasUF9_6Controlador implements ActionListener {
	
	VPruebasUF9_6 ventana;
	PanelOpcion11 po11; //deben ser las nuevas ventanas atributo
	PanelOpcion12 po12;


	public PruebasUF9_6Controlador(VPruebasUF9_6 ventana, PanelOpcion11 po11, PanelOpcion12 po12) {
		this.ventana = ventana;
		this.po11 = po11;
		this.po12 = po12;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem) { //Si se hace click en cada uno de los submenús
			if (e.getActionCommand().equals(VPruebasUF9_6.MNTN_OPC11)) {
				ventana.cargarPanel(po11);
			} else if (e.getActionCommand().equals(VPruebasUF9_6.MNTN_OPC12)) {
				ventana.cargarPanel(po12);
			} else if (e.getActionCommand().equals(VPruebasUF9_6.MNTN_OPC13)) {
				ventana.mostrarMensaje("Se ha pulsado la opción 1.3", "Menú");
			} else if (e.getActionCommand().equals(VPruebasUF9_6.MNTN_OPC14)) {
				ventana.mostrarMensaje("Se ha pulsado la opción 1.3", "Menú");
			} else if (e.getActionCommand().equals(VPruebasUF9_6.MNTN_MENU2)) {
				ventana.mostrarMensaje("Se ha pulsado la opción menú 2", "Menú 2");
			}
		}
	}
}
