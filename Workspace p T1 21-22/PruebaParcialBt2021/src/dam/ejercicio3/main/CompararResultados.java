package dam.ejercicio3.main;

import java.util.Scanner;

import dam.ejercicio3.pojo.JugadorTenis;

public class CompararResultados {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca nombre del tenista");
		String nombre = teclado.nextLine();
		System.out.println("Introduzca la nacionalidad");
		String nacionalidad = teclado.nextLine();
		System.out.println("Introduzca el número de Grand Slam victorioso");
		int nGrandSlam = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca el número de Master1000 victorioso");
		int nMaster1000 = Integer.parseInt(teclado.nextLine());
		
		JugadorTenis tenista1 = new JugadorTenis(nombre, nacionalidad, nGrandSlam, nMaster1000);
		
		
		System.out.println("Introduzca nombre del tenista");
		String nombre2 = teclado.nextLine();
		System.out.println("Introduzca la nacionalidad");
		String nacionalidad2 = teclado.nextLine();
		System.out.println("Introduzca el número de Grand Slam victorioso");
		int nGrandSlam2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca el número de Master1000 victorioso");
		int nMaster10002 = Integer.parseInt(teclado.nextLine());
		
		JugadorTenis tenista2 = new JugadorTenis(nombre2, nacionalidad2, nGrandSlam2, nMaster10002);
		
		System.out.println(tenista1);
		System.out.println(tenista2);
		
		double p1 = tenista1.calcularPuntos();
		double p2 = tenista2.calcularPuntos();
		
		String nombreMayorPuntos = (p1>p2)? tenista1.getNombre():tenista2.getNombre();//si lo hacemos con un if-else if, podemos decir también si tienen los mismos tiempos
		System.out.println("El tenista con mas puntos es: "+nombreMayorPuntos+".");
		
		teclado.close();
		

	}

}
