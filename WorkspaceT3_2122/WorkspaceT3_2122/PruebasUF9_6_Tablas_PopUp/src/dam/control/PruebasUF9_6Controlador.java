package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import dam.view.VPruebasUF9_6;

public class PruebasUF9_6Controlador implements ActionListener {
	
	VPruebasUF9_6 ventana;
	
	

	public PruebasUF9_6Controlador(VPruebasUF9_6 ventana) {
		this.ventana = ventana;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(VPruebasUF9_6.BTN_INFO)) {
				JOptionPane.showMessageDialog(ventana, //ventana donde se ejecuta
						"Este es un mensaje de información", //mensaje a mostrar
						"Información", //título de la ventana
						JOptionPane.INFORMATION_MESSAGE); //tipo de icono para el mensaje
			} else if (e.getActionCommand().equals(VPruebasUF9_6.BTN_ERROR)) {
				ventana.mostrarError("Este es un mensaje de error","error");
			} else if (e.getActionCommand().equals(VPruebasUF9_6.BTN_WARNING)) {
				JOptionPane.showMessageDialog(ventana, "Este es un mensaje de aviso", 
						"Aviso", JOptionPane.WARNING_MESSAGE);
			} else if (e.getActionCommand().equals(VPruebasUF9_6.BTN_PLAIN)) {
				JOptionPane.showMessageDialog(ventana, "Este es un mensaje de texto plano", 
						"Texto plano", JOptionPane.INFORMATION_MESSAGE);
			} else if (e.getActionCommand().equals(VPruebasUF9_6.BTN_CONFIRMACION)) {
				int respuesta = JOptionPane.showConfirmDialog(ventana, "Este es un mensaje de confirmación, ¿Desea continuar?",
						"Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (respuesta == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(ventana, 
							"Ha confirmado con éxito", //mensaje a mostrar
							"Información", //título de la ventana
							JOptionPane.INFORMATION_MESSAGE); //tipo de icono
				}
			}
		}
	}
}
