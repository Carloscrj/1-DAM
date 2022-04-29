package dam.ej31.pojo;

public class Alumno {
	String nombre;
	int notaTareas;
	int notaExamen;
	int notaActitud;


	
	
	public Alumno(String nombre, int notaTareas, int notaExamen, int notaActitud) {
		this.nombre = nombre;
		this.notaTareas = notaTareas;
		this.notaExamen = notaExamen;
		this.notaActitud = notaActitud;
	}
	
	
	public double getNotaFinal() {
		double notaFinal=0;
		if(notaExamen>=4 && notaTareas>=5) {
			notaFinal= (notaTareas*0.6)+(notaExamen*0.3)+(notaActitud*0.1);
		} else {
			notaFinal= (notaExamen*0.9)+(notaActitud);
		}
		return notaFinal;
	}
	
	 public String toString() {
			return "El nombre es "+nombre+", la nota de las tareas es "+notaTareas+", la nota  del examen es "+notaExamen+
					" y la nota de la actitud es "+notaActitud;
		}


	public String getNombre() {
		return nombre;
	}


	
	
}
	