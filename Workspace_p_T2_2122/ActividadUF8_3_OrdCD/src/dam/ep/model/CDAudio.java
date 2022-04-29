package dam.ep.model;

public class CDAudio extends CD {
	private String t�tulo;
	private String interprete;
	
	public CDAudio(int capacidadMB, String tipo, String t�tulo, String interprete) {
		super(capacidadMB, tipo);
		this.t�tulo = t�tulo;
		this.interprete = interprete;
	}

	@Override
	public String toString() {
		return super.toString()+ "CDAudio [t�tulo=" + t�tulo + ", interprete=" + interprete + "]";
	}
	
	
	
}
