package listaproductoej2.main;

import java.util.ArrayList;
import java.util.Scanner;

import productoej2.pojo.Producto;


public class ListaDeCompra {

	static Scanner sc;
	static ArrayList<Producto>listaCompra;
	
	public static void main(String[] args) {
		
		 sc = new Scanner(System.in);
		
		listaCompra = new ArrayList<Producto>(); 
		
		realizarAccion();
		
		sc.close();
		
	}

	private static void mostrarLista() {
		
System.out.println("\n Elementos de la lista");
		
		if(listaCompra.isEmpty()) {
			System.out.println("La lista est� vacia.");
		}else {
		for (Producto producto : listaCompra) { 
			System.out.println(producto+" ");
			}
		}
		
		realizarAccion();
		
	}
	

	private static void a�adirProducto() {
		String nombre;
		int cantidad;
		
			nombre = controlarNombre();
			cantidad= controlarCantidad();
			
			Producto producto = new Producto(nombre, cantidad);
			
			if (!listaCompra.contains(producto)) {
	            listaCompra.add(producto);
	        } else {
	            System.out.println("Este producto ya est� en la lista.");
	        }
			
			realizarAccion();
		
		
	}
		

	private static int controlarCantidad() {
		boolean valorNoval = true;
		int cantidad= 0;
		
		while(valorNoval) {
				
			try {
				
				System.out.println("Introduzca cantidad");
				cantidad= Integer.parseInt(sc.nextLine());
				
				if(cantidad>0){ 
					valorNoval=false;
				} else {
					throw new Exception("La cantidad debe ser mayor que 0.");
				}
				
				}
				
				catch (NumberFormatException e) {
				System.out.println("El valor introducido debe ser un n�mero y no una letra");
				
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
		
		}
		return cantidad;
	}

	private static String controlarNombre() {
		boolean valorNoval = true;
		String nombre="";
		
		while(valorNoval) {
			
				System.out.println("Introduzca el nombre del art�culo.");
				nombre= sc.nextLine();
				
				if(nombre.isEmpty()){ 
					System.out.println("Debe introducir el nombre del art�culo.");
				} else {
					valorNoval=false;
				}
		
		}
		return nombre;
	}

	private static void realizarAccion() {
		
		int opcion=0;
		boolean continuar=true;
		
		while(continuar) { 
			try {
				System.out.println("Que acci�n desea realizar"+"\n Pulse 1 para a�adir producto a la lista de la compra"+
						"\n Pulse 2 para eliminar producto"+"\n Pulse 3 para mostrar la lista"+"\n Pulse 4 para terminar");
				
				opcion= Integer.parseInt(sc.nextLine());
				
				if (opcion>0 && opcion<5) {
					continuar= false;
					
				} else {
					System.out.println("Introduzca un n�mero entero del 1 al 4");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Introduzca un n�mero y no una letra");
			}
		}
		
		
		if(opcion==1) {
			a�adirProducto();
		}else if(opcion==2) {
			eliminarProducto();
		}else if(opcion==3) {
			mostrarLista();
		}else {
			System.out.println("La lista ha sido terminada.");
		}
		
		
	}
	

	private static void eliminarProducto() {
		
		if(listaCompra.isEmpty()) {
			System.out.println("La lista est� vacia, a�ada los productos.");
			realizarAccion();
		}
		
		System.out.println("�Que producto desea eliminar?, si no deseas eliminar introduce volver.");
		String elimpro = sc.nextLine();
		
		if(elimpro.equalsIgnoreCase("volver")){
			realizarAccion();
		
		
		for (int i = 0; i < listaCompra.size(); i++) {
			
			if(listaCompra.get(i).getNombre().equalsIgnoreCase(elimpro)) {
				System.out.println("El producto ha sido eliminado."); //hay que poner primero el syso, porque si lo eliminamos 
				listaCompra.remove(i);								  //primero no hace bien el bucle, ya que no lo encuentra
			}else {
				System.out.println("El producto no se encuentra en su lista.");
			}
		}
		
		
		realizarAccion();
	}
  }
}


