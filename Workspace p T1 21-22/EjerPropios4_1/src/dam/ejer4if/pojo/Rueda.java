package dam.ejer4if.pojo;

public class Rueda {
	
	String marca;
	double grosor;
	double diametro;
	
	
	 public Rueda(String marca, double diametro, double grosor) {
		super();
		this.marca = marca;
		this.grosor = grosor;
		this.diametro = diametro;
	}


	public String comprobarDiametro(){
		 if (diametro>1.4) {
			 return "La rueda es para un vehículo grande";
		 } else if (diametro<=1.4 && diametro>0.8) {
			 return  "La rueda es para un vehículo mediano";
		 }else {
			 return "La rueda es para un vehículo pequeño";
		 }
	 }
	 
	 
	 public String comprobarGrosor() {
		 if (diametro>1.4 && grosor<0.4) {
			 return "El grosor para esta rueda es inferior al recomendado";
	 	} else if (diametro<=1.4 && diametro>0.8 && grosor>0.25) {
	 		return "El grosor para esta rueda es inferior al recomendado";
	 	}else {
	 		return "La rueda tiene un grosor adecuado";
	 	}
	
	 }
	 
	 public String toString() {
			return "La marca es "+marca+" el diametro es "+diametro+" y el grosor es "+grosor;
		}
	 
}
