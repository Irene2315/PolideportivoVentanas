package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	
	protected Connection conexion;

	/**
	 */
	public void conectar() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				this.conexion = DriverManager.getConnection("jdbc:mysql://" + Config.HOST + "/" + Config.BBDD, Config.USERNAME, Config.PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
	
	public void cerrar() throws SQLException {
		conexion.close();
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
}

