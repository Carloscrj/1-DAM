package pruebas.instance.model;

public class Punto3D extends Punto2D {
	
	private int z;

	public Punto3D(int x, int y, int z) {
		super(x, y);  //llama a los atributos de 2D
		this.z = z;
	}
	
	public double calcularDistancia() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
	}
	

}
