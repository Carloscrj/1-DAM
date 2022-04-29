package dam.main;

import java.awt.EventQueue;

import dam.control.ConvertidorMonedasControlador;
import dam.view.VConvertidorDeMonedas;



public class ConvertidorMonedasMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VConvertidorDeMonedas v = new VConvertidorDeMonedas();
				ConvertidorMonedasControlador c = new ConvertidorMonedasControlador(v);
				
				v.setControlador(c);
				
				v.hacervisible();
				
			}
		});
	}

}
