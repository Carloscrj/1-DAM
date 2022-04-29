package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import dam.control.CapicuaControlador;


import javax.swing.JButton;

public class VCapicua extends JFrame {
	private JButton btnComprobar;
	private JTextField txtCapicua;
	private JLabel lblError;
	
	
	public VCapicua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setTitle("Comprobador de Capicuas");
		setSize(450,300);		// linea 25 y 26 hay que ponerlas a mano porque no te los saca solo
		setLocationRelativeTo(null);
		
		JLabel lblCapicua = new JLabel("Introduzca n\u00FAmero");
		lblCapicua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCapicua.setBounds(35, 37, 131, 13);
		getContentPane().add(lblCapicua);
		
		txtCapicua = new JTextField();
		txtCapicua.setBounds(216, 36, 96, 19);
		getContentPane().add(txtCapicua);
		txtCapicua.setColumns(10);
		
		btnComprobar = new JButton("Comprobar Capic\u00FAa");
		btnComprobar.setBounds(97, 121, 241, 21);
		getContentPane().add(btnComprobar);
		
		lblError = new JLabel("");
		lblError.setBounds(20, 208, 395, 17);
		getContentPane().add(lblError);
	}
	
	public void hacervisible() {
		setVisible(true);
	}
	
	public void setControlador(CapicuaControlador controlador) { 
		btnComprobar.addActionListener(controlador);
	}
	
	public int obtenerDatos(){
		int capicua=0;
		
		try {
			capicua = Integer.parseInt(txtCapicua.getText());
			
			if (capicua<100 || capicua>999) {
				throw new NumberFormatException();
			}
			
		} catch (NumberFormatException e) {
			lblError.setText("Se debe introducir un número de tres cifras y positivo.");
			lblError.setForeground(Color.RED);
		}
		
		return capicua;
			
		}
	
	public void mostrarResultado(String respuesta) {
		
		lblError.setText(respuesta);
		lblError.setForeground(Color.GREEN);
	}
	
	
}
