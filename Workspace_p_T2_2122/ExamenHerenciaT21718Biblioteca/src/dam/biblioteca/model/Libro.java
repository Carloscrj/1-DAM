package dam.biblioteca.model;

public class Libro extends Ejemplar {
	private String titulo;
	private String autor;
	private int numPag;
	
	public Libro(int totalEjem, int numEjemPrest, String titulo, String autor, int numPag) {
		super(totalEjem, numEjemPrest);
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return "Libro: -Titulo=" + titulo + " Autor:" + autor + " N?mero de p?ginas: "+ numPag +super.toString();
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTotalEjem() {
		return totalEjem;
	}

	

	public int getNumEjemPrest() {
		return numEjemPrest;
	}
	
	
	
	
	
	

}
