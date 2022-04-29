package dam.campo4p.main;

import java.util.Scanner;

import dam.campo4p.pojo.Campito;



class CompararCampitosF {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca nombre del campo");
		String nombre= teclado.nextLine();
		System.out.println("Introduzca el largo del campo");
		int largo=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca el ancho del campo");
		int ancho=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca el número de espectadores");
		int capacidad=Integer.parseInt(teclado.nextLine());
		
		
		Campito campo1 = new Campito(nombre, largo, ancho, capacidad);
		
		
		
		
		System.out.println("Introduzca nombre del campo");
		String nombre2= teclado.nextLine();
		System.out.println("Introduzca el largo del campo");
		int largo2=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca el ancho del campo");
		int ancho2=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca el número de espectadores");
		int capacidad2=Integer.parseInt(teclado.nextLine());
		
		
		Campito campo2 = new Campito(nombre2, largo2, ancho2, capacidad2);
		
		
		
		System.out.println(campo1.toString());
		System.out.println(campo2.toString());
		
		double p1=campo1.calcularPerimetro();
		double p2=campo2.calcularPerimetro();
		
		double a1=campo1.calcularArea();
		double a2=campo2.calcularArea();
		
		System.out.println("El perímetro del primer campo es "+campo1.calcularPerimetro()+" el area del primer campo es "+campo1.calcularArea()+" y la capacidad es "+campo1.getCapacidad());
		
		
		String nombreMayorPerimetro = (p1>p2)? campo1.getNombre():campo2.getNombre();
		System.out.println("El perímetro mayor es: "+nombreMayorPerimetro);
		
		String nombreMayorEspectadores = (campo1.getCapacidad()>campo2.getCapacidad())? campo1.getNombre():campo2.getNombre();
		System.out.println("El campo con el numero mayor de espectadores es:"+nombreMayorEspectadores);
		
		String nombreMayorArea= (campo1.calcularArea()>campo2.calcularArea())? campo1.getNombre():campo2.getNombre();
		System.out.println("El area mayor es:"+nombreMayorArea);
		
		
		System.out.println("Es el campo " + campo1.getNombre() + " oficial según la FIFA? " 
				+ campo1.esOficialFIFA());

		System.out.println("Es el campo " + campo2.getNombre() + " oficial según la FIFA? " 
				+ campo2.esOficialFIFA());
	}

}
