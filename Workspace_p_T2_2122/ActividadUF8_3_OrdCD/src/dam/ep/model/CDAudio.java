package dam.ep.model;

public class CDAudio extends CD {
	private String título;
	private String interprete;
	
	public CDAudio(int capacidadMB, String tipo, String título, String interprete) {
		super(capacidadMB, tipo);
		this.título = título;
		this.interprete = interprete;
	}

	@Override
	public String toString() {
		return super.toString()+ "CDAudio [título=" + título + ", interprete=" + interprete + "]";
	}
	
	
	
}
