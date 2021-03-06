package mvc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import mvc.control.ControladorRecetario;
import mvc.modelo.Receta;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;



public class PanelIntroducir extends JPanel {
	
	private static final int ANCHO = 800;
	private static final int ALTO = 600;
	public static final String BTN_GUARDAR = "Guardar Datos";
	private JTextField txtNombreReceta;
	private JLabel lblNombre;
	private JScrollPane scrollPane;
	private JTextArea txtDescripcion;
	private JLabel lblTiempo;
	private JSpinner spnTiempo;
	private JComboBox <String> cmbDificultad;
	private JLabel lblDificultad;
	private JButton btnGuardar;
	
	
	public PanelIntroducir() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		setSize(ANCHO, ALTO);
		setLayout(null);
		
		lblNombre = new JLabel("Nombre receta:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(59, 61, 114, 13);
		add(lblNombre);
		
		txtNombreReceta = new JTextField();
		txtNombreReceta.setBounds(193, 38, 331, 36);
		add(txtNombreReceta);
		txtNombreReceta.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 140, 724, 67);
		add(scrollPane);
		
		txtDescripcion = new JTextArea();
		scrollPane.setViewportView(txtDescripcion);
		
		lblTiempo = new JLabel("Tiempo de Ejecuci\u00F3n:");
		lblTiempo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTiempo.setBounds(29, 262, 131, 27);
		add(lblTiempo);
		
		spnTiempo = new JSpinner();
		spnTiempo.setModel(new SpinnerNumberModel(0, 0, 360, 1));
		spnTiempo.setBounds(193, 262, 54, 26);
		add(spnTiempo);
		
		cmbDificultad = new JComboBox <String>();
		cmbDificultad.setModel(new DefaultComboBoxModel<String>(Receta.DIFICULTAD));
		cmbDificultad.setBounds(456, 267, 68, 21);
		add(cmbDificultad);
		
		lblDificultad = new JLabel("Dificultad:");
		lblDificultad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDificultad.setBounds(364, 262, 82, 22);
		add(lblDificultad);
		
		btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardar.setBounds(313, 353, 85, 21);
		add(btnGuardar);
		
		
	}
	
	public Receta obtenerReceta() {
		Receta receta = null;
		
		
		String nombre= txtNombreReceta.getText();
		
		if (nombre.isBlank()) { 
			mostrarError("No ha introducido nombre receta", "ERROR");
		}else{
			String descripcion= txtDescripcion.getText();
			if (descripcion.isBlank()) {
				mostrarError("No ha introducido descripci?n", "ERROR");
			}else{
			int tiempoEjecucion= (int) spnTiempo.getValue();
			String dificultad= (String) cmbDificultad.getSelectedItem();
			receta = new Receta(nombre, descripcion, tiempoEjecucion, dificultad);
		}
		
	  }
		return receta;
	}
	
	public void mostrarError(String error, String titulo) {
		JOptionPane.showMessageDialog(this, //ventana
				error, //mensaje
				titulo, //t?tulo ventana
				JOptionPane.ERROR_MESSAGE); //tipo icono de la ventana 
	}
	
	public void mostrarMensaje(String error, String titulo) {
		JOptionPane.showMessageDialog(this, //ventana
				error, //mensaje
				titulo, //t?tulo ventana
				JOptionPane.INFORMATION_MESSAGE); //tipo icono de la ventana 
	}
	
	public void limpiarRecetas() { //m?todo para llamar en el controlador y as? deseleccionar cuando seleccionamos "sin s?ntomas"
		txtNombreReceta.setText("");
		txtDescripcion.setText("");
		spnTiempo.setValue(0);
		cmbDificultad.setSelectedItem(Receta.DIFICULTAD[0]);
		
		
	}
	
	public void setControlador(ControladorRecetario controlador) {
		btnGuardar.addActionListener(controlador);
		
	}
	
	
}
