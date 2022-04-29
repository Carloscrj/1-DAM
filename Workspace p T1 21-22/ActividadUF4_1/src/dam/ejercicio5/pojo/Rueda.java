package dam.ejercicio5.pojo;

public class Rueda {

	private String marca;
	private double grosor;
	private double diametro;
	
	public Rueda(String marca, double grosor, double diametro) {
		this.marca = marca;
		this.grosor = grosor;
		this.diametro = diametro;
	}
	
	public String calcularDiametro() {										
		if(diametro>1.4){													
			return "La rueda es para un vehiculo grande";
		}else if(diametro<=1.4 && diametro>0.8){
			return "La rueda es para un vehículo mediano";
		}else {
			return "La rueda es para un vehículo pequeño";
	 }
	}
	
		
	public String calcularGrosor() {
			if(diametro>1.4 && grosor<0.4){
				return "El grosor para esta rueda es inferior al recomendado";
			}else if(diametro<=1.4 && grosor>0.8){
				return "El grosor para esta rueda es inferior al recomendado";
			}else {
				return "La rueda tiene un grosor adecuado";
		}
	 }
	
	public String getMarca() {  //creamos este get para que nos de los nombre en la clase main.
		return "La rueda es de la marca " +marca;
	}

}
