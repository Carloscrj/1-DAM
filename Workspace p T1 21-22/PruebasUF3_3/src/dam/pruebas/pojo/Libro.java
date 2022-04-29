package dam.pruebas.pojo;

public class Libro {
	
	//atributos globales: creados dentro del bloque de la clase
	private String titulo;
	private String autor;
	private int numPag;
	private boolean tapaTipo;
	
	//métodos de acceso: métodos público para acceder a los atributos que son privados
	//métodos get para obtener los valores de cada atributo, le ponemos el nombre que queramos (getTitulo)
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getnumPag() {
		return numPag;
	}
	
	public boolean getTapaTipo() {
		return tapaTipo;
	}
	
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	public void setTapaTipo(boolean tapaTipo) {
		this.tapaTipo = tapaTipo;
	}
	
	
	
	
	}
