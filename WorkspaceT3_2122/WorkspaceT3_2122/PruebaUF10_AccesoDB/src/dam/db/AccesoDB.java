package dam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {
	private String driver;//tipo de gestor de base de datos que vamos a usar
	private String url;//atributo para la ubicaci?n del archivo
	
	public AccesoDB() {//constructor por defecto
		driver = "org.sqlite.JDBC" ;
		url= "jdbc:sqlite:db/PruebasDB.db";//nombre que que 
	}

	public Connection getConexion()  {
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			System.out.println("El driver indicado no es correcto");
			e.printStackTrace();//me sale toda la informaci?n de la excepci?n
		} catch (SQLException e) {
			System.out.println("No es posible establecer la conexi?n con la base de datos");
			e.printStackTrace();
		}
				
		return con;
	}

}
