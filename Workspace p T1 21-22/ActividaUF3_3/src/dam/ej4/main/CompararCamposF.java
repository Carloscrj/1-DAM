package dam.ej4.main;

import java.util.Scanner;

import dam.ej4.pojo.CampoFutbol;

public class CompararCamposF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca nombre del primer campo futbol");
		String nombre1 = teclado.nextLine();
		System.out.println("Introduzca el largo del primer campo de futbol");
		double largo1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduzca el ancho del primer campo de futbol");
		double ancho1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduzca el numero de espectadores del primer campo de futbol");
		int espectadores1 = Integer.parseInt(teclado.nextLine());
		
		
		System.out.print("Introduzca nombre del segundo campo futbol");
		String nombre2 = teclado.nextLine();
		System.out.println("Introduzca el largo del segundo campo de futbol");
		double largo2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduzca el ancho del segundo campo de futbol");
		double ancho2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduzca el numero de espectadores del segundo campo de futbol");
		int espectadores2 = Integer.parseInt(teclado.nextLine());
		
		CampoFutbol campo1 = new CampoFutbol(nombre1, largo1, ancho1, espectadores1);
		CampoFutbol campo2 = new CampoFutbol(nombre2, largo2, ancho2, espectadores2);
		
		System.out.println(campo1);
		System.out.println(campo2);
		
		System.out.println("Area del "+campo1.getNombre()+ "es: "+campo1.calculararea()+" y el perímetro es: "+campo1.calculaperimetro());
		System.out.println("Area del "+campo2.getNombre()+ " es: "+campo2.calculararea()+" y el perímetro es: "+campo2.calculaperimetro());
		
		double a1 = campo1.calculararea();
		double a2 = campo2.calculararea();
		
		String nombreMayorArea = (a1>a2)? campo1.getNombre():campo2.getNombre();//hay que crear un get nombre en pojo para que nos de el nombre aquí y en todas las demás de este estilo.
		System.out.println("El área mayor es: "+nombreMayorArea );
		
		double p1 = campo1.calculaperimetro();
		double p2 = campo2.calculaperimetro();
		
		String nombreMayorPerimetro = (p1>p2)? campo1.getNombre():campo2.getNombre();
		System.out.println("El area moyor es: "+nombreMayorPerimetro);
		
		String nombreMayorEspectadores = (campo1.getEspectadores()>campo2.getEspectadores())? campo1.getNombre():campo2.getNombre();
		System.out.println("El campo con el numero mayor de espectadores es:"+nombreMayorEspectadores);
		
		
		
		teclado.close();
		
	}

}
