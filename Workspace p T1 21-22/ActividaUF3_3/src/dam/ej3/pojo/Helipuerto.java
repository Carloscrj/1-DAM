package dam.ej3.pojo;

public class Helipuerto {
	
	private String nombre;
	private double radio;
	static final double PI=3.1416;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public static double getPi() {
		return PI;
	}
	
	public double calculararea() {
		double area = PI * radio * radio;
		return area;
		
	}
	
	

}
