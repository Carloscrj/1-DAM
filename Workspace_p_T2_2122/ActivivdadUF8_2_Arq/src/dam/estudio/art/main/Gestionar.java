package dam.estudio.art.main;

import java.util.Scanner;

import dam.estudio.art.model.Banio;
import dam.estudio.art.model.Casa;
import dam.estudio.art.model.Cocina;
import dam.estudio.art.model.Estancia;
import dam.estudio.art.model.Habitacion;
import dam.estudio.art.model.Hall;
import dam.estudio.art.model.Salon;

public class Gestionar {
	static Scanner sc;
	static Casa casa;
	static int contHab;
	static int contBanio;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarCasa();
		
		elegir();
		
		sc.close();
		
	}

	private static void elegir() {
		boolean continuar=true;
		int opcion;
		
		while (continuar) {
			
			opcion=darOpciones();
			
			if(opcion==1) {
				elegirEstancia();
			}else if(opcion==2) {
				mostrarCasa();
			}else {
				System.out.println("Fin del proceso");
				continuar=false;;
			
			}
		}
		
	}

	private static void elegirEstancia() {
		int tipo= solicitarEstancia();
		
		if(tipo==1) {
			addHall();
		}else if(tipo==2) {
			addCocina();
		}else if(tipo==3) {
			addSalon();
		}else if(tipo==4) {
			addHabitacion();
		}else if(tipo==5) {
			addBanio();
		}
		
		
	}

	private static void addHabitacion() {
		
		String nombre= solicitarNombre("Introduzca el nombre.");
		double m2=solicitarDouble("Introduzca los metros cuadrados.");
		int numPuertas= solicitarEntero("Introduzca el número de puertas.");
		int numVentanas= solicitarEntero("Introduzca el número de ventanas.");
		int numPuertasArm= solicitarEntero("Introduzca el número de puertas de los armarios.");;
		boolean accesoBanio= tieneOno("¿Tiene acceso a baño? SÍ o NO.");
		
		Habitacion habitacion = new Habitacion(nombre, m2, numPuertas, numVentanas, numPuertasArm, accesoBanio);
		casa.addEstancia(habitacion);
		contHab++; //aumentamos contador que hemos declarado en mostrarCasa
	}


	private static void addBanio() {
		
		String nombre= solicitarNombre("Introduzca el nombre.");
		double m2=solicitarDouble("Introduzca los metros cuadrados.");
		int numPuertas= solicitarEntero("Introduzca el número de puertas.");
		int numVentanas= solicitarEntero("Introduzca el número de ventanas.");
		boolean banera= tieneOno("¿Tiene bañera? SÍ o NO.");
		boolean ducha= tieneOno("¿Tiene ducha? SÍ o NO.");
		
		Banio banio= new Banio(nombre, m2, numPuertas, numVentanas, banera, ducha);
		casa.addEstancia(banio);
		contBanio++; //aumentamos contador que hemos declarado en mostrarCasa
	}


	private static void addSalon() {
		double m2Terraza=0;
		
		String nombre= solicitarNombre("Introduzca el nombre.");
		double m2=solicitarDouble("Introduzca los metros cuadrados.");
		int numPuertas= solicitarEntero("Introduzca el número de puertas.");
		int numVentanas= solicitarEntero("Introduzca el número de ventanas.");
		int numPuntosRed= solicitarEntero("Introduzca el número de puntos de red.");
		boolean tieneTerraza= tieneOno("¿Tiene terraza? SÍ o NO.");
		if (tieneTerraza) {
			m2Terraza=solicitarDouble("Introduzca los metros cuadrados de terraza.");
			Salon salon= new Salon(nombre, m2, numPuertas, numVentanas, numPuntosRed, tieneTerraza, m2Terraza);
			casa.addEstancia(salon);
		}else {
			m2Terraza=0;
			Salon salon= new Salon(nombre, m2, numPuertas, numVentanas, numPuntosRed, tieneTerraza, m2Terraza);
			casa.addEstancia(salon);
		}
	
	}


	private static void addCocina() {
		
		double m2Tend=0;
		
		String nombre= solicitarNombre("Introduzca el nombre.");
		double m2=solicitarDouble("Introduzca los metros cuadrados.");
		int numPuertas= solicitarEntero("Introduzca el número de puertas.");
		int numVentanas= solicitarEntero("Introduzca el número de ventanas.");
		boolean tendedero= tieneOno("¿Tiene tendedero? SÍ o NO.");
		if (tendedero) {
			m2Tend=solicitarDouble("Introduzca los metros cuadrados del tendedero.");
			Cocina cocina= new Cocina(nombre, m2, numPuertas, numVentanas, tendedero, m2Tend);
			casa.addEstancia(cocina);
		}else {
			m2Tend=0;
			Cocina cocina= new Cocina(nombre, m2, numPuertas, numVentanas, tendedero, m2Tend);
			casa.addEstancia(cocina);
		}
		
	}

	private static void addHall() {
		String nombre= solicitarNombre("Introduzca el nombre");
		double m2=solicitarDouble("Introduzca los metros cuadrados");
		int numPuertas= solicitarEntero("Introduzca el número de puertas"); //las cuatro primeras variables se pueden meter en un metodo y llamarlo
		int numVentanas= solicitarEntero("Introduzca el número de ventanas");//por que en todos los add son iguales.
		boolean puertaBlind= tieneOno("¿Tiene puerta blindada? SÍ o NO");
		
		Hall hall= new Hall(nombre, m2, numPuertas, numVentanas, puertaBlind);
		casa.addEstancia(hall);
		
	}


	


	private static boolean tieneOno(String mensaje) {
		boolean valorNoval = true;
		boolean tiene= false;
		String decision ="";
		
		while(valorNoval) {
			
				System.out.println(mensaje);
				decision= sc.nextLine();
				
				if(decision.isEmpty()) {
					System.out.println("Campo vacío,introduzca SI o NO.");
				}else if(decision.equalsIgnoreCase("SI")||decision.equalsIgnoreCase("SÍ")){
					tiene=true;
					valorNoval=false;
				}else if(decision.equalsIgnoreCase("NO")){
					tiene=false;
					valorNoval=false;
				}else {
					System.out.println("La respuesta debe ser SÍ o NO.");
				}
		
		}
		return tiene;
	}


	private static String solicitarNombre(String mensaje) {
		boolean valorNoval = true;
		String nombre="";
		
		while(valorNoval) {
			
				System.out.println(mensaje);
				nombre= sc.nextLine();
				
				if(nombre.trim().length()>0) {
					valorNoval = false;
				} else {
				System.out.println("ATENCIÓN debe introducir el nombre de la estancia.");
				
				}
		
		}
		return nombre;
	}


	private static double solicitarDouble(String mensaje) {
		boolean valorNoval = true;
		double decimal=0;
		
		while(valorNoval) {
			try {
				System.out.println(mensaje);
				decimal= Double.parseDouble(sc.nextLine());
				
				if(decimal>0) {
					valorNoval = false;
				} else {
					System.out.println("El número tiene que ser 0.");
				}
				}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un número 0 o mayor y no una letra");
				}
		
		}
		return decimal;
	}


	private static int solicitarEntero(String mensaje){
		boolean valorNoval = true;
		int entero=0;
		
		while(valorNoval) {
			try {
				System.out.println(mensaje);
				entero= Integer.parseInt(sc.nextLine());
				
				if(entero>=0) {
					valorNoval = false;
				} else {
					System.out.println("El número tiene que ser 0 o mayor que 0.");
				}
				}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un número 0 o mayor y no una letra");
				}
		
		}
		return entero;
	}


	private static int solicitarEstancia() {
		
				String mensaje="Que tipo de instancia deseas introducir";
				for (int i = 0; i < Estancia.ESTANCIAS.length; i++) {
					System.out.println((i+1)+"- para introducir una estancia del tipo "+ Estancia.ESTANCIAS[i] );
				}
				
				int tipo= controlOpciones(mensaje,0,Estancia.ESTANCIAS.length);
				
				return tipo;	
				
	}
	


	private static int controlOpciones(String mensaje,int min, int max) {
		
		boolean valorNoval = true;
		int opcion=0;
		
		while(valorNoval) {
			try {
				System.out.println(mensaje);
				opcion= Integer.parseInt(sc.nextLine());
				
				if(opcion>=min && opcion<=max) {
					valorNoval = false;
				} else {
					System.out.println("El número tiene que estar entre"+min+" y "+max+".");
				}
				}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un número y no una letra");
				}
		
		}
		return opcion;
	}

	private static void mostrarCasa() {
		System.out.println(casa);
		System.out.println("Total m2: "+casa.calcularTotalM2());
		System.out.println();
		
	}

	private static int darOpciones() {
		
				String mensaje=("Que acción desea realizar"+"\n Pulse 1 para añadir instancia"+
						"\n Pulse 2 para mostrar informacion de la casa"+"\n Pulse 3 para finalizar la operación");
				
				int opcion= controlOpciones(mensaje,1,3);
		
				return opcion;
	}

	private static void inicializarCasa() {
		contHab=0; //esto lo pongo para contar si tiene mas de una habitación o un baño
		contBanio=0;
		System.out.println("Introduce la dirección.");
		String direccion= sc.nextLine();
		
		casa = new Casa(direccion);
		
	}

}
