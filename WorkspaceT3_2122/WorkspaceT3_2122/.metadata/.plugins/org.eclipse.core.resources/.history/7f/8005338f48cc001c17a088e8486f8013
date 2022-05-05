package dam.main;

import java.sql.Connection;

import dam.db.AccesoDB;

public class PruebaConexion {

	public static void main(String[] args) {
	AccesoDB acceso= new AccesoDB();
	Connection con= acceso.getConexion();
	
	if (con!=null) {
		System.out.println("Conexión con la base de datos establecida correctamente");
	}
	
	}

}
