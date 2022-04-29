package dam.campo4p.pojo;

public class Campito {
	
	static final int MIN_ANCHO = 64;
	static final int MAX_ANCHO = 75;
	static final int MIN_LARGO = 100;
	static final int MAX_LARGO = 110;
	
	private String nombre;
	private int largo;
	private int ancho;
	private int capacidad;
	
	
	public Campito(String nombre, int largo, int ancho, int capacidad) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.capacidad = capacidad;
	}
	
	
	public double calcularPerimetro() {
		double perimetro= (largo*2)+(ancho*2);
		return perimetro;
	}
	
	
	public double calcularArea() {
		
		double area= largo*ancho;
		return area;
		
	}
	
	public int getCapacidad() { //necesitamos crear el getter de campo de futbol 
		return capacidad;       //para luego poder acceder a su información y compararlo.
	}
	
	
	public String toString() {
		return "El nombre es "+nombre+" el largo es "+largo+"el ancho es "+ancho+" y el numero de espectadores es "+capacidad;
	}
	
	public String getNombre() {  //creamos este get para que nos de los nombre en la clase main.
		return nombre;
	}
	
	
	public boolean esOficialFIFA() {
		boolean esOficial = ancho >= MIN_ANCHO && ancho <= MAX_ANCHO 
				&& largo >= MIN_LARGO && largo <= MAX_LARGO;
		return esOficial;
	}

}
