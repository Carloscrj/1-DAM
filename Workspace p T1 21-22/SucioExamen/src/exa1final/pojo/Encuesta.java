package exa1final.pojo;

public class Encuesta {
	private int edad;
	private String pasado;
	private String sintomas;
	private int gravedad;
	
	public Encuesta(int edad, String pasado, String sintomas, int gravedad) {
		
		this.edad = edad;
		this.pasado = pasado;
		this.sintomas = sintomas;
		this.gravedad = gravedad;
	}

	public int getEdad() {
		return edad;
	}

	public String getPasado() {
		return pasado;
	}

	public String getSintomas() {
		return sintomas;
	}

	public int getGravedad() {
		return gravedad;
	}

	@Override
	public String toString() {
		return "Paciente [edad=" + edad + ", pasado el COVID=" + pasado + ", sintomas=" + sintomas + ", gravedad=" + traducirGravedad();
				
	}
	
	
	public String traducirGravedad() {
	String nivelDeGravedad= "";
	
	if(gravedad==1) {
		nivelDeGravedad= "ninguno";
	} else if(gravedad==2)  {
		nivelDeGravedad= "leve";
	} else if(gravedad==2)  {
		nivelDeGravedad= "media";
	}else if(gravedad==2)  {
		nivelDeGravedad= "alta";
	}else if(gravedad==2)  {
		nivelDeGravedad= "hospitalización";
	}
	return nivelDeGravedad;
	}

	
	
	

}
