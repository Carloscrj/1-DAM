package ej3.agregacion;

public class Ordenador {
	private CPU cpu;
	private Pantalla pantalla;
	private Teclado teclado;
	private Raton raton;
	
	public Ordenador(CPU cpu, Pantalla pantalla, Teclado teclado, Raton raton) {
		this.cpu = cpu;
		this.pantalla = pantalla;
		this.teclado = teclado;
		this.raton = raton;
	}

	public CPU getCpu() {
		return cpu;
	}
	
	public Pantalla getPantalla() {
		return pantalla;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public Raton getRaton() {
		return raton;
	}

		
}
