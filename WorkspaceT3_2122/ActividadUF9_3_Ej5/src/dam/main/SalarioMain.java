package dam.main;

import java.awt.EventQueue;

import dam.control.SalarioControlador;
import dam.view.VSalario;


public class SalarioMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VSalario v = new VSalario();
				SalarioControlador c = new SalarioControlador(v);
				
				v.setControlador(c);
				
				v.hacervisible();
				
			}
		});
	}

	}


