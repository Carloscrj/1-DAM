package mvc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import mvc.control.ControladorHipoteca;
import mvc.modelo.Hipoteca;

import javax.swing.JTextField;
import javax.swing.JButton;

public class VCalculoHipoteca extends JFrame {
	static final int ANCHO = 600;
	static final int ALTO = 250;

	private JButton btnCalcular;
	private JSpinner spnCantidad;
	private JSpinner spnAnios;
	private JLabel lblResultado;
	private JTextField txtInteres;
	
	public VCalculoHipoteca() {
		inicializarComponentes();
		
	}

	private void inicializarComponentes() {
		setTitle("Calculadora cuota hipoteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(ANCHO, ALTO);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(32, 11, 62, 14);
		getContentPane().add(lblCantidad);
		
		JLabel lblAnios = new JLabel("A\u00F1os:");
		lblAnios.setBounds(232, 11, 48, 14);
		getContentPane().add(lblAnios);
		
		JLabel lblInteres = new JLabel("Inter\u00E9s:");
		lblInteres.setBounds(398, 11, 48, 14);
		getContentPane().add(lblInteres);
		
		spnAnios = new JSpinner();
		spnAnios.setModel(new SpinnerNumberModel(5, 5, 50, 5));
		spnAnios.setEditor(new JSpinner.DefaultEditor(spnAnios));
		spnAnios.setBounds(290, 8, 48, 20);
		getContentPane().add(spnAnios);
		
		spnCantidad = new JSpinner();
		spnCantidad.setModel(new SpinnerNumberModel(0, 0, 2000000, 1000));
		spnCantidad.setEditor(new JSpinner.DefaultEditor(spnCantidad));
		spnCantidad.setBounds(104, 8, 81, 20);
		getContentPane().add(spnCantidad);
		
		btnCalcular = new JButton("Calcula");
		btnCalcular.setBounds(249, 106, 89, 23);
		getContentPane().add(btnCalcular);
		
		txtInteres = new JTextField();
		txtInteres.setBounds(470, 8, 56, 20);
		getContentPane().add(txtInteres);
		txtInteres.setColumns(10);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(32, 162, 250, 14);
		getContentPane().add(lblResultado);

		
		centrarVentana();
	}

	private void centrarVentana() {
		// Asignamos tamaño a la ventana:
		setPreferredSize(new Dimension(ANCHO, ALTO));  
		// Se obtienen las dimensiones en pixels de la pantalla:    
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();               
		// Se obtienen las dimensiones en pixels de la ventana:       
		Dimension ventana = this.getPreferredSize();               
		// Un cálculo para situar la ventana en el centro de la pantalla:       
		setLocation((pantalla.width - ventana.width) / 2,  (pantalla.height - ventana.height) / 2);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setControlador(ControladorHipoteca controlador) {
		btnCalcular.addActionListener(controlador);
	}

	public Hipoteca obtenerHipoteca() {
		Hipoteca hipoteca = null;
		
		int cantidad = (int) spnCantidad.getValue();
		
		if (cantidad == 0) {
			mostrarError("La cantidad debe ser mayor que cero");
		} else {
			int anios = (int) spnAnios.getValue();
			
			if (anios == 0) {
				mostrarError("El número de años debe ser mayor que cero");
			} else {
				try {
					double interes = Double.parseDouble(txtInteres.getText()); //pasa a double lo que haya en la caja de texto, si puede
					
					if (interes <= 0) {
						mostrarError("El interés debe ser un número positivo");
					} else {
						hipoteca = new Hipoteca(cantidad, anios, interes); // finalmente tendríamos bien los datos
					}
				} catch (NumberFormatException e) {
					mostrarError("El interés debe ser un valor numérico");
				}
			}
		}
		
		return hipoteca;
	}

	private void mostrarError(String error) {
		lblResultado.setText(error);
		lblResultado.setForeground(Color.RED);
	}

	public void mostrarResultado(double cuotaMes) {
		lblResultado.setText(String.valueOf(cuotaMes)); //si solo queremos mostrar el double, tendremos primero que pasar a String cuotaMes
		lblResultado.setText("Cuota mensual: " + cuotaMes + "€.");
		lblResultado.setForeground(Color.ORANGE);
		
	}
}
