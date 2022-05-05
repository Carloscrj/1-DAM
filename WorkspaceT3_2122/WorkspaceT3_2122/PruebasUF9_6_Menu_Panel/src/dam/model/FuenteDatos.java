package dam.model;

import java.util.ArrayList;

public class FuenteDatos {
	private ArrayList<Persona> listaPersonas;
	
	public FuenteDatos() {
		listaPersonas = new ArrayList<Persona>();
		rellenarLista();
	}

	private void rellenarLista() {
		listaPersonas.add(new Persona("12345678z", "Pepe", "Botella", 12));
		listaPersonas.add(new Persona("12345678x", "Leticia", "Ortiz", 49));
		listaPersonas.add(new Persona("12345678c", "Sara", "Carbonero", 38));
		listaPersonas.add(new Persona("12345678v", "Iker", "Casillas", 40));
		listaPersonas.add(new Persona("12345678b", "Pablo", "Casado", 41));
		listaPersonas.add(new Persona("12345678m", "Pedro", "Sánchez", 50));
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}
	
}
