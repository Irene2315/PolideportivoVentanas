package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Usuario;

public class InscripcionModelo  extends Conector{
		
	/* Visualizar usuario inscritos */

	public ArrayList<Usuario> getUsuarioInscritos(int id_actividad) {

		ArrayList<Usuario> usuariosInscritos = new ArrayList<>();

		try {
			PreparedStatement prt = conexion.prepareStatement("SELECT id_usuario FROM inscripciones WHERE id_actividad=?");

			prt.setInt(1, id_actividad);
			
			UsuarioModelo usuarioModelo = new UsuarioModelo();

			ResultSet resultado = prt.executeQuery();
			while (resultado.next()) {
				
				Usuario usuarioI = new Usuario();
				usuarioI = usuarioModelo.getUsuario(resultado.getInt("id_usuario"));

				usuariosInscritos.add(usuarioI);

			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuariosInscritos;

	}

	

	

	

	public void darBajaUsuario(int idActividad, int codigoUsuario) {
		try {
			PreparedStatement prt = conexion.prepareStatement("DELETE FROM inscripciones WHERE id_actividad=? AND id_usuario=?");

			prt.setInt(1, idActividad);
			prt.setInt(2, codigoUsuario);

			prt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
