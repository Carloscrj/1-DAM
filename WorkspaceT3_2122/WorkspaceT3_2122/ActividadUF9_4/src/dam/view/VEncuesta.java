package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import dam.model.Encuesta;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.ButtonGroup;

public class VEncuesta extends JFrame {
	public static final String BTN_GUARDAR="Guardar";
	public static final String BTN_LIMPIAR="Limpiar";
	public static final String BTN_VER="Ver";
	private JLabel lblEdad;
	private JSpinner spnEdad;
	private JLabel lblHaPasado;
	private JComboBox<String>cmbRespuesta;
	private JLabel lblSintomas;
	private JCheckBox chckRespiratorio;
	private JCheckBox chckCansancio;
	private JCheckBox chckOlfato;
	private JCheckBox chckGusto;
	private JCheckBox chckCabeza;
	private JCheckBox chckFiebre;
	private JCheckBox chckSin;
	private JCheckBox chckTos;
	private JLabel lblGravedad;
	private JRadioButton rbtnNinguna;
	private JRadioButton rbtnLeve;
	private JRadioButton rbtnMedia;
	private JRadioButton rbtnAlta;
	private JRadioButton rbtnHospitalizacion;
	private JButton btnGuardar;
	private JButton btnLimpiar;
	private JButton btnVer;
	private JTextArea txt;
	private final ButtonGroup btnGravedad = new ButtonGroup();
	
	
	public VEncuesta() {
		getContentPane().setLayout(null);
		
		lblEdad = new JLabel(Encuesta.PREG_EDAD);
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEdad.setBounds(33, 24, 66, 13);
		getContentPane().add(lblEdad);
		
		lblHaPasado = new JLabel(Encuesta.PREG_COVID);
		lblHaPasado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHaPasado.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHaPasado.setBounds(33, 69, 91, 13);
		getContentPane().add(lblHaPasado);
		
		lblSintomas = new JLabel(Encuesta.PREG_SINTOMAS);
		lblSintomas.setBounds(33, 122, 125, 13);
		getContentPane().add(lblSintomas);
		
		lblGravedad = new JLabel(Encuesta.PREG_GRAV);
		lblGravedad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGravedad.setHorizontalAlignment(SwingConstants.TRAILING);
		lblGravedad.setBounds(10, 372, 75, 13);
		getContentPane().add(lblGravedad);
		
		chckRespiratorio = new JCheckBox("Sintomas respiratorios");
		chckRespiratorio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckRespiratorio.setBounds(31, 159, 152, 21);
		getContentPane().add(chckRespiratorio);
		
		chckOlfato = new JCheckBox("Olfato");
		chckOlfato.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckOlfato.setBounds(33, 200, 93, 21);
		getContentPane().add(chckOlfato);
		
		chckCabeza = new JCheckBox("Dolor de Cabeza");
		chckCabeza.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckCabeza.setBounds(33, 250, 125, 21);
		getContentPane().add(chckCabeza);
		
		chckSin = new JCheckBox("Sin Sintomas");
		chckSin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckSin.setBounds(33, 300, 93, 21);
		getContentPane().add(chckSin);
		
		chckCansancio = new JCheckBox("Cansancio / Malestar");
		chckCansancio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckCansancio.setBounds(224, 159, 144, 21);
		getContentPane().add(chckCansancio);
		
		chckGusto = new JCheckBox("Perdida del gusto");
		chckGusto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckGusto.setBounds(224, 200, 133, 21);
		getContentPane().add(chckGusto);
		
		chckFiebre = new JCheckBox("Fiebre");
		chckFiebre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckFiebre.setBounds(224, 250, 93, 21);
		getContentPane().add(chckFiebre);
		
		chckTos = new JCheckBox("Tos Seca");
		chckTos.setBounds(224, 295, 93, 33);
		getContentPane().add(chckTos);
		
		rbtnNinguna = new JRadioButton(Encuesta.NIVELES_GRAV[0]);
		btnGravedad.add(rbtnNinguna);
		rbtnNinguna.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbtnNinguna.setBounds(21, 432, 103, 21);
		getContentPane().add(rbtnNinguna);
		
		rbtnLeve = new JRadioButton(Encuesta.NIVELES_GRAV[1]);
		btnGravedad.add(rbtnLeve);
		rbtnLeve.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rbtnLeve.setBounds(193, 432, 103, 21);
		getContentPane().add(rbtnLeve);
		
		rbtnAlta = new JRadioButton(Encuesta.NIVELES_GRAV[3]);
		btnGravedad.add(rbtnAlta);
		rbtnAlta.setBounds(85, 500, 103, 21);
		getContentPane().add(rbtnAlta);
		
		rbtnHospitalizacion = new JRadioButton(Encuesta.NIVELES_GRAV[3]);
		btnGravedad.add(rbtnHospitalizacion);
		rbtnHospitalizacion.setBounds(303, 500, 103, 21);
		getContentPane().add(rbtnHospitalizacion);
		
		rbtnMedia = new JRadioButton(Encuesta.NIVELES_GRAV[2]);
		btnGravedad.add(rbtnMedia);
		rbtnMedia.setBounds(332, 433, 103, 21);
		getContentPane().add(rbtnMedia);
		
		spnEdad = new JSpinner();
		spnEdad.setModel(new SpinnerNumberModel(0, 0, 120, 1));
		spnEdad.setBounds(128, 22, 30, 20);
		getContentPane().add(spnEdad);
		
		cmbRespuesta = new JComboBox<String>();
		cmbRespuesta.setModel(new DefaultComboBoxModel<String>(Encuesta.RESP_COVID));
		cmbRespuesta.setBounds(170, 66, 29, 21);
		getContentPane().add(cmbRespuesta);

        
        btnGuardar = new JButton(BTN_GUARDAR);
        btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnGuardar.setBounds(128, 553, 85, 21);
        getContentPane().add(btnGuardar);
        
        btnLimpiar = new JButton(BTN_LIMPIAR);
        btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnLimpiar.setBounds(288, 553, 85, 21);
        getContentPane().add(btnLimpiar);
        
        btnVer = new JButton(BTN_VER);
        btnVer.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnVer.setBounds(170, 608, 177, 21);
        getContentPane().add(btnVer);
        
        JScrollPane srcpPanel = new JScrollPane();
        srcpPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        srcpPanel.setBounds(128, 662, 342, 59);
        getContentPane().add(srcpPanel);
        
        txt = new JTextArea();
        srcpPanel.setViewportView(txt);
        txt.setColumns(10);

		
		setSize(600,800);
		setLocationRelativeTo(null);
		
		
		
	}
}
