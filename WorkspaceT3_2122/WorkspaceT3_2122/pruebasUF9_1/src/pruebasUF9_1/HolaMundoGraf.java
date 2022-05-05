package pruebasUF9_1;

import javax.swing.*;//ponemos asteriscos para quitar los import y que no nos de error


public class HolaMundoGraf {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana HolaMundo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hola Mundo, que tal?"); //
		frame.getContentPane().add(label); //accedemos al contenedor de la ventana y añadimos la etiqueta
		frame.pack(); //tamaño que tiene
		frame.setLocationRelativeTo(null); //para posicionarlo en la pantalla
		frame.setVisible(true); //para hacerlo visible, esto es lo ultimo que tenemos que hacer de la ventana 

	}

}
