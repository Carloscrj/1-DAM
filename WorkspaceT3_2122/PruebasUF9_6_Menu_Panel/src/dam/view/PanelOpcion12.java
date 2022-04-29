package dam.view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelOpcion12 extends JPanel {
	private static final int RESTA_ANCHO = VPruebasUF9_6.ANCHO - 15;
	private static final int RESTA_ALTO = VPruebasUF9_6.ALTO -70;
	
	public PanelOpcion12() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblOpcion12 = new JLabel("Opci\u00F3n 12");
		lblOpcion12.setFont(new Font("Arial", Font.BOLD, 11));
		lblOpcion12.setForeground(Color.PINK);
		lblOpcion12.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblOpcion12, BorderLayout.CENTER);
		
		setSize(RESTA_ANCHO, RESTA_ALTO);
	}

}
