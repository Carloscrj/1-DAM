package dam.excepciones;

public class FueraDeRangoException extends Exception { //va a heredar la caracteristica de la clase que extiende
	
	public FueraDeRangoException() {
		super("El valor introducido esta fuera de rango"); //esto es un constructor
	}
	
	public FueraDeRangoException(String msg) {
		super(msg);
	}
}
