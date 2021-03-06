package dam.biblioteca.model;

	public class Ejemplar {
	protected int totalEjem;
	protected int numEjemPrest;
	
	public Ejemplar(int totalEjem, int numEjemPrest) {
		this.totalEjem = totalEjem;
		this.numEjemPrest = numEjemPrest;
	}
	
	public boolean prestarEjemplar() {
		boolean prestado=false;
		
		if(totalEjem-numEjemPrest>0) {
			numEjemPrest++;
			prestado=true;
		}
		
		return prestado;
	}
	//no necesitamos los else en ninguno de los dos metodos porque ya inicializamos en false
	
	public boolean devolverEjemplar() {
		boolean prestado=false;
		
		if (numEjemPrest>0) {
			numEjemPrest--;
			prestado=true;
		}
		
		return prestado;
	}

	@Override
	public String toString() {
		return ", -Total de ejemplares: " + totalEjem + ", -N?meros de ejemplares prestados: " + numEjemPrest + ".";
	}
	
	public void mostrarDatos(){
		System.out.println(this);
	}

	public int getTotalEjem() {
		return totalEjem;
	}

	

	public int getNumEjemPrest() {
		return numEjemPrest;
	}

	
	
	
	

}
