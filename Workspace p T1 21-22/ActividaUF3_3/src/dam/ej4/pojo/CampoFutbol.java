package dam.ej4.pojo;

public class CampoFutbol {

	private String nombre;
	private double largo;
	private double ancho;
	private int espectadores;
	
	public CampoFutbol(String nombre, double largo, double ancho, int espectadores) {
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.espectadores = espectadores;
	}
	
	public double calculararea() {
		double area = largo * ancho;
		return area;
	}
	
	public double calculaperimetro() {
		double perimetro = (largo*2) + (ancho*2);
		return perimetro;
	}
	
	public String toString() {
		return "El nombre es"+nombre+"el largo es"+largo+"el ancho es"+ancho+" y el numero de espectadores es"+espectadores;
	}

	public int getEspectadores() { //necesitamos crear el getter de campo de futbol 
		return espectadores;       //para luego poder acceder a su información y compararlo.
	}
	
	public String getNombre() {  //creamos este get para que nos de los nombre en la clase main.
		return nombre;
	}
	
	
}
