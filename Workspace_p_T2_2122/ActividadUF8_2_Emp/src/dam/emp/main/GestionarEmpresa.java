package dam.emp.main;

import java.util.Scanner;
import dam.emp.model.Empleado;
import dam.emp.model.EmpleadoDistribucion;
import dam.emp.model.EmpleadoProduccion;
import dam.emp.model.Empresa;

public class GestionarEmpresa {
	static Scanner sc;
	static Empresa empresa;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarEmpresa();
		
		elegir();
		
		sc.close();
	}

	

	private static void elegir() {
		boolean continuar=true;
		int opcion;
		
		while (continuar) {
			
			opcion=darOpciones();
			
			if(opcion==1) {
				elegirEmpleadoyAñadir();
			}else if(opcion==2) {
				mostrarDatosEmpresaySalario();
			}else {
				System.out.println("Fin del proceso.");
				continuar=false;;
			
			}
		}
		
	}



	private static void mostrarDatosEmpresaySalario() {
		System.out.println(empresa);
		System.out.println("Total salarios: "+empresa.calcularTotalSalarios());
		System.out.println();
		
	}



	private static void elegirEmpleadoyAñadir() {
		int tipo= solicitarEmpleado();
		
		if(tipo==1) {
			addProduccion();
		}else  {
			addDistribucion();
		}
		
	}



	private static void addDistribucion() {
		String nombre= solicitarNombre("Introduzca el nombre.");
		String dni= solicitarDni();
		double salario=solicitarDouble("Introduzca el salario.");
		String zona= solicitarNombre("Introduzca la zona.");
		
		EmpleadoDistribucion empleadoDistribucion = new EmpleadoDistribucion(nombre, dni, salario, zona);
		empresa.addEmpleado(empleadoDistribucion);
		
	}

	
	private static void addProduccion() {
		double plusNoct=0;
		
		String nombre= solicitarNombre("Introduzca el nombre.");
		String dni= solicitarDni();
		double salario=solicitarDouble("Introduzca el salario.");
		String turno= solicitarNombre("Introduzca el turno."+"MAÑANA,TARDE O NOCHE");
		if (turno.equalsIgnoreCase("NOCHE")) {
			plusNoct=solicitarDouble("Introduzca el plus de nocturnidad.");
			EmpleadoProduccion empleadoProduccion = new EmpleadoProduccion(nombre, dni, salario, turno, plusNoct);
			empresa.addEmpleado(empleadoProduccion);
		}else {
			plusNoct=0;
			EmpleadoProduccion empleadoProduccion = new EmpleadoProduccion(nombre, dni, salario, turno, plusNoct);
			empresa.addEmpleado(empleadoProduccion);
		}
		
	}



	private static String solicitarDni() {
		String dni="";
		
		do {
			System.out.println("Introduzca el dni.");
			dni= sc.nextLine();
			if (dni.isEmpty()) {
				System.out.println("ATENCIÓN campo vacío.");
			} else if(dni.trim().length()>10) {
				System.out.println("ATENCIÓN el número de caracteres es superior al de un dni.");
			} else if(dni.trim().length()>0 && dni.trim().length()<9) {
				System.out.println("ATENCIÓN el número de caracteres es inferior al de un dni.");
			}
			
		} while (dni.isEmpty() || dni.trim().length()>9||dni.trim().length()>0 && dni.trim().length()<9);
		
		return dni;
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
					System.out.println("El número tiene que ser mayor que 0.");
				}
				}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un número 0 o mayor y no una letra.");
				}
		
		}
		return decimal;
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
				System.out.println("ATENCIÓN campo vacio.");
				
				}
		
		}
		return nombre;
	}



	private static int solicitarEmpleado() {
		String mensaje="Que tipo de empleado deseas introducir";
		for (int i = 0; i < Empleado.EMPLEADOS.length; i++) {
			System.out.println((i+1)+"- para introducir un empleado de "+Empleado.EMPLEADOS [i] );
		}
		
		int tipo= controlOpciones(mensaje,0,Empleado.EMPLEADOS.length);
		
		return tipo;	
	}



	private static int darOpciones() {
		String mensaje=("Que acción desea realizar"+"\n Pulse 1 para añadir empleado"+
				"\n Pulse 2 para mostrar informacion de la empresa total de salarios."+"\n Pulse 3 para finalizar la operación");
		
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
					System.out.println("El número tiene que estar entre"+min+" y "+max+".");
				}
				}catch (NumberFormatException e) { 
				 System.out.println("El valor introducido debe ser un número y no una letra");
				}
		
		}
		return opcion;
		
	}



	private static void inicializarEmpresa() {
		
		System.out.println("Introduce el nombre de la empresa.");
		String nombre= sc.nextLine();
		
		empresa = new Empresa(nombre);
	}

}
