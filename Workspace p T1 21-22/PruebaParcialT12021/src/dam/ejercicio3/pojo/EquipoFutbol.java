package dam.ejercicio3.pojo;

public class EquipoFutbol {
	
	private String nombre;
	private String ciudad;
	private int pganados;
	private int pempatados;
	private int pperdidos;
	
	public EquipoFutbol(String nombre, String ciudad, int pganados, int pempatados, int pperdidos) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pganados = pganados;
		this.pempatados = pempatados;
		this.pperdidos = pperdidos;
	}
	
	public double calcularPuntos() {
		int puntos = (3*pganados)+(1*pempatados)+(0*pperdidos);
		return puntos;
	}
	
	public String toString() {
		return "<"+nombre+"> - <"+ciudad+">\nNúmero de partidos ganados: <"+pganados+">\nNúmero de partidos empatados: <"+pempatados+">\nNúmero de partidos perdidos: <"+pperdidos+">";
      
		       
	}
	
	public String getNombre() {  //creamos este get para que nos de los nombre en la clase main.
		return nombre;
	}


}
