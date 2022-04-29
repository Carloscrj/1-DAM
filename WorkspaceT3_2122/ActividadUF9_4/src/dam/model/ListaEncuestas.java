package dam.model;

import java.util.ArrayList;

public class ListaEncuestas {
	private ArrayList<Encuesta>listado;

	public ListaEncuestas(ArrayList<Encuesta> listado) {
		listado= new ArrayList<Encuesta>();
	}

	public ArrayList<Encuesta> getListado() {
		return listado;
	}

	public void addEncuesta(Encuesta e) {
		listado.add(e);
	}

	@Override
	public String toString() {
		return "ListaEncuestas [listado=" + listado + "]";
	}
	
	
	
	
	
	
}


