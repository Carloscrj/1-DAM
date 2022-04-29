package dam.ejer2.pojo;



public class Cancion {
	
	private String titulo;
	private String grupoOsolista;
	private int durSegundos;
	
	public Cancion(String titulo, String grupoOsolista, int durSegundos) {
		this.titulo = titulo;
		this.grupoOsolista = grupoOsolista;
		this.durSegundos = durSegundos;
	}

	public String getTitulo() {
		return titulo;
	}


	public String getGrupoOsolista() {
		return grupoOsolista;
	}


	public int getDurSegundos() {
		return durSegundos;
	}

	@Override
	public String toString() {
		return "-** Cancion: "+ titulo +". Grupo o solista: "+ grupoOsolista+". Duración: "+durSegundos+" segundos. **-";
	}

	public boolean equals(Cancion obj) {
		boolean iguales= false;
		
		if(titulo.equals(((Cancion)obj).titulo)&& grupoOsolista== ((Cancion)obj).grupoOsolista) {
			iguales= true;
		}
		return iguales;
	}
	
	
	public int hashCode() {
		int hashCode= titulo.hashCode() + grupoOsolista.hashCode();
		
		return hashCode;
	}
	
	
	
	
	

}
