package dam.ej9.pojo;

public class Encuesta {
	private int sexo;
	private int trabaja;
	private int salario;
	
	public Encuesta(int sexo, int trabaja, int salario) {
		this.sexo = sexo;
		this.trabaja = trabaja;
		this.salario = salario;
	}

	public int getSexo() {
		return sexo;
	}

	public int getTrabaja() {
		return trabaja;
	}

	public int getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		String resultado = "\n - Sexo: " + traducirSexo() + "\n�Trabaja? " + traducirTrabaja();
		if (trabaja == 1) {
			resultado += "\nSalario: " + salario;
		}
		return  resultado;
	}

	private String traducirTrabaja() {
		return trabaja == 1? "SI":"NO";
	}

	private String traducirSexo() {
		String s = sexo == 1? "Hombre":"Mujer";
		return s;
	}
}
