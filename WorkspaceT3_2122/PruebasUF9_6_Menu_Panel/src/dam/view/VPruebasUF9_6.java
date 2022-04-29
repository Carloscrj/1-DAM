package dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dam.control.PruebasUF9_6Controlador;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class VPruebasUF9_6 extends JFrame {
	public static final int ANCHO = 800;
	public static final int ALTO = 600;
	
	public static final String MNTN_MENU2 = "Menú 2";
	public static final String MNTN_OPC14 = "Opción 1.4";
	public static final String MNTN_OPC13 = "Opción 1.3";
	public static final String MNTN_OPC12 = "Opción 1.2";
	public static final String MNTN_OPC11 = "Opción 1.1";
	
	private JMenuItem mntmOpcion11;
	private JMenuItem mntmOpcion12;
	private JMenuItem mntmOpcion13;
	private JMenuItem mntmOpcion14;
	private JMenuItem mntmMenu2;
	private JScrollPane scrpContenedor; //importante que el contenedor de las otras ventanas sea atributo


	public VPruebasUF9_6() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		setTitle("Pruebas UF 9.6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(ANCHO, ALTO);
		
		centrarVentana();
		
		crearMenu();
		
		scrpContenedor = new JScrollPane();
		getContentPane().add(scrpContenedor, BorderLayout.CENTER);
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

	private void crearMenu() {
		JMenuBar mnbMenu = new JMenuBar();
		setJMenuBar(mnbMenu);
		
		JMenu mnMenu1 = new JMenu("Menu 1");
		mnMenu1.setPreferredSize(new Dimension(150, 30)); //darle tamaño al menú 1 para que el 2 no salga tan pegado
		mnMenu1.setHorizontalAlignment(SwingConstants.CENTER);//Centrar el texto en lo que ocupe el menú
		mnbMenu.add(mnMenu1);
		
		mntmOpcion11 = new JMenuItem(MNTN_OPC11);
		mnMenu1.add(mntmOpcion11);
		
		JSeparator separator = new JSeparator();
		mnMenu1.add(separator);
		
		mntmOpcion12 = new JMenuItem(MNTN_OPC12);
		mnMenu1.add(mntmOpcion12);
		
		JSeparator separator_1 = new JSeparator();
		mnMenu1.add(separator_1);
		
		mntmOpcion13 = new JMenuItem(MNTN_OPC13);
		mnMenu1.add(mntmOpcion13);
		
		JSeparator separator_2 = new JSeparator();
		mnMenu1.add(separator_2);
		
		mntmOpcion14 = new JMenuItem(MNTN_OPC14);
		mnMenu1.add(mntmOpcion14);
		
		mntmMenu2 = new JMenuItem(MNTN_MENU2);
		mnbMenu.add(mntmMenu2);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void cargarPanel(JPanel panel) { //aquí añadimos como parámetro el ScrollPane que nos pasen; Opción 11 u Opción 12
		scrpContenedor.setViewportView(panel);
	}
	
	public void setControlador(PruebasUF9_6Controlador controlador) {
		mntmOpcion11.addActionListener(controlador);
		mntmOpcion12.addActionListener(controlador);
		mntmOpcion13.addActionListener(controlador);
		mntmOpcion14.addActionListener(controlador);
		mntmMenu2.addActionListener(controlador);
	}

	public void mostrarMensaje(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(this, //ventana
				mensaje, //mensaje
				titulo, //título ventana
				JOptionPane.INFORMATION_MESSAGE); //tipo icono de la ventana 
	}
}
