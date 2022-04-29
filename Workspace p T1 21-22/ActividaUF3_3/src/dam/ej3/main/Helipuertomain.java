package dam.ej3.main;

import java.util.Scanner;

import dam.ej3.pojo.Helipuerto;

public class Helipuertomain {

	public static void main(String[] args) {
		
		
		
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre de helipuerto 1");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca el nombre de helipuerto 2");
		String nombre2 = teclado.nextLine();
		
		System.out.println("Introduzca el radio de helipuerto 1");
		double radio1 =  Double.parseDouble(teclado.nextLine());
		
		System.out.println("Introduzca el radio de helipuerto 2");
		double radio2 = Double.parseDouble(teclado.nextLine());
		
		
		
		
		Helipuerto helipuerto1 = new Helipuerto();
		helipuerto1.setNombre("Madrid");
		helipuerto1.setRadio(2);
		
		Helipuerto helipuerto2 = new Helipuerto();
		helipuerto2.setNombre("Alcobendas");
		helipuerto2.setRadio(4);
		
		System.out.println("Area de helipuerto Madrid es: "+helipuerto1.calculararea());
		System.out.println("Area de helipuerto Alcobendas es: "+helipuerto2.calculararea());
		
		if(helipuerto1.calculararea()<helipuerto2.calculararea()) {
			System.out.println("Area helipuerto Alcobendas es mayor que area de helipuerto Madrid");
		}else {
			System.out.println("Area helipuerto Madrid es mayor que area de helipuerto Alcobendas");
		}
		//OTRA FORMA DE HACER EL AREA MAYOR: double mayor = (helipuerto1.calculararea()>helipuerto2.calculararea())?helipuerto1calculararea() : helipuerto2.calcular();
		//System.out.println(El helipuerto que tiene mayor área es: +mayor)
		
		teclado.close();
		
		
			
		
		}

}
