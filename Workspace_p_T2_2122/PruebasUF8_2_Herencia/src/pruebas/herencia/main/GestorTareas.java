package pruebas.herencia.main;

import pruebas.herencia.model.TPAviso;
import pruebas.herencia.model.TPReloj;
import pruebas.herencia.model.TareaPeriodica;
import pruebas.herencia.model.TpEjecucion;

public class GestorTareas {

	public static void main(String[] args) {
		TareaPeriodica tp= new TareaPeriodica(3);
		
		TPAviso tpA = new TPAviso(7, "Estudiar principios de herencia");
		
		TPReloj tpR = new TPReloj();
		
		TpEjecucion tpE = new TpEjecucion(12,"calc");
		
		while (!tp.necesitaEjecucion()) {
			System.out.println("Esperando ejecución de tarea periodica");
			
			try { //esto sirve para que no salgan tanto syso interrumpe la ejecución medio segundo
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		tp.ejecutarTarea();
		

		while (!tpA.necesitaEjecucion()) {
			System.out.println("Esperando ejecución de tarea de aviso....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		tpA.ejecutarTarea();
		
		
		while (!tpR.necesitaEjecucion()) {
			System.out.println("Esperando ejecución de tarea de aviso....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		tpR.ejecutarTarea();
		
		
		while (!tpE.necesitaEjecucion()) {
			System.out.println("Esperando ejecución de tarea de aviso....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		tpE.ejecutarTarea();

	}

}
