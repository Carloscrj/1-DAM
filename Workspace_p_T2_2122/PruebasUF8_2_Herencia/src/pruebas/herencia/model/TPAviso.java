package pruebas.herencia.model;

public class TPAviso extends TareaPeriodica {
	private String aviso;
	
	/*public TPAviso(int periodo, String aviso) { esto es lo mismo que lo de abajo, solo que lo de abajo
		this.periodo=periodo;					lo hacemos con el constructor super, el super coge aviso y actualizar de
		this.aviso = aviso;						la clase que hereda TareaPeriodica
		actualizarUltEjec();
	}*/
	
	public TPAviso(int periodo, String aviso) {
		super(periodo);
		this.aviso = aviso;
	}



	public String leerAviso() {
		return "¡¡¡AVISO!!!"+aviso;
	}
	
	@Override
	public void ejecutarTarea() {
		System.out.println(leerAviso());
	}
}
