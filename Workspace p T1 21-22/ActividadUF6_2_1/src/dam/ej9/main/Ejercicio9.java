package dam.ej9.main;

import java.util.Random;

import dam.ej9.pojo.Encuesta;

public class Ejercicio9 {
	
	static final int TAM = 5;
	static final int LIM_INF_1 = 1;
	static final int LIM_SUP_2 = 2;
	static final int LIM_INF_SAL = 600;
	static final int LIM_SUP_SAL = 2000;
	
	static Encuesta[] encuestados;

	public static void main(String[] args) {
		encuestados = new Encuesta[TAM];
		
		rellenarArray();
		
		mostrarArray();
		
		realizarAnalisis();

	}

	private static void realizarAnalisis() {
		/* TODO:
	//Porcentaje de hombres (tengan o no trabajo).
	//Porcentaje de mujeres (tengan o no trabajo).
	//Porcentaje de hombres que trabajan.
	//Porcentaje de mujeres que trabajan.
	//El sueldo promedio de los hombres que trabajan.
	//EL sueldo promedio de las mujeres que trabajan.
		 */
		int contH = 0;
		int contM = 0;
		int contHT = 0;
		int contMT = 0;
		int sumaSalHT = 0;
		int sumaSalMT = 0;
		
		// ----------------------
		// | enc1 | enc2 | enc3 |
		// ----------------------
		//Encuesta encuesta;
		for (int i = 0; i < encuestados.length; i++) {
			//encuesta = encuestados[i];
			
			if (encuestados[i].getSexo() == 1) {
				contH++;
				if (encuestados[i].getTrabaja() == 1) {
					contHT++;
					sumaSalHT += encuestados[i].getSalario();
				}
			} else {
				contM++;
				if (encuestados[i].getTrabaja() == 1) {
					contMT++;
					sumaSalMT += encuestados[i].getSalario();
				}
			}
		}
		
		double porcH = (double) contH * 100 / encuestados.length;
		double porcM = (double) contM * 100 / encuestados.length;
		
		double porcHT = 0;
		if (contH != 0) {
			porcHT = (double) contHT * 100 / contH;
		}
		
		double porcMT = 0;
		if (contM != 0) {
			porcMT = (double) contMT * 100 / contM;
		}
		
		double mediaSHT = 0;
		if (contHT != 0) {
			mediaSHT = (double) sumaSalHT / contHT;
		}
		
		double mediaSMT = 0;
		if (contMT != 0) {
			mediaSMT = (double) sumaSalMT / contMT;
		}
		
		System.out.println("/nEl porcentaje de hombres es " + porcH);
		System.out.println("El porcentaje de mujeres es " + porcM);
		System.out.println("El porcentaje de hombres que trabajan es " + porcHT);
		System.out.println("El porcentaje de mujeres que trabajan es " + porcMT);
		System.out.println("La media de los salarios de los hombres que trabajan es " + mediaSHT);
		System.out.println("La media de los salarios de las mujeres que trabajan es " + mediaSMT);
		
	}

	private static void mostrarArray() {
		for (int i = 0; i < encuestados.length; i++) {
			System.out.println(encuestados[i]);
		}
		
	}

	private static void rellenarArray() {
		int sexo;
		int trabaja;
		int salario;
		for (int i = 0; i < encuestados.length; i++) {
			sexo = generarAleatorio(LIM_INF_1, LIM_SUP_2);
			trabaja = generarAleatorio(LIM_INF_1, LIM_SUP_2);
			
			if (trabaja == 1) {
				salario = generarAleatorio(LIM_INF_SAL, LIM_SUP_SAL);
			} else {
				salario = 0;
			}
			
			encuestados[i] = new Encuesta(sexo, trabaja, salario);
		}
		
	}

	private static int generarAleatorio(int limInf, int limSup) {
		Random rd = new Random();
		return rd.nextInt(limSup + 1 - limInf) + limInf;
	}

}
