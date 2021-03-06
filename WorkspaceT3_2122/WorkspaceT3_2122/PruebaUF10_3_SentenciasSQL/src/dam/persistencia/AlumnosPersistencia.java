package dam.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dam.db.AccesoDB;
import dam.model.Alumno;

public class AlumnosPersistencia {
	private AccesoDB acceso;

	public AlumnosPersistencia() {
		acceso = new AccesoDB(); //inicializamos el objeto pero no le pasamos nada por par?metro porque ya lo tiene
	}
	
	public ArrayList<Alumno> selecccionarAlumnos() {
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		//SELECT DNI, NOMBRE, EDAD FROM ALUMNOS:
		String query = "SELECT " + AlumnosContract.COLUMN_DNI + ", " 
								 + AlumnosContract.COLUMN_NOM + ", "
								 + AlumnosContract.COLUMN_EDAD
								 + " FROM " + AlumnosContract.NOM_TABLA;	
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rsult = null;

		try {
			con = acceso.getConexion(); //establecer conexi?n
			stmt = con.createStatement(); //el mismo catch SQLException coge sus posibles errores
			rsult = stmt.executeQuery(query); //ejecutar la query
			
			Alumno alumno;
			String dni;
			String nombre;
			int edad;
			
			while (rsult.next()) { //recuperar la consulta, como en PLSQL, vamos sacando los datos 
				dni = rsult.getString(AlumnosContract.COLUMN_DNI); //recuperamos por nombre de columna; tambi?n puede dar SQLException
				nombre = rsult.getString(2); //resuperamos por posici?n; posici?n SQL, entonces empieza en 1
				edad = rsult.getInt(3);
				
				alumno = new Alumno(dni, nombre, edad);
			  //System.out.println(alumno);
				listaAlumnos.add(alumno);
			}
			
		} catch (ClassNotFoundException e) { //si no encuentra el driver, da la excepci?n
			System.out.println("El driver indicado no es correcto");
			e.printStackTrace(); //saca toda la info por consola en rojo del error
		} catch (SQLException e) { //si no encuentra la url, da error
			System.out.println("Error en la base de datos: error conexi?n, sentencia incorrecta");
			e.printStackTrace();
		} finally { //para liberar recursos, cerramos lo creado; en el orden inverso en que se han abierto
			try {
				if (rsult != null) rsult.close(); //solo los cerramos si son distintos de null; es decir, si se han podido abrir
				if (stmt != null) stmt.close(); 
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		
		return listaAlumnos;
	}
	
	public Alumno selectAlumnoDni(String dni) {//METODO PARA BUSCAR ALUMNO CON SU DNI
		Alumno alumno= null;
		//SELECT DNI, NOMBRE, EDAD FROM ALUMNOS WHERE DNI=?;
		String query = "SELECT " + AlumnosContract.COLUMN_NOM + ", "
				 + AlumnosContract.COLUMN_EDAD
				 + " FROM " + AlumnosContract.NOM_TABLA
				 +" WHERE UPPER(" + AlumnosContract.COLUMN_DNI + ") = ?";	
		
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet rsult= null;
		
		
		try {
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, dni);//EL PRIMERO NOS DICE QUE POSICI?N OCUPA EL PARAMETRO y el segundo que es lo que queremos
			
			rsult= pstmt.executeQuery();//ejecutamos la query, porque la sentencia es una select
			
			String nombre;
			int edad;
			
			if (rsult.next()) { //recuperar la consulta, como en PLSQL, vamos sacando los datos 
				nombre = rsult.getString(1); //resuperamos por posici?n; posici?n SQL, entonces empieza en 1
				edad = rsult.getInt(2);
				
				alumno = new Alumno(dni, nombre, edad);
			  //System.out.println(alumno);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally { //para liberar recursos, cerramos lo creado; en el orden inverso en que se han abierto
			try {
				if (rsult != null) rsult.close(); //solo los cerramos si son distintos de null; es decir, si se han podido abrir
				if (pstmt != null) pstmt.close(); 
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		return alumno;
	}
	
	public int deleteAlumno(int edad,String nombre) {
		int resultado=0;
		
		//Delete from alumno where dni= ? or upper nombre = ?
		String query= " DELETE FROM "+ AlumnosContract.NOM_TABLA + " WHERE UPPER(" +AlumnosContract.COLUMN_EDAD+ ") =?"
				+" OR UPPER("+AlumnosContract.COLUMN_NOM+") LIKE ?";
		
		Connection  con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, edad);//EL PRIMERO NOS DICE QUE POSICI?N OCUPA EL PARAMETRO y el segundo que es lo que queremos
			pstmt.setString(2, nombre + "%");//% como en sql para que primero nombre y luego lo demas, arriba like
			
			resultado= pstmt.executeUpdate(); //se usa cuando la sentencia no es una select
			
		} catch (ClassNotFoundException e) {
			System.out.println("El driver indicado no es correcto");
			e.printStackTrace();
			
		} catch (SQLException e) {
		
			System.out.println("Error en la base de datos");
			e.printStackTrace();
		}finally { //para liberar recursos, cerramos lo creado; en el orden inverso en que se han abierto
			try {
				if (pstmt != null) pstmt.close(); 
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		return resultado;
	}
	
}

