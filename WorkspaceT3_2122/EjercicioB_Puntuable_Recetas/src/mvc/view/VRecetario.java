package mvc.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import mvc.control.ControladorRecetario;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollPane;

public class VRecetario extends JFrame {
	
	public static final int ANCHO = 800;
	public static final int ALTO = 600;
	public static final String MNTN_INTRODUCIR = "Introducir Receta";
	public static final String MNTN_CONSULTAR = "Consultar Receta";
	public static final String MNTN_SALIR = "Salir";
	
	
	private JScrollPane scrpContenedor;
	private JMenuItem mntmMenu1;
	private JMenuItem mntmMenu2;
	private JMenuItem mntmMenu3;
	
	
	
	public VRecetario() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		setTitle("Recetario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 800);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		scrpContenedor = new JScrollPane();
		getContentPane().add(scrpContenedor, BorderLayout.CENTER);
		
		crearMenu();
		
		centrarVentana();
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void cargarPanel(JPanel panel) { //aqu? a?adimos como par?metro el ScrollPane que nos pasen; Opci?n 11 u Opci?n 12
		scrpContenedor.setViewportView(panel);
	}
	
	public void setControlador(ControladorRecetario controlador) {
		mntmMenu1.addActionListener(controlador);
		mntmMenu2.addActionListener(controlador);
		mntmMenu3.addActionListener(controlador);
	}

	private void crearMenu() {
		JMenuBar mnbMenu = new JMenuBar();
		setJMenuBar(mnbMenu);
		
		mntmMenu1 = new JMenuItem(MNTN_INTRODUCIR);
		mnbMenu.add(mntmMenu1);
		
		JSeparator separator = new JSeparator();
		mnbMenu.add(separator);
		
		mntmMenu2 = new JMenuItem(MNTN_CONSULTAR);
		mnbMenu.add(mntmMenu2);
		
		JSeparator separator_1 = new JSeparator();
		mnbMenu.add(separator_1);
		
		mntmMenu3 = new JMenuItem(MNTN_SALIR);
		mnbMenu.add(mntmMenu3);
	}
	
		
	private void centrarVentana() {
		// Asignamos tama?o a la ventana:
		setPreferredSize(new Dimension(ANCHO, ALTO));  
		// Se obtienen las dimensiones en pixels de la pantalla:    
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();               
		// Se obtienen las dimensiones en pixels de la ventana:       
		Dimension ventana = this.getPreferredSize();               
		// Un c?lculo para situar la ventana en el centro de la pantalla:       
		setLocation((pantalla.width - ventana.width) / 2,  (pantalla.height - ventana.height) / 2);
	
	}
	
	
}
