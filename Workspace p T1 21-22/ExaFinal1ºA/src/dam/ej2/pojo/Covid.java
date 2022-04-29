package dam.ej2.pojo;

import java.util.StringTokenizer;

public class Covid {
	private int edad;
	private String pasado;
	private String sintomas;
	private int nivelGravedad;
	
	public Covid(int edad, String pasado, String sintomas, int gravedad) {
		this.edad = edad;
		this.pasado = pasado;
		this.sintomas = sintomas;
		this.nivelGravedad = gravedad;
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



	public int getNivelGravedad() {
		return nivelGravedad;
	}



	@Override
	public String toString() {
		return "Las caracteristicas del paciente son: edad=" + edad + ", pasado=" + pasado + ", sintomas=" + sintomas + ", nivelGravedad="
				+ traducirGravedad();
	}



	public String traducirGravedad() {
		String gravedad= "";
		switch (nivelGravedad) {
		case 1 :
			gravedad="ninguna";
			break;
		case 2 :
			gravedad="leve";

			break;
		case 3:
			gravedad="media";

			break;
		case 4:
			gravedad="alta";

			break;
		case 5:
			gravedad="hospitalizacion";

			break;
		
		default:
			System.out.println("No tiene gravedad estandar");
			break;
		}
			return gravedad;
			
		
	}
	
	public int numSintomas(){
		int cantSintomas=0;
		StringTokenizer st = new StringTokenizer(sintomas, ",");
		cantSintomas= st.countTokens();
		return cantSintomas;
	}


	
	
	
}
