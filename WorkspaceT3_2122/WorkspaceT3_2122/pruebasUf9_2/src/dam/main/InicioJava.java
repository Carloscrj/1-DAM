package dam.main;

import dam.view.Ventana;

public class InicioJava {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() { //esto hare que se ejecute de un modo paralelo
			public void run() {
			  Ventana v = new Ventana();
			  v.hacerVisible();
			}
			});

	}

}
