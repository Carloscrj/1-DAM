package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import dam.control.ConvertidorMonedasControlador;

import javax.swing.JButton;

public class VConvertidorDeMonedas extends JFrame {
	private JTextField txtDolar;
	private JTextField txtEuros;
	private JButton btnConvertir;
	private JLabel lblNewLabel;
	private JLabel lblError;
	
	public VConvertidorDeMonedas() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		getContentPane().setLayout(null);
		setTitle("Convertidor de Monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(450,300);
		setLocationRelativeTo(null);

		
		lblNewLabel = new JLabel("Dolares");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(47, 30, 74, 17);
		getContentPane().add(lblNewLabel);
		
		txtDolar = new JTextField();
		txtDolar.setBounds(157, 31, 96, 19);
		getContentPane().add(txtDolar);
		txtDolar.setColumns(10);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConvertir.setBounds(154, 113, 109, 21);
		getContentPane().add(btnConvertir);
		
		JLabel Euros = new JLabel("Euros");
		Euros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Euros.setBounds(64, 197, 45, 13);
		getContentPane().add(Euros);
		
		txtEuros = new JTextField();
		txtEuros.setEnabled(false);
		txtEuros.setBounds(157, 196, 96, 19);
		getContentPane().add(txtEuros);
		txtEuros.setColumns(10);
		
		lblError = new JLabel("");
		lblError.setBounds(138, 240, 159, 13);
		getContentPane().add(lblError);
	}
	
	public void hacervisible() {
		setVisible(true);
	}
	
	public double obtenerDatos(){
		double dolar = 0;
		
		try {
			dolar = Double.parseDouble(txtDolar.getText());
			
			if (dolar<0) {
				throw new NumberFormatException();
			}
			
		} catch (NumberFormatException e) {
			lblError.setText("Se debe introducir 0 o mayor.");
			lblError.setForeground(Color.RED);
		}
		
		
		
		return dolar;
			
		}
	
	public void mostrarResultado(String resultado) {
		
		txtEuros.setText(resultado);
		txtEuros.setForeground(Color.GREEN);
	}
	
	public void setControlador(ConvertidorMonedasControlador controlador) { 
		btnConvertir.addActionListener(controlador);
	}

}
