package dam.ep.main;

import java.util.ArrayList;
import java.util.Scanner;


import dam.ep.model.CD;
import dam.ep.model.CDAudio;
import dam.ep.model.CDDatos;
import dam.ep.model.CDMp3;
import dam.ep.model.CDSoftware;



public class GestorCDs {
	static Scanner sc;
	static ArrayList<CD>listaCD;
	//static CD cd;
	
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		
		listaCD = new ArrayList<CD>();
		elegir();
		
		sc.close();
	}
	
	/*private static void inicializarCD() {
		System.out.println("Introduce el nombre del cd.");
		String tipo= sc.nextLine();
		
		//cd = new CD(tipo);
		
	}*/
	
	private static void elegir() {
		boolean continuar=true;
		int opcion;
		
		while (continuar) {
			
			opcion=darOpciones();
			
			if(opcion==1) {
				addCD();
			}else if(opcion==2) {
				mostrarLista();
			}else {
				System.out.println("Fin del proceso.");
				continuar=false;
			}
		}
		
	}
	private static void mostrarLista() {
		if(listaCD.isEmpty()) {
			System.out.println("La lista est? vacia.");
		}else {
		for (CD cd : listaCD) { 
			System.out.println(cd+" ");
			}
		}
		
		/*String cds="";
		 for (CD cd : listaCD) {
			if (cd instanceof CDAudio) {
				((CDAudio)cd).toString();
			}
			return cds;
		} de esta forma ser?a para sacarlos en orden me piden en el enunciado*/
	}
	private static void addCD() {
		int tipo= solicitarCD();
		
		if(tipo==1) {
			addCDAudio();
		}else if(tipo==2) {
			addCDMp3();
		}else if(tipo==3) {
			addCDSoftware();
		}else if(tipo==4) {
			addCDatos();
		}

		
	}
	private static void addCDatos() {
			int capacidadMB=solicitarInteger("Que capacidad tiene el CD");
			String tipo=solicitarString("introduzca tipo");
			String identificador=solicitarString("introduzca identificador");
			String tipoDeDatos=solicitarString("introduzca tipo de datos");
			
			CDDatos cdDatos= new CDDatos(capacidadMB, tipo, identificador, tipoDeDatos);
			listaCD.add(cdDatos);
		
	}
	private static void addCDSoftware() {
		int capacidadMB=solicitarInteger("Que capacidad tiene el CD");
		String tipo=solicitarString("introduzca tipo");
		String identificador=solicitarString("introduzca identificador");
		
		CDSoftware cdSoftware= new CDSoftware(capacidadMB, tipo, identificador);
		listaCD.add(cdSoftware);
	
		
	}
	
	private static void addCDMp3() {
		int capacidadMB=solicitarInteger("Que capacidad tiene el CD");
		String tipo=solicitarString("introduzca tipo");
		String nombre=solicitarString("introduzca nombre");
		int numCanciones=solicitarInteger("Que capacidad tiene el CD");
		
		CDMp3 cdMp3= new CDMp3(capacidadMB, tipo, nombre, numCanciones);
		listaCD.add(cdMp3);
		
	}
	private static void addCDAudio() {
		int capacidadMB=solicitarInteger("Que capacidad tiene el CD");
		String tipo=solicitarString("introduzca tipo");
		String t?tulo=solicitarString("introduzca titulo");
		String interprete=solicitarString("introduzca interprete");
		
		CDAudio cdAudio = new CDAudio(capacidadMB, tipo, t?tulo, interprete);
		listaCD.add(cdAudio);
		
	}
	private static String solicitarString(String mensaje) {
		boolean valorNoval = true;
		String nombre="";
		
		while(valorNoval) {
			
				System.out.println(mensaje);
				nombre= sc.nextLine();
				
				if(nombre.trim().length()>0) {
					valorNoval = false;
				} else {
				System.out.println("ATENCI?N campo vac?o.");
				
				}
		
		}
		return nombre;
	}
	private static int solicitarInteger(String mensaje) {
		boolean valorNoval = true;
		int entero=0;
		
		while(valorNoval) {
			try {
				System.out.println(mensaje);
				entero= Integer.parseInt(sc.nextLine());
				
				if(entero>=0) {
					valorNoval = false;
				} else {
					System.out.println("El n?mero tiene que ser 0 o mayor que 0.");
				}
				}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un n?mero 0 o mayor y no una letra");
				}
		
		}
		return entero;
	}
	private static int solicitarCD() {
		String mensaje="Que tipo de CD deseas introducir";
		for (int i = 0; i < CD.CDs.length; i++) {
			System.out.println((i+1)+"- para introducir una estancia del tipo "+ CD.CDs[i] );
		}
		
		int tipo= controlOpciones(mensaje,0,CD.CDs.length);
		
		return tipo;	
	}
	private static int darOpciones() {
		String mensaje=("Que acci?n desea realizar"+"\n Pulse 1 para a?adir CD"+
				"\n Pulse 2 para mostrar la lista de los CDs"+"\n Pulse 3 para finalizar la operaci?n.");
		
		int opcion= controlOpciones(mensaje,1,3);

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

}
