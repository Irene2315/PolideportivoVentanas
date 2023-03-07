package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import modelo.dao.UsuarioModelo;
import vista.GestorUsuarios;

public class ControladorUsuarios implements ActionListener {

	private UsuarioModelo usuarioM;
	private GestorUsuarios usuarioG;




	public ControladorUsuarios(UsuarioModelo usuarioM, GestorUsuarios usuarioG) {
		this.usuarioM = usuarioM;
		this.usuarioG = usuarioG;
	}
	
	public void inicializar() {
		usuarioG.setTitle("Usuarios");
		usuarioG.setLocationRelativeTo(null);
		usuarioG.setVisible(false);
		
	}

	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	

}
