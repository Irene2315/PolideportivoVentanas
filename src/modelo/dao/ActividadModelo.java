package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import modelo.Conector;
import modelo.bean.Actividad;

public class ActividadModelo extends Conector {
	
	public boolean insertarActividad(Actividad actividad) {
		
		PreparedStatement prt;
		try {
			prt = conexion.prepareStatement("INSERT INTO actividades("
					+ "nombre, fecha_inicio, dias_semana, horas, max_participantes, precio) "
					+ "VALUES (?,?,?,?,?,?)");
			
			prt.setString(1, actividad.getNombre());
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			prt.setString(2, sdf.format(actividad.getFechaInicio()));
			
			prt.setString(3, actividad.getDiasSemana());
			prt.setInt(4, actividad.getHoras());
			prt.setInt(5,actividad.getMax_participantes());
			prt.setDouble(6,actividad.getPrecio() );
			
			prt.execute();
			return true;
			
		} catch (SQLException e) {
			return false;
			
		}
		
		
		
	}
	
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
