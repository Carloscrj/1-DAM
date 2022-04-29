package dam.coche1p.pojo;

public class Cochito {
	
	private String matricula;
	private int velocidad;
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getVelocidad() {
		return velocidad;
	}


	public void acelerar() {
		velocidad+=10;	
	}
	
	public void frenar() {
		velocidad-=10;
	}
	
	public void parar() {
		velocidad=0;	
	}
	

}
