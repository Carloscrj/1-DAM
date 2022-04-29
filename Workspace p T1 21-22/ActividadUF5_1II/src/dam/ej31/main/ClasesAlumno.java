package dam.ej31.main;

import java.util.Scanner;

import dam.ej31.pojo.Alumno;


public class ClasesAlumno {
	static Scanner teclado;
	public static void main(String[] args) {
		
		 teclado = new Scanner(System.in);
		 
		 boolean continuar = true;
		 int contaApro=0;
		 int contaSusp=0;
		 int contAlumn=0;
		 double suma=0;
		 double notaFinal;
		 
		 String nomAlMejorNF = "";
		 double mejorNota = -1;//se pone -1 para que cualquier nota se mayor que mejorNota
				 
				 
				 
		 while(continuar) {
			
			 Alumno alumno = datosAlumno();
			 contAlumn++;
			 
			System.out.println(notaFinal=alumno.getNotaFinal());
			suma = suma + notaFinal;
			
			
			if(notaFinal>=5) {
				contaApro++;
			} else if(notaFinal<5) {
				contaSusp++;
			}
			
			if(mejorNota<notaFinal) {
				mejorNota = notaFinal;
				nomAlMejorNF = alumno.getNombre();
				
			}
			
			System.out.println("¿Desea introducir los datos de otro alumno?");
			continuar = Integer.parseInt(teclado.nextLine()) == 1?true : false;
			
				
			}
			
			double mediaFinales=suma/contAlumn; //mirar Math.round para acotar decimales.
			
			System.out.println("La media de las notas finales es "+mediaFinales);
			System.out.println("La cantidad de aprobados es "+contaApro);
			System.out.println("La cantidad de suspensasos es "+contaSusp);
			System.out.println("La nota final mas alta es "+mejorNota+
		" y el nombre del alumno con mejor nota es "+nomAlMejorNF);
		 }
			
			
			
		 
	
	private static Alumno datosAlumno() {
		System.out.println("Introduza el nombre del alumno");
			String nombre = teclado.nextLine();
			System.out.println("Introduzca la nota del alumno");
			int notaTareas = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca la nota del examen del alumno");
			int notaExamen = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca la nota de la actitud del alumno");
			int notaActitud = Integer.parseInt(teclado.nextLine());
			
			Alumno alumno = new Alumno(nombre, notaTareas, notaExamen, notaActitud);
		return alumno;
	}
	

}
