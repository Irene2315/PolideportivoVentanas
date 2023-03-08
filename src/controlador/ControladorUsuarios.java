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
		
		//asignar escuchadores de controladores y botones
		
		usuarioG.getBtnGuardar().addActionListener(this);
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
		if(e.getSource() == usuarioG.getBtnGuardar()) {
			System.out.println("guardar");
		}
		
		else if (e.getSource() == usuarioG.getBtnModificar()) {
			System.out.println("modificar");
		}
		else if (e.getSource() == usuarioG.getBtnEliminar()) {
			System.out.println("eliminar");
		}
		else if (e.getSource() == usuarioG.getBtnLimpiar()) {
			System.out.println("limpiar");
		}
		
	}

	

	

}
