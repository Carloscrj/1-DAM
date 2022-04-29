package dam.ej1.pojo;

public class Coche {
private String matricula;
private int velocidad;

public void setMatricula(String matricula) {
	this.matricula= matricula;
}



public String getMatricula() {
	return matricula;
}


public int getVelocidad() {
 return velocidad;
}

public void acelerar() {
		velocidad += 10;// velocidad=velocidad + 10
}

public void frenar() {
	velocidad-=10;
}

public void parar() {
	velocidad = 0;
}


}