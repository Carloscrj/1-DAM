package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import dam.control.ResolverEcuacionControlador;
import dam.model.Ecuacion2G;

import javax.swing.JButton;

public class VResolverEcuacion extends JFrame {
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JLabel lblResultado;
	private JButton btnResolver;
	
	public VResolverEcuacion() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		setTitle("Resolver Ecuacion 2do Grado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce los terminos de la ecuaci\u00F3n de segundo grado");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 10, 367, 27);
		getContentPane().add(lblNewLabel);
		
		txtA = new JTextField();
		txtA.setBounds(20, 47, 61, 19);
		getContentPane().add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("x^2+");
		lblNewLabel_1.setBounds(91, 47, 59, 16);
		getContentPane().add(lblNewLabel_1);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(126, 47, 61, 19);
		getContentPane().add(txtB);
		
		JLabel lblB = new JLabel("x+");
		lblB.setBounds(209, 53, 38, 13);
		getContentPane().add(lblB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(239, 47, 61, 19);
		getContentPane().add(txtC);
		
		JLabel lblC = new JLabel("=0");
		lblC.setBounds(332, 53, 45, 13);
		getContentPane().add(lblC);
		
		btnResolver = new JButton("Resolver");
		btnResolver.setBounds(162, 112, 100, 21);
		getContentPane().add(btnResolver);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(69, 193, 291, 19);
		getContentPane().add(lblResultado);
		
		setSize(450, 300);
		setLocationRelativeTo(null);
	}
	
	public void hacervisible() {
		setVisible(true);
	}
	
	public void setControlador(ResolverEcuacionControlador controlador) { //el controlador es la clase ResolverEcuacionControlador
		btnResolver.addActionListener(controlador);
	}
	
	public Ecuacion2G obtenerDatos(){
		Ecuacion2G eq = null;
		
		try {
			int a = Integer.parseInt(txtA.getText());
			
			if (a == 0) {
				throw new NumberFormatException();
			}
			
			try {
				int b = Integer.parseInt(txtB.getText());
				
				try {
					int c = Integer.parseInt(txtC.getText());
					
					eq = new Ecuacion2G(a, b, c);
					
				} catch (NumberFormatException e) {
					mostrarError("El término independiente debe ser entero");
				}
				
			} catch (NumberFormatException e) {
				mostrarError("El término de la x debe ser entero");
			}		
			
		} catch (NumberFormatException e) {
			mostrarError("El término de la x^2 debe ser entero y distinto de 0");
		}
		
		return eq;
			
		}
	

	private void mostrarError(String error) {
	lblResultado.setText(error);
	lblResultado.setForeground(Color.RED);
		
	}

	public void mostrarResultado(String resultado) {
		
		lblResultado.setText(resultado);
		lblResultado.setForeground(Color.GREEN);
	}
}
