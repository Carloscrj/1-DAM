package dam.biblioteca.main;

import java.util.ArrayList;
import java.util.Scanner;

import dam.biblioteca.model.CD;
import dam.biblioteca.model.CDAudio;
import dam.biblioteca.model.CDVideo;
import dam.biblioteca.model.Ejemplar;
import dam.biblioteca.model.Libro;

public class GestionarBiblioteca {
	static ArrayList<Ejemplar>biblioteca;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		
		biblioteca = new ArrayList<Ejemplar>();
		inicializarBiblioteca();
		elegir();
		
		sc.close();
		
	}

	private static void elegir() {
		boolean continuar=true;
		int opcion;
		
		while (continuar) {
			
			opcion=darOpciones();
			
			if(opcion==1) {
				mostrarLista();
			}else if(opcion==2) {
				devolverEjemplar();
			}else if (opcion==3) {
				alquilarEjemplar();
			}else{
				System.out.println("Fin del proceso.");
				continuar=false;;
			
			}
		}

		
	}

	private static void alquilarEjemplar() {
		System.out.println("?Que ejemplar quieres alquilar?");
		 String objeto= sc.nextLine();
		
		for (Ejemplar ejemplar : biblioteca) {
			
			if (ejemplar instanceof Libro) {
				if (((Libro)ejemplar).getTitulo().equalsIgnoreCase(objeto)) {
					if (ejemplar.prestarEjemplar()) {
			            System.out.println("El ejemplar "+objeto+" ha sido prestado.");
					}else {
			            System.out.println("No hay ejemplares para prestar.");
			        }
				}else {
					System.out.println(objeto+" no se encuentra en la biblioteca.");
				}	
			}
			
			
			if (ejemplar instanceof CD) {
				if (((CD)ejemplar).getNombre().equalsIgnoreCase(objeto)) {
					if (ejemplar.devolverEjemplar()) {
			            System.out.println("El ejemplar"+objeto+"ha sido devuelto.");
					}else {
			            System.out.println("El ejemplar no ha sido prestado.");
			        }
				}else {
					System.out.println(objeto+" no se encuentra en la biblioteca.");
				}	
			}
				
		}
		
		
		
	}
		
	

	private static void devolverEjemplar() {
		
		System.out.println("?Que ejemplar quieres devolver?");
		 String objeto= sc.nextLine();
		 
			/*for (int i = 0; i < biblioteca.size(); i++) {
				if (biblioteca.get(i) instanceof Libro) {
					if (objeto.equalsIgnoreCase(((Libro) biblioteca.get(i)).getTitulo())) {
						i = biblioteca.size();
						if (biblioteca.get(i).devolverEjemplar()) {
				            System.out.println("El ejemplar"+objeto+"ha sido devuelto.");
						}else {
				            System.out.println("El ejemplar no ha sido prestado.");
				        }
					}else {
						System.out.println(objeto+"no se encuentra.");
					}	
				} else if (biblioteca.get(i) instanceof CD) {
					if (objeto.equalsIgnoreCase(((CD) biblioteca.get(i)).getNombre())) {
						i = biblioteca.size();
						
						if (biblioteca.get(i).devolverEjemplar()) {
				            System.out.println("El ejemplar"+objeto+"ha sido devuelto.");
						}else {
				            System.out.println("El ejemplar no ha sido prestado.");
				        }
					}else {
						System.out.println(objeto+"no se encuentra.");
					}	
					}
				}*/
					
			
		
			
			
		
		for (Ejemplar ejemplar : biblioteca) {
			
			if (ejemplar instanceof Libro) {
				if (((Libro)ejemplar).getTitulo().equalsIgnoreCase(objeto)) {
					if (ejemplar.devolverEjemplar()) {
			            System.out.println("El ejemplar"+objeto+"ha sido devuelto.");
					}else {
			            System.out.println("El ejemplar no ha sido prestado.");
			        }
				}else {
					System.out.println(objeto+"no se encuentra.");
				}	
			}
			
			
			if (ejemplar instanceof CD) {
				if (((CD)ejemplar).getNombre().equalsIgnoreCase(objeto)) {
					if (ejemplar.devolverEjemplar()) {
			            System.out.println("El ejemplar"+objeto+"ha sido devuelto.");
					}else {
			            System.out.println("El ejemplar no ha sido prestado.");
			        }
				}else {
					System.out.println(objeto+"no se encuentra.");
				}	
			}
				
		}
		
	}
	

	private static void mostrarLista() {
		System.out.println(biblioteca);
	}
	

	private static int darOpciones() {
		String mensaje=("Que acci?n desea realizar"+"\n Pulse 1 para mostrar lista"+
				"\n Pulse 2 para devolver un ejemplar."+"\n Pulse 3 para alquilar un ejemplar"+"\n Pulse 4 para salir");
		
		int opcion= controlOpciones(mensaje,1,4);

		return opcion;

	}
	

	private static int controlOpciones(String mensaje, int min, int max) {
		boolean valorNoval = true;
		int opcion=0;
		
		while(valorNoval) {
			try {
				System.out.println(mensaje);
				opcion= Integer.parseInt(sc.nextLine());
				
				if(opcion>=min && opcion<=max) {
					valorNoval = false;
				} else {
					System.out.println("El n?mero tiene que estar entre"+min+" y "+max+".");
				}
				}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un n?mero y no una letra");
				}
		
		}
		return opcion;
	}
	

	private static void inicializarBiblioteca() {
		
		Libro libro = new Libro(4, 2, "El Se?or de los anillos", "J.R.R Tolkien", 1368);
		biblioteca.add(libro);
		
		Libro libro2 = new Libro(4, 0, "Diez negritos", "Agatha Christie", 256);
		biblioteca.add(libro2);
		
		CDAudio cdAudio = new CDAudio(3, 1, "Thriller", 43, 9);
		biblioteca.add(cdAudio);
		
		CDAudio cdAudio2 = new CDAudio(3, 3, "Back in Black", 42, 10);
		biblioteca.add(cdAudio2);
		
		CDVideo cdVideo = new CDVideo(4, 3, "Star Wars", 128, "Aventuras");
		biblioteca.add(cdVideo);
		
		CDVideo cdVideo2 = new CDVideo(3, 1, "TIERRA", 100, "Documental");
		biblioteca.add(cdVideo2);
		
	}

}
