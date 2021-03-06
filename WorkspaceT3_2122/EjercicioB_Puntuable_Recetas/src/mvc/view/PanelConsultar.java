package mvc.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mvc.control.ControladorRecetario;
import mvc.modelo.Receta;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelConsultar extends JPanel {
	private static final String NOMBRE_RECETA = "NOMBRE RECETA";
	private static final String DESCRIPCION = "DESCRIPCI?N";
	private static final String TIEMPO_EJECUCION = "TIEMPO DE EJECUCI?N";
	private static final String DIFICULTAD = "DIFICULTAD";
	public static final String BTN_MOST = "Mostrar Recetas";
	
	
	private JScrollPane scrpRecetas;
	private JTable tblRecetas;
	private DefaultTableModel tModel; //nos sirve para configurar la tabla
	private JButton btnMostrarRecetas;
	
	public PanelConsultar() {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Listado de Recetas");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitulo.setBounds(59, 95, 118, 13);
		add(lblTitulo);
		
		scrpRecetas = new JScrollPane();
		scrpRecetas.setVisible(false);
		scrpRecetas.setBounds(59, 234, 464, 228);
		add(scrpRecetas);
		
		tblRecetas = new JTable();
		configurarTabla();
		scrpRecetas.setViewportView(tblRecetas);
		
		btnMostrarRecetas = new JButton(BTN_MOST);
		btnMostrarRecetas.setBounds(382, 93, 85, 21);
		add(btnMostrarRecetas);
		
		
	}

	private void configurarTabla() {
		tModel = new DefaultTableModel() { //inicializamos table model
			public boolean isCellEditable(int row, int column) {
				return false; //porque no queremos celdas editables
			}
		};
		
				tblRecetas.setModel(tModel);
		//Establecemos ahora el nombre de las columnas con constantes:
				tModel.addColumn(NOMBRE_RECETA); //Ser? la posici?n 0 en la columna
				tModel.addColumn(DESCRIPCION); //Ser? la posici?n 1 en la columna
				tModel.addColumn(TIEMPO_EJECUCION); //Ser? la posici?n 2 en la columna
				tModel.addColumn(DIFICULTAD); //Ser? la posici?n 3 en la columna
				//Ponemos el ancho al campo de la columna:
				tblRecetas.getColumn(NOMBRE_RECETA).setPreferredWidth(75);
				tblRecetas.getColumn(DESCRIPCION).setPreferredWidth(75);
				tblRecetas.getColumn(TIEMPO_EJECUCION).setPreferredWidth(75);
				tblRecetas.getColumn(DIFICULTAD).setPreferredWidth(75);
		
	}
	
	public void  rellenarTabla(ArrayList<Receta> listaRecetas) {
		
		tModel.getDataVector().clear();// sirve para limpiar el contenido de la tabla antes de cargar otra
		//tModel.setRowCount(0); spara lo mismo que el de arriba, en este le decimos que si contenido sea cero
		
		Object[] fila = new Object[4]; //creamos un array con el tama?o del n?mero de columnas que tenemos que ser? para llenar las filas
		
		//vamos a rellenar las este array que hemos creado con un foreach; por ello hemos sacado los getters de cada atributo:
		for (Receta receta : listaRecetas) { 
			fila[0] = receta.getNombre();
			fila[1] = receta.getDescripcion();
			fila[2] = receta.getTiempoDeEjecucion();
			fila[3] = receta.getDificultad();
			tModel.addRow(fila); //se va a?adiendo en cada iteraci?n los datos de cada persona
		}
	}
	
	public void setControlador(ControladorRecetario controlador) {
		btnMostrarRecetas.addActionListener(controlador);
		
	}

	public void hacerVisibleScrp(boolean b) {
		scrpRecetas.setVisible(b);
		
	}
	
}
