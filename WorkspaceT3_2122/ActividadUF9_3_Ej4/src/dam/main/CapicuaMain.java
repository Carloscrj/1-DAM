package dam.main;

import java.awt.EventQueue;

import dam.control.CapicuaControlador;
import dam.view.VCapicua;

public class CapicuaMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VCapicua v = new VCapicua();
				CapicuaControlador c = new CapicuaControlador(v);
				
				v.setControlador(c);
				
				v.hacervisible();
				
			}
		});
	}

	}


