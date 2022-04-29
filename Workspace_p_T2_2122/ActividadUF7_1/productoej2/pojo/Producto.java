package productoej2.pojo;

public class Producto {
	
		private String nombre;
		private int cantidad;
		
		public Producto(String nombre, int cantidad) {
			this.nombre = nombre;
			this.cantidad = cantidad;
		}

		
		
		public String getNombre() {
			return nombre;
		}



		public String toString() {
			return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + "]";
		}
		
		
		public boolean equals(Producto obj) {
			boolean iguales= false;
			
			if(nombre.equals(((Producto)obj).nombre)&& cantidad== ((Producto)obj).cantidad) {
				iguales= true;
			}
			return iguales;
		}
		
		
		public int hashCode() {
			int hashCode= nombre.hashCode()+ cantidad;
			
			return hashCode;
		}
		
		

	}

