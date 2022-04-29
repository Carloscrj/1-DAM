package dam.ejer2.main;


import java.util.ArrayList;
import java.util.Scanner;
import dam.ejer2.pojo.Cancion;


public class PlayList {
	static Scanner sc;
	static ArrayList<Cancion>playList;
	static int MIN_SEG=9;
	static int MAX_SEG=601;
	
	public static void main(String[] args) {
		
		 sc = new Scanner(System.in);
			
		playList = new ArrayList<Cancion>(); 
		
		elegir();
			
		sc.close();
			
	}

	private static void elegir() {
		
		boolean continuar=true;
		int opcion;
		
		while (continuar) {
			
			opcion=darOpciones();
			
			if(opcion==1) {
				añadirCancion();
			}else if(opcion==2) {
				eliminarCancionPorGrupoOsolista();
			}else if(opcion==3) {
				mostrarLista();
			}else if(opcion==4) {
				reproducirPosicion();
			}else if(opcion==5) {
				reproducirLista();
			}else if(opcion==6) {
				duracionPlayList();
			}else if(opcion==7) {
				System.out.println("Ha salido de la lista.");
				continuar=false;
			}
		}
		
	}

	private static void añadirCancion() {
		String titulo;
		String grupoOsolista; 
		int durSegundos;
		
			titulo = controlarParte(sc,"Intruduzca el nombre del título.");
			grupoOsolista= controlarParte(sc,"Introduzca el nombre del grupo o solista.");
			durSegundos= controlarDuracion();
			
			Cancion cancion = new Cancion(titulo, grupoOsolista, durSegundos);
			
			if (!playList.contains(cancion)) {
	            playList.add(cancion);
	            System.out.println("Canción añadida, canciones en la lista: "+playList.size());
	        } else {
	            System.out.println("Esta canción ya está en la lista.");
	        }
		
	}

	private static int controlarDuracion() {
		
		boolean valorNoval = true;
		int segundos= 0;
		
		while(valorNoval) {
				
			try {
				
				System.out.println("Introduzca segundos de duración.");
				segundos= Integer.parseInt(sc.nextLine());
				
				if(segundos>MIN_SEG && segundos<MAX_SEG){ 
					valorNoval=false;
				} else {
					throw new Exception("La cantidad de segundos debe ser mayor que 9 y menor que 601.");
				}
				
				}
				
				catch (NumberFormatException e) {
				System.out.println("El valor introducido debe ser un número y no una letra.");
				
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
		
		}
		return segundos;
	}

	private static String controlarParte(Scanner sc, String msj) {
		
		boolean valorNoval = true;
		String parte="";
		
		while(valorNoval) {
				System.out.println(msj);
				parte= sc.nextLine();
				
				if(parte.isEmpty()){ 
					System.out.println("Debe introducir el nombre.");
				} else {
					valorNoval=false;
				}	
			}	
	
		return parte;
	}
	

	private static int darOpciones() {
		
		System.out.println("**BIENVENIDO A LA APLICACIÓN TU PLAY LIST**");
		
		int opcion=0;
		boolean continuar=true;
		
		while(continuar) { 
			try {
				System.out.println("Que acción desea realizar"+"\n Pulse 1 para añadir una canción a la playlist"+
						"\n Pulse 2 para eliminar canción por nombre y grupo o solista"+"\n Pulse 3 Mostrar la lista"+
						"\n Pulse 4 Reproducir una canción por posición"+"\n Pulse 5 Reproducir toda la lista"+
						"\n Pulse 6 Indicar tiempo total de la playlist"+"\n Pulse 7 Salir de la playlist");
				
				opcion= Integer.parseInt(sc.nextLine());
				
				if (opcion>0 && opcion<8) {
					continuar= false;
					
				} else {
					System.out.println("Introduzca un número entero del 1 al 6");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Introduzca un número y no una letra");
			}
		}
		
		return opcion;
	}

	
	private static void duracionPlayList() {
		int suma= 0;
		
		System.out.println("\n Reproducir playlist");
		
		for (int i = 0; i < playList.size(); i++) {
			
			suma+=playList.get(i).getDurSegundos();	
		}
		
		System.out.println("La duración de la lista es "+suma+" segundos."); 
		
	}
	

	private static void reproducirLista() {
		
		System.out.println("\n Reproducir playlist");
		

		if(playList.isEmpty()) {
			System.out.println("La lista está vacia.");
		}else {
			for (int i = 0; i < playList.size(); i++) {
				
				System.out.println("Se está reproduciendo "+ playList.get(i).getTitulo()+" de "+ playList.get(i).getGrupoOsolista()); 
					
			}
			
		}
		
	}
	

	private static void reproducirPosicion() {
		
		int pos= controlarPosicion()-1;
			
			
				System.out.println("Se está reproduciendo la canción "+playList.get(pos).getTitulo()+" de "+playList.get(pos).getGrupoOsolista()); 
									  
			
		}
		
		
	private static int controlarPosicion() {
		boolean valorNoval = true;
		int posicion= 0;
		
		while(valorNoval) {
				
				
				System.out.println("Introduzca la posición de la canción que desé reproducir.");
				posicion= Integer.parseInt(sc.nextLine());
				
				if(posicion>0 && posicion<=playList.size()){ 
					valorNoval=false;
				} else {
					System.out.println("La posición debe ser mayor que 0 y menor o igual que "+playList.size()+
							" ,es decir el número de canciones de su playlist.");
				}
				//el playList.size() te devuelve el tamaño de la lista no a través de la posición del array, si metes una canción te sale 1, no la posición 0.
		}
		return posicion;
	}
	

	private static void mostrarLista() {
		
		System.out.println("\n Elementos de la lista");
		
		if(playList.isEmpty()) {
			System.out.println("La lista está vacia.");
		}else {
			 for (int i = 0; i < playList.size(); i++) {
	                System.out.println((i+1)+" "+playList.get(i).getTitulo()+" de "+playList.get(i).getGrupoOsolista());
	            }
		    /*for (Cancion cancion : playList) { Si no nos pidiese marca 1ª,2ª... nos valdría con este método
			  System.out.println(cancion+" ");
			  }*/
		}
		
	}

	private static void eliminarCancionPorGrupoOsolista() {
		String eliCancion = controlarParte(sc,"¿Qué canción desea eliminar?");
		String eliGrupo = controlarParte(sc,"¿De que grupo o solista es?");
		
		
		
		for (int i = 0; i < playList.size(); i++) {
			
			if(eliCancion.equalsIgnoreCase(playList.get(i).getTitulo()) && eliGrupo.equalsIgnoreCase(playList.get(i).getGrupoOsolista()) ) {
				System.out.println("La canción ha sido eliminada."); 
				playList.remove(i);
				i=playList.size();
			}else {
				System.out.println("La canción no está en la playlist.");
		
	        }

		}
	
	}
}
