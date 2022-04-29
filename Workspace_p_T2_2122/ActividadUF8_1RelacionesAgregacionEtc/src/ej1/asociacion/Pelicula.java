package ej1.asociacion;

import java.util.Arrays;

public class Pelicula {
	private String titulo;
	private String director;
	private int duracion;
	private int numActores;
	private Actor [] actores;
	
	public Pelicula() {
		actores = new Actor[15];
	}

	public Pelicula(String titulo, String director, int duracion) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		actores = new Actor[15];
		numActores=0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public void addActor(Actor actor) {
		actores[numActores]= actor;
		numActores++;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", numActores="
				+ numActores + ", actores=" + Arrays.toString(actores) + "]";
	}
	
	public void mostrarPelicula() {
		System.out.println(this);
	}
	
	
}
