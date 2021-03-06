package dam.main;

import java.util.ArrayList;
import java.util.Scanner;

import dam.model.Alumno;
import dam.persistencia.AlumnosPersistencia;

public class PruebaConexion {

    public static void main(String[] args) {
        AlumnosPersistencia ap = new AlumnosPersistencia();

        ArrayList<Alumno> listaAlumnos = ap.selecccionarAlumnos();

        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("##Introduce el dni del alumno que desea consultar");
        String dni = sc.nextLine().toUpperCase();
        
        Alumno alumnoDni= ap.selectAlumnoDni(dni);
        
        if (alumnoDni != null) {
			System.out.println(alumnoDni);
		}else {
			System.out.println("No se han encontrado datos para el dni indicadso.");
		}
        
        //
        System.out.println("##Introduce la edad del alumno que desea eliminar");
        int edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("##Introduce el nombre del alumno que desea eliminar");
        String nombre = sc.nextLine().toUpperCase();
        
        int res = ap.deleteAlumno(edad, nombre);
        
        if(res>0) {
			System.out.println("Se han borrado "+res+ " alumnos");
		}else {
			System.out.println("No se ha borrado un alumno.");
		}
        
        sc.close();
        
    }

}
