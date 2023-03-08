package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Actividad;
import modelo.bean.Inscripcion;
import modelo.bean.Usuario;

/**
 * 
 * @author irakasle todos los métodos que accedan a la BBDD estarán aqui en esta
 *         clase no tiene que haber ningun Scanner ni System.ou.println
 */
public class AccesoBBDD extends Conector {

	PreparedStatement prt;
	ResultSet resultado;

	/* Insertar usuario */
	public void insertarUsuario(Usuario usuario) {

		try {
			prt = conexion.prepareStatement("INSERT INTO usuarios(nombre_apellido, dni,codigo) VALUES (?,?,?)");

			prt.setString(1, usuario.getNombreApellido());
			prt.setString(2, usuario.getDni());
			prt.setString(3, usuario.getCodigo());

			prt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Boolean codigoExite(String codigo) {

		Boolean encontrado = false;
		try {
			prt = conexion.prepareStatement("SELECT `codigo` FROM `usuarios` WHERE codigo=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			prt.setString(1, codigo);
			resultado = prt.executeQuery();

			if (resultado.next()) {
				encontrado = true;
			} else {
				encontrado = false;
			}

			return encontrado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return encontrado;
		}

	}

	/* Visualizar usuario inscritos */

	public ArrayList<Usuario> getUsuarioInscritos(int id_actividad) {

		ArrayList<Usuario> usuariosInscritos = new ArrayList<>();

		try {
			prt = conexion.prepareStatement("SELECT id_usuario FROM inscripciones WHERE id_actividad=?");

			prt.setInt(1, id_actividad);

			resultado = prt.executeQuery();
			while (resultado.next()) {

				Usuario usuarioI = new Usuario();
				usuarioI = this.getUsuario(resultado.getInt("id_usuario"));

				usuariosInscritos.add(usuarioI);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuariosInscritos;

	}

	public Usuario getUsuario(int id_usuario) {

		Usuario usuario = new Usuario();
		try {
			prt = conexion
					.prepareStatement("SELECT `id`, `nombre_apellido`, `dni`, `codigo` FROM `usuarios` WHERE id=?");

			prt.setInt(1, id_usuario);
			resultado = prt.executeQuery();

			if (resultado.next()) {

				usuario.setId(resultado.getInt(1));
				usuario.setNombreApellido(resultado.getString(2));
				usuario.setDni(resultado.getString(3));
				usuario.setCodigo(resultado.getString(4));

			}
			return usuario;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;

	}

	public void modificarActividad(int id, String dias) {

		try {
			prt = conexion.prepareStatement("UPDATE actividades SET dias_semana=? WHERE id=?");

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
			prt = conexion.prepareStatement("SELECT id FROM `actividades` WHERE nombre=?");
			prt.setString(1, nombreActividad);
			resultado = prt.executeQuery();

			while (resultado.next()) {

				id = resultado.getInt("id");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;

	}

	public void darBajaUsuario(int idActividad, int codigoUsuario) {
		try {
			prt = conexion.prepareStatement("DELETE FROM inscripciones WHERE id_actividad=? AND id_usuario=?");

			prt.setInt(1, idActividad);
			prt.setInt(2, codigoUsuario);

			prt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
