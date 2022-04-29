package dam.estudio.art.model;

import java.util.ArrayList;

public class Casa {
 private ArrayList<Estancia> listaEstancias;
 private String direccion;
 
 	public Casa(String direccion) {
 		super();
 		this.direccion = direccion;
 		listaEstancias = new ArrayList<Estancia>();//lo inicializamos nosotros lo dice en el enunciado
 	}

 	public ArrayList<Estancia> getListaEstancias() {
 		return listaEstancias;
 	}

	public void addEstancia(Estancia estancia) {// creao un metoda para añadir estancias
		listaEstancias.add(estancia);
	}

	@Override
	public String toString() {
		String casa=  "Direccion=" + direccion;
		
		for (Estancia estancia : listaEstancias) {
			casa+= "\n" + estancia;
		}
		return casa;
	}
	
	public double calcularTotalM2() {
		double totalM2=0;
		
		//TODO TENER EN CUENTA LOS M2 Y TERRAZA
		for (Estancia estancia : listaEstancias) {
			if (estancia instanceof Cocina) {
				if (((Cocina)estancia).isTendedero()) {
					totalM2 += ((Cocina)estancia).getM2Tend();
				}
			}else if (estancia instanceof Salon) {
				if (((Salon)estancia).isTieneTerraza()) {
					totalM2 += ((Salon)estancia).getM2Terraza();
				}
			}
			totalM2 += estancia.getM2();
		}
		
		return totalM2;
	}
	
	
	


 
 
}
