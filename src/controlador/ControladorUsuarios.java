package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.bean.Usuario;
import modelo.dao.UsuarioModelo;
import vista.GestorUsuarios;

public class ControladorUsuarios implements ActionListener {

	private UsuarioModelo usuarioM;
	private GestorUsuarios usuarioG;

	public ControladorUsuarios(UsuarioModelo usuarioM, GestorUsuarios usuarioG) {
		this.usuarioM = usuarioM;
		this.usuarioG = usuarioG;

		// asignar escuchadores de controladores y botones

		usuarioG.getBtnRegistrar().addActionListener(this);
		usuarioG.getBtnCargar().addActionListener(this);
		usuarioG.getBtnModificar().addActionListener(this);
		usuarioG.getBtnEliminar().addActionListener(this);
		usuarioG.getBtnLimpiar().addActionListener(this);
	}

	public void inicializar() {
		usuarioG.setTitle("Usuarios");
		usuarioG.setLocationRelativeTo(null);
		usuarioG.setVisible(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//CREAR USUARIO NUEVO
		if (e.getSource() == usuarioG.getBtnRegistrar()) {
			
			Usuario usuario = new Usuario();
			usuario = usuarioG.getDatosUsuario(usuario);

			usuarioM.conectar();
			if(usuarioM.insertarUsuario(usuario)) {
				JOptionPane.showMessageDialog(usuarioG, "Usuario Registrado correctamente");
				usuarioG.limpiar();
			}
			else {
				JOptionPane.showMessageDialog(usuarioG, "Este usuario ya esta registrado");
			}
			try {
				usuarioM.cerrar();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	
		//
		if(e.getSource() == usuarioG.getBtnCargar()) {
			
			Usuario usuario = new Usuario();
			int id;
			id = usuarioG.getIdUsuario();
			usuarioM.conectar();
			
			//TODO si id no existe que devuelba null
			usuario= usuarioM.getUsuario(id);
			
			if (usuario == null) {
				JOptionPane.showMessageDialog(usuarioG, "Usuario no registrado");
			}else {
				usuarioG.cargarUsuario(usuario);
			}
			try {
				usuarioM.cerrar();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}

		else if (e.getSource() == usuarioG.getBtnModificar()) {
			
			Usuario usuario = new Usuario();
			int id;
			id = usuarioG.getIdUsuario();
			
			usuarioM.conectar();
			usuario=usuarioM.getUsuario(id);
			
			usuario =usuarioG.getDatosUsuario(usuario);
			
			usuarioM.modificarUsuario(usuario);
			
			
			
			JOptionPane.showMessageDialog(usuarioG, "Usuario Modificado correctamente");
			usuarioG.limpiar();
			
			try {
				usuarioM.cerrar();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		} else if (e.getSource() == usuarioG.getBtnEliminar()) {
			int id;
			id = usuarioG.getIdUsuario();
			
			
			try {
				usuarioM.conectar();
				usuarioM.eliminarUsuario(id);
				usuarioM.cerrar();
				
				JOptionPane.showMessageDialog(usuarioG, "Usuario eliminado correctamente");
				usuarioG.limpiar();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		} else if (e.getSource() == usuarioG.getBtnLimpiar()) {
			usuarioG.limpiar();
		}

	}

}
