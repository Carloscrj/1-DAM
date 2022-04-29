package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VPruebas9_3 extends JFrame {
	private JTextField textNombre;
	private JButton btnSaludor;
	private JLabel lblIntro;
	private JLabel lblSaludo;
	
	public VPruebas9_3() {
		setTitle("Pruebas UF9_3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblIntro = new JLabel("Introduce tu nombre");
		lblIntro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIntro.setBounds(20, 33, 162, 13);
		getContentPane().add(lblIntro);
		
		textNombre = new JTextField();
		textNombre.setBounds(238, 27, 96, 19);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		btnSaludor = new JButton("Saludar");
		btnSaludor.setBounds(177, 110, 85, 21);
		getContentPane().add(btnSaludor);
		
		lblSaludo = new JLabel("");
		lblSaludo.setBounds(37, 191, 359, 21);
		getContentPane().add(lblSaludo);
		
		setSize(450, 300);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
