package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Conector;

public class ActividadModelo extends Conector {
	public void modificarActividad(int id, String dias) {

		try {
			PreparedStatement prt = conexion.prepareStatement("UPDATE actividades SET dias_semana=? WHERE id=?");

			prt.setInt(2, id);

			prt.setString(1, dias);

			prt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public int getNombreActividad(String nombreActividad) {
		int id = 0;
		try {
			PreparedStatement prt = conexion.prepareStatement("SELECT id FROM `actividades` WHERE nombre=?");
			prt.setString(1, nombreActividad);
			ResultSet resultado = prt.executeQuery();

			while (resultado.next()) {

				id = resultado.getInt("id");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;

	}
}
