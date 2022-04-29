package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.view.VEncuesta;

public class EncuestasControlador implements ActionListener {
	VEncuesta ventana;
	
	public EncuestasControlador(VEncuesta ventana) {
		this.ventana= ventana;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		e.getSource();
		
		e.getActionCommand();
		
		if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(VEncuesta.BTN_LIMPIAR)) {
				
			}
		}
	}

}
