package dam.ejercicio3.main;

import java.util.Scanner;

import dam.ejercicio3.pojo.EquipoFutbol;

public class EquiposComparar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca nombre del primer equipo futbol");
		String nombre1 = teclado.nextLine();
		System.out.println("Introduzca la ciudad del primer equipo de futbol");
		String ciudad1 = teclado.nextLine();
		System.out.println("Introduzca los partidos ganados del primer equipo de futbol");
		int pganados1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca los partidos empatados del primer equipo de futbol");
		int pempatados1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca los partidos perdidos del primer equipo de futbol");
		int pperdidos1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduzca nombre del segundo equipo futbol");
		String nombre2 = teclado.nextLine();
		System.out.println("Introduzca la ciudad del segundo equipo de futbol");
		String ciudad2 = teclado.nextLine();
		System.out.println("Introduzca los partidos ganados del segundo equipo de futbol");
		int pganados2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca los partidos empatados del segundo equipo de futbol");
		int pempatados2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca los partidos perdidos del segundo equipo de futbol");
		int pperdidos2 = Integer.parseInt(teclado.nextLine());
		
		EquipoFutbol equipo1 = new EquipoFutbol(nombre1, ciudad1, pganados1, pempatados1, pperdidos1);
		EquipoFutbol equipo2 = new EquipoFutbol(nombre2, ciudad2, pganados2, pempatados2, pperdidos2);
		
		System.out.println(equipo1);
		System.out.println(equipo2);
		
		double p1 = equipo1.calcularPuntos();
		double p2 = equipo2.calcularPuntos();
		
		String nombreMayorPuntos = (p1>p2)? equipo1.getNombre():equipo2.getNombre();//si lo hacemos con un if-else if, podemos decir también si tienen los mismos tiempos
		System.out.println("El equipo con mas puntos es: "+nombreMayorPuntos+".");
		
		teclado.close();
	}
	
	
}
