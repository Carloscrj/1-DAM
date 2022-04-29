package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.view.VCapicua;


public class CapicuaControlador implements ActionListener {
	
	VCapicua ventana;
	
	public CapicuaControlador(VCapicua ventana) {
		
		this.ventana= ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int capicua = ventana.obtenerDatos();
		String respuesta="";
		
		if (capicua>99 && capicua<1000) {
			
			String numero = String.valueOf(capicua);//lo cambiamos a String para poder comparar el primero y el �ltimo digito
		
				if (numero.charAt(0)==numero.charAt(numero.length()-1)) {
					respuesta= "El n�mero es capicua.";
				}else {
					respuesta="El n�mero no es capicua.";
				}
			
			ventana.mostrarResultado(respuesta);
			
		}
		
		
			
		}

	}


