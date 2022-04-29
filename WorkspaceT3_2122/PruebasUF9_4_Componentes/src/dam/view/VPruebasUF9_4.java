package dam.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import dam.model.Alumno;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.print.attribute.standard.DialogTypeSelection;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class VPruebasUF9_4 extends JFrame {
	private final ButtonGroup btngSexo = new ButtonGroup();
	private JScrollPane scrpPruebas;
	private JTextArea txtPruebas;
	private JComboBox <String> cmbDias;
	private JComboBox <Alumno> cmbAlumnos;
	private JCheckBox chckLeer;
	private JCheckBox chckPadel;
	private JCheckBox chckMúsica;
	private JRadioButton rbtnHombre;
	private JRadioButton rbtnMujer;
	private JRadioButton rbtnOtro;
	private JPasswordField passwordField;
	private JSpinner spnEdad;
	private JScrollPane scrpLista;
	private JList<Alumno> lstAlumnos;
	
	public VPruebasUF9_4() {
		setTitle("Pruebas Componentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String diaSel = (String) cmbDias.getSelectedItem();
				Alumno alumno = (Alumno) cmbAlumnos.getSelectedItem();	
				String gustos="";
				
				if(chckLeer.isSelected()) {
					gustos += chckLeer.getText();
				}
				
				if(chckPadel.isSelected()) {
					if(gustos.isEmpty()) {
						gustos += chckPadel.getText();
					}else {
					gustos +=  ", "+chckPadel.getText();
					}
				}
				
				if(chckMúsica.isSelected()) {
					if(!gustos.isEmpty()) {
						gustos += ", ";
					}
					gustos += chckMúsica.getText();
				}
			
		
				String sexo= "";
				
				if(rbtnHombre.isSelected()) {
					sexo += rbtnHombre.getText();
				}else if(rbtnMujer.isSelected()){
					sexo += rbtnMujer.getText();
				}else {
					sexo += rbtnOtro.getText();
				}
				
				
				int edad= (int)spnEdad.getValue();//esto es para que coja el valor del spn
				
				String seleccion= "Día seleccionado" + diaSel
						+"\nAlumno seleccionado: " + alumno
						+"\nGustos: " + gustos
						+"\nSexo: " + sexo
						+"\nEdad: " + edad;
				
				if(lstAlumnos.getSelectedIndex() != -1) { //queremos que añada el titulo si hay algún elemento seleccionado
					seleccion += "\nLista de alumnos seleccionados";
					ArrayList<Alumno> listaAlumnosSel = (ArrayList<Alumno>)lstAlumnos.getSelectedValuesList();
					
					for(Alumno alum: listaAlumnosSel) {
						seleccion += "\n"+alum;
					}
				}
				
				
				
				
				txtPruebas.setText(seleccion);
				
			}
			
		});
		
		btnNewButton.setIcon(new ImageIcon(VPruebasUF9_4.class.getResource("/img/button.png")));
		btnNewButton.setBounds(218, 308, 50, 50);
		getContentPane().add(btnNewButton);
		
		scrpPruebas = new JScrollPane();
		scrpPruebas.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrpPruebas.setBounds(112, 29, 361, 50);
		getContentPane().add(scrpPruebas);
		
		txtPruebas = new JTextArea();
		scrpPruebas.setViewportView(txtPruebas);
		txtPruebas.setLineWrap(true);
		
		cmbDias = new JComboBox<String>();
		cmbDias.setModel(new DefaultComboBoxModel<String>(new String[] {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"}));
		cmbDias.setBounds(143, 111, 79, 21);
		getContentPane().add(cmbDias);
		
		cmbAlumnos = new JComboBox<Alumno>();
		DefaultComboBoxModel<Alumno> dcmb = new DefaultComboBoxModel<Alumno>();
		dcmb.addElement(new Alumno("Diego", "Rodriguez", "12345678J"));
		dcmb.addElement(new Alumno("Carlos", "Ramos", "12345678J"));
		dcmb.addElement(new Alumno("Rubén", "Balboa", "12345678J"));
		dcmb.addElement(new Alumno("Juan Manuel", "Guerra", "12345678J"));
		dcmb.addElement(new Alumno("Diego", "Rodriguez", "12345678J"));
		dcmb.addElement(new Alumno("Diego", "Rodriguez", "12345678J"));
		cmbAlumnos.setModel(dcmb);//añadimos la colección que rellena el combobox
		cmbAlumnos.setBounds(267, 111, 212, 21);
		getContentPane().add(cmbAlumnos);
		
		chckLeer = new JCheckBox("Leer");
		chckLeer.setBounds(73, 149, 93, 21);
		getContentPane().add(chckLeer);
		
		chckPadel = new JCheckBox("Padel");
		chckPadel.setBounds(185, 149, 93, 21);
		getContentPane().add(chckPadel);
		
		chckMúsica = new JCheckBox("Música");
		chckMúsica.setBounds(303, 149, 93, 21);
		getContentPane().add(chckMúsica);
		
		rbtnHombre = new JRadioButton("Hombre");
		rbtnHombre.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("Radiobutton Hombre Seleccionado");
					chckLeer.setVisible(false);
				} else if(e.getStateChange() == ItemEvent.DESELECTED) {
					chckLeer.setVisible(true);
				}
			}
		});
		
		
		btngSexo.add(rbtnHombre);
		rbtnHombre.setBounds(35, 172, 103, 21);
		getContentPane().add(rbtnHombre);
		
		rbtnMujer = new JRadioButton("Mujer");
		btngSexo.add(rbtnMujer);
		rbtnMujer.setBounds(184, 172, 103, 21);
		getContentPane().add(rbtnMujer);
		
		rbtnOtro = new JRadioButton("Otro");
		btngSexo.add(rbtnOtro);
		rbtnOtro.setSelected(true);
		rbtnOtro.setBounds(313, 172, 103, 21);
		getContentPane().add(rbtnOtro);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(35, 202, 131, 35);
		getContentPane().add(passwordField);
		
		spnEdad = new JSpinner();
		spnEdad.setEditor(new JSpinner.DefaultEditor(spnEdad)); //esto es para que no se pueda editar el spinner, es decir para
		spnEdad.setModel(new SpinnerNumberModel(0, 0, 115, 1)); //para no borrarlo y poner nosotros lo que queramos
		spnEdad.setBounds(428, 221, 113, 21);
		getContentPane().add(spnEdad);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(351, 224, 45, 13);
		getContentPane().add(lblEdad);
		
		scrpLista = new JScrollPane();
		scrpLista.setBounds(307, 308, 234, 50);
		getContentPane().add(scrpLista);
		
		
		lstAlumnos = new JList<Alumno>();
		
		DefaultListModel<Alumno> dlm = new DefaultListModel<Alumno>();
		dlm.addElement(new Alumno("Diego", "Rodriguez", "12345678J"));
		dlm.addElement(new Alumno("Carlos", "Ramos", "12345678J"));
		dlm.addElement(new Alumno("Rubén", "Balboa", "12345678J"));
		dlm.addElement(new Alumno("Juan Manuel", "Guerra", "12345678J"));
		dlm.addElement(new Alumno("Diego", "Rodriguez", "12345678J"));
		dlm.addElement(new Alumno("Diego", "Rodriguez", "12345678J"));
		lstAlumnos.setModel(dlm);
		
		scrpLista.setViewportView(lstAlumnos);
		
		
		setSize(600,450);
		setLocationRelativeTo(null);
		
	}
	
	public void hacervisible() {
		setVisible(true);
	}
}

