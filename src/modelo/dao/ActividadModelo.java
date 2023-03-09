package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Conector;

public class ActividadModelo extends Conector {
	
	
	//consigue el id de una actividad segun el nombre de la actividad introducido
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
	
	//modifica los dias de una actividad
	public void modificarDiasActividad(int id, String dias) {

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
}
