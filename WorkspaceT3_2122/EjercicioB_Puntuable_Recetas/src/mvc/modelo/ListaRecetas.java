package mvc.modelo;

import java.util.ArrayList;



public class ListaRecetas {
	
	private ArrayList<Receta> listaRecetas;
	
	public ListaRecetas() { //constructor
		listaRecetas = new ArrayList<>(); //inicializamos el arraylist para cuando empecemos a introducir encuestas
	}

	
	public void nuevaReceta(Receta receta) { //m?todo para a?adir encuestas
		listaRecetas.add(receta);
	}


	public ArrayList<Receta> getListaRecetas() {
		return listaRecetas;
	}

	

	
	
	

}
