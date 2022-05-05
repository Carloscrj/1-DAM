package dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import dam.control.PruebasUF9_6Controlador;
import dam.model.FuenteDatos;
import dam.model.Persona;

import javax.swing.JButton;

public class VPruebasUF9_6 extends JFrame {
	private static final int ANCHO = 800;
	private static final int ALTO = 600;
	private static final String COLUMN_DNI = "DNI";
	private static final String COLUMN_NOMBRE = "NOMBRE";
	private static final String COLUMN_APELLIDO = "APELLIDO";
	private static final String COLUMN_EDAD = "EDAD";
	
	public static final String BTN_INFO = "Info";
	public static final String BTN_ERROR = "Error";
	public static final String BTN_WARNING = "Warning";
	public static final String BTN_PLAIN = "Plain";
	public static final String BTN_CONFIRMACION = "Confirmación";
	
	private JTable tblPruebas;
	private JTable tblPruebas2; //creada a código
	private DefaultTableModel dtmPruebas2; //creamos como atributo el modelo de la tabla
	private FuenteDatos datos; //así conseguimos los datos que hemos metido a mano en la clase FuenteDatos
	private JButton btnInfo;
	private JButton btnError;
	private JButton btnWarning;
	private JButton btnPlain;
	private JButton btnConfirmacion;

	public VPruebasUF9_6(FuenteDatos datos) {
		this.datos = datos; //incluimos en el constructor este parámetro para poder rellenar la tabla; pero no será así en el futuro
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		setTitle("Pruebas UF 9.6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(ANCHO, ALTO);
		
		centrarVentana();
		
		
		
		
		JScrollPane scrpTabla = new JScrollPane();
		scrpTabla.setBounds(10, 11, 757, 118);
		getContentPane().add(scrpTabla);
		
		//Tabla y model configurados con el asistente de Window Builder:
		tblPruebas = new JTable();
		tblPruebas.setModel(new DefaultTableModel(
			new Object[][] {
				{"12345678z", "JUAN", "VEGA", "40"},
				{"87654321Z", "SARA", "PEREZ", "25"},
			},
			new String[] {
				"DNI", "NOMBRE", "APELLIDO", "EDAD"
			}
		));
		tblPruebas.getColumnModel().getColumn(1).setPreferredWidth(126);
		tblPruebas.getColumnModel().getColumn(1).setMinWidth(50);
		scrpTabla.setViewportView(tblPruebas);
		
		
		
		
		
		
		JScrollPane scrpTabla2 = new JScrollPane();
		scrpTabla2.setBounds(10, 165, 757, 161);
		getContentPane().add(scrpTabla2);
				
		//Configuración de la tabla y el model a código:
		tblPruebas2 = new JTable(); //tiene que estar inicializada la tabla antes de configurarla
		tblPruebas2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		configurarTabla();
		rellenarTabla();
		
		tblPruebas2.setRowSelectionInterval(3, 3); //para que, al iniciar el programa, se seleccionen unas filas predeterminadas
		int filaSel = tblPruebas2.getSelectedRow();
		System.out.println("Se ha seleccionado la fila: "+filaSel);
		
		scrpTabla2.setViewportView(tblPruebas2);
		
		btnInfo = new JButton(BTN_INFO);
		btnInfo.setBounds(104, 393, 89, 23);
		getContentPane().add(btnInfo);
		
		btnError = new JButton(BTN_ERROR);
		btnError.setBounds(270, 393, 89, 23);
		getContentPane().add(btnError);
		
		btnWarning = new JButton(BTN_WARNING);
		btnWarning.setBounds(433, 393, 89, 23);
		getContentPane().add(btnWarning);
		
		btnPlain = new JButton(BTN_PLAIN);
		btnPlain.setBounds(589, 393, 89, 23);
		getContentPane().add(btnPlain);
		
		btnConfirmacion = new JButton(BTN_CONFIRMACION);
		btnConfirmacion.setBounds(355, 460, 120, 23);
		getContentPane().add(btnConfirmacion);

	}

	private void rellenarTabla() {
		Object[] fila = new Object[4]; //creamos un array con el tamaño del número de columnas que tenemos que será para llenar las filas
		
		//vamos a rellenar las este array que hemos creado con un foreach; por ello hemos sacado los getters de cada atributo:
		for (Persona persona : datos.getListaPersonas()) { 
			fila[0] = persona.getDNI();
			fila[1] = persona.getNombre();
			fila[2] = persona.getApellido();
			fila[3] = persona.getEdad();
			dtmPruebas2.addRow(fila); //se va añadiendo en cada iteración los datos de cada persona
		}
	}

	private void configurarTabla() {
		dtmPruebas2 = new DefaultTableModel() { //al escribir isCellEditable, nos autocompleta con el método completo del override y lo rellenamos con el if:
			//hacemos la tabla no editable salvo la columna edad:
			@Override
			public boolean isCellEditable(int row, int column) { //es la celda editable?
				if (column == 3) { //Accedemos a la posición 3 de la columna (EDAD)
					return true; //y devolvemos true porque queremos que esa sí sea editable
				}
				return false;
			}
		};
		
		tblPruebas2.setModel(dtmPruebas2);
		//Establecemos ahora el nombre de las columnas con constantes:
		dtmPruebas2.addColumn(COLUMN_DNI); //Será la posición 0 en la columna
		dtmPruebas2.addColumn(COLUMN_NOMBRE); //Será la posición 1 en la columna
		dtmPruebas2.addColumn(COLUMN_APELLIDO); //Será la posición 2 en la columna
		dtmPruebas2.addColumn(COLUMN_EDAD); //Será la posición 3 en la columna
		//Ponemos el ancho al campo de la columna:
		tblPruebas2.getColumn(COLUMN_DNI).setPreferredWidth(75);
		tblPruebas2.getColumn(COLUMN_NOMBRE).setPreferredWidth(75);
		tblPruebas2.getColumn(COLUMN_APELLIDO).setPreferredWidth(150);
		tblPruebas2.getColumn(COLUMN_EDAD).setPreferredWidth(50);
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
	
	public void setControlador(PruebasUF9_6Controlador controlador) {
		btnError.addActionListener(controlador);
		btnInfo.addActionListener(controlador);
		btnPlain.addActionListener(controlador);
		btnWarning.addActionListener(controlador);
		btnConfirmacion.addActionListener(controlador);
	}

	public void mostrarError(String error, String titulo) {
		JOptionPane.showMessageDialog(this, //ventana
				error, //mensaje
				titulo, //título ventana
				JOptionPane.ERROR_MESSAGE); //tipo icono de la ventana 
	}
}
