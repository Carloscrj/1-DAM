package dam.ejercicio3.pojo;

public class JugadorTenis {
	private String nombre;
	private String nacionalidad;
	private int nGrandSlam;
	private int nMaster1000;
	
	public JugadorTenis(String nombre, String nacionalidad, int nGrandSlam, int nMasters1000) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.nGrandSlam = nGrandSlam;
		this.nMaster1000 = nMasters1000;
	}
	
	public double calcularPuntos() {
		int puntos = (2000*nGrandSlam)+(1000*nMaster1000);
		return puntos;
	}
	
	public String toString() {
		return "<"+nombre+"> - <"+nacionalidad+">\nNúmero de Grand Slam: <"+nGrandSlam+">\nNúmero de Master 1000: <"+nMaster1000+">";	       
	}
	public String getNombre() {  //creamos este get para que nos de los nombre en la clase main.
		return nombre;
	}


}
