package pruebas.herencia.model;

import java.io.IOException;

public class TpEjecucion extends TareaPeriodica {
	private String cmd;
	
	/*public TpEjecucion (int period, String cmd) {
		this.periodo=periodo;
		this.cmd= cmd;
		actualizarUltEjec();
	}*/
	
	public TpEjecucion(int periodo, String cmd) {
		super();
		this.cmd=cmd;
	}
	
	public String leerCmd() {
		return cmd;
	}
	
	@Override
	public void ejecutarTarea() {
		super.ejecutarTarea();
		try {
			Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			System.out.println("Error, no es posible ejecutar el comando");
		}
		
	}

	
	
}
