package dam.model;

public class Encuesta {
	public static final String PREG_EDAD= "Edad:";
	public static final String PREG_COVID= "Ha pasado el covid";
	public static final String PREG_SINTOMAS= "Sintomas:";
	public static final String PREG_GRAV= "Gravedad:";
	
	public static final String[]NIVELES_GRAV= {"Ninguna", "Leve", "Media", "Alta", "Hospitalización"};
	public static final String[]RESP_COVID= {"SI","NO"};
	
	private int edad;
	private boolean covid;
	private String sintomas;
	private int gravedad;
	
	public Encuesta(int edad, boolean covid, String sintomas, int gravedad) {
		this.edad = edad;
		this.covid = covid;
		this.sintomas = sintomas;
		this.gravedad = gravedad;
	}

	@Override
	public String toString() {
		return PREG_EDAD+ edad + "\n" +PREG_COVID+ traducirCovid() + "\n" +PREG_SINTOMAS+ sintomas + "\n" +PREG_GRAV+ traducirGravedad();
	}
	
	
	private String traducirGravedad() {
		return NIVELES_GRAV[gravedad-1];
	}

	private String traducirCovid() {
		return covid? RESP_COVID[0]:RESP_COVID[1];
	}
	
	
	
}
