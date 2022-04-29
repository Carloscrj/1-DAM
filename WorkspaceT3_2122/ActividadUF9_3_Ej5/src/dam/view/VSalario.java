package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import dam.control.SalarioControlador;

import javax.swing.JButton;

public class VSalario extends JFrame {
	private JTextField txtHoras;
	private JLabel lblError;
	private JButton btnComprobarSalario;
	
	public VSalario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setTitle("Comprobador de Salarios");
		setSize(450,300);
		setLocationRelativeTo(null);
		
		JLabel lblIntroduzcaHoras = new JLabel("Introduzca horas trabajadas:");
		lblIntroduzcaHoras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIntroduzcaHoras.setBounds(27, 65, 190, 13);
		getContentPane().add(lblIntroduzcaHoras);
		
		txtHoras = new JTextField();
		txtHoras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHoras.setBounds(237, 62, 96, 19);
		getContentPane().add(txtHoras);
		txtHoras.setColumns(10);
		
		btnComprobarSalario = new JButton("Comprobar Salario");
		btnComprobarSalario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnComprobarSalario.setBounds(115, 139, 196, 21);
		getContentPane().add(btnComprobarSalario);
		
		lblError = new JLabel("");
		lblError.setBounds(27, 206, 399, 13);
		getContentPane().add(lblError);
		
	}
	
	public void hacervisible() {
		setVisible(true);
	}
	
	public void setControlador(SalarioControlador controlador) { 
		btnComprobarSalario.addActionListener(controlador);
	}
	
	public double obtenerDatos(){
		double horas=0;
		
		try {
			horas = Double.parseDouble(txtHoras.getText());
			
			if (horas<=0) {
				throw new NumberFormatException();
			}
			
		} catch (NumberFormatException e) {
			lblError.setText("Se debe introducir un número mayor que 0.");
			lblError.setForeground(Color.RED);
		}
		
		return horas;
			
		}
	
	public void mostrarResultado(String respuesta) {
		
		lblError.setText(respuesta);
		lblError.setForeground(Color.GREEN);
	}
	
	
}
