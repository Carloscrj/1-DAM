package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Ventana extends JFrame {
	private JLabel lblEtiqueta; //esto lo hemos creado como atributo en el design
	
	public Ventana() {
		initComponets(); //refactorizamos lo de abajo para que se vea más claro
	}

	private void initComponets() { //aquí se ira añadiendo lo que hagamos en design
		setTitle("Mi primera ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblEtiqueta = new JLabel("Mi primera etiqueta");
		lblEtiqueta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblEtiqueta.setBounds(89, 117, 208, 29);
		getContentPane().add(lblEtiqueta);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
