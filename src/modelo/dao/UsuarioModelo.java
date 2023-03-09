package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Conector;
import modelo.bean.Usuario;

public class UsuarioModelo extends Conector{
	/* Insertar usuario */
	public void insertarUsuario(Usuario usuario) {
		

		try {
			PreparedStatement prt = conexion.prepareStatement("INSERT INTO usuarios(nombre_apellido, dni,codigo) VALUES (?,?,?)");

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
			PreparedStatement prt = conexion.prepareStatement("SELECT `codigo` FROM `usuarios` WHERE codigo=?");
			
			prt.setString(1, codigo);
			ResultSet resultado = prt.executeQuery();

			if (resultado.next()) {
				encontrado = true;
			} else {
				encontrado = false;
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return encontrado;
		

	}
	
	public Usuario getUsuario(int id_usuario) {

		Usuario usuario = new Usuario();
		try {
			PreparedStatement prt = conexion.prepareStatement("SELECT `id`, `nombre_apellido`, `dni`, `codigo` FROM `usuarios` WHERE id=?");

			prt.setInt(1, id_usuario);
			ResultSet resultado = prt.executeQuery();

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

	//esto modificará el usuario 
	public void modificarUsuario(Usuario usuario) {
		PreparedStatement prt;
		try {
			prt = conexion.prepareStatement("UPDATE usuarios SET nombre_apellido=?,dni=?,codigo=? WHERE id=?");
			
			prt.setString(1, usuario.getNombreApellido());
			prt.setString(2, usuario.getDni());
			prt.setString(3, usuario.getCodigo());
			prt.setInt(4, usuario.getId());
			
			prt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarUsuario (int id) {
		PreparedStatement prt;
		
		try {
			prt = conexion.prepareStatement("DELETE FROM usuarios WHERE id=?");
			
			prt.setInt(1, id);
			prt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	

	

	

}
