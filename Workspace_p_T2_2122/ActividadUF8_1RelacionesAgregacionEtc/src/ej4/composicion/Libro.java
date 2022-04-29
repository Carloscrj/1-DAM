package ej4.composicion;

import java.util.ArrayList;

public class Libro {
	
	private String titulo;
	private String isbn;
	private String autor;
	private int anioPub;
	private ArrayList<Pagina>paginas;
	
	
	
	public Libro(String titulo, String isbn, String autor, int anioPub) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.anioPub = anioPub;
		paginas= new ArrayList<Libro.Pagina>();
	}
	
	



	public String getTitulo() {
		return titulo;
	}





	public String getIsbn() {
		return isbn;
	}





	public String getAutor() {
		return autor;
	}





	public int getAnioPub() {
		return anioPub;
	}





	public ArrayList<Pagina> getPaginas() {
		return paginas;
	}
	
	public void addPagina(Pagina pagina) {
		paginas.add(pagina);
	}





	public class Pagina{ //clase anidada para representar una relación de composición
		private String contenido;
		private int numero;
		
		public Pagina(String contenido, int numero) {
			this.contenido = contenido;
			this.numero = numero;
		}

		public String getContenido() {
			return contenido;
		}

		public int getNumero() {
			return numero;
		}

		public void setContenido(String contenido) {
			this.contenido = contenido;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		
		
		
	}
}
