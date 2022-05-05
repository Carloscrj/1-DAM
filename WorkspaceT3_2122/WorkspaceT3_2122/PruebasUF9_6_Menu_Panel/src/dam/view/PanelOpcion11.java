package dam.view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelOpcion11 extends JPanel {
	private static final int RESTA_ANCHO = VPruebasUF9_6.ANCHO - 15;
	private static final int RESTA_ALTO = VPruebasUF9_6.ALTO -70;
	
	public PanelOpcion11() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblOpcion11 = new JLabel("Opci\u00F3n 11");
		lblOpcion11.setFont(new Font("Arial", Font.PLAIN, 11));
		lblOpcion11.setForeground(Color.ORANGE);
		lblOpcion11.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblOpcion11, BorderLayout.CENTER);
		
		setSize(RESTA_ANCHO, RESTA_ALTO);
	}

}
