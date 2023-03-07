package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


import vista.Principal;

public class ControladorPrincipal implements ActionListener {

	private Principal ventanaPrincipal;
	
	// ventana principal que escucha los eventos
	
	public ControladorPrincipal(Principal principal) {
		this.ventanaPrincipal = principal;
		
		//asignar escuchadores de controladores y botones
		ventanaPrincipal.getBtngestionarUsuarios().addActionListener(this);
		ventanaPrincipal.getBtngestionarActividades().addActionListener(this);
		ventanaPrincipal.getBtngestionarInscripciones().addActionListener(this);
	}
	
	//Inicializa o resetea la vista de la ventana

	public void inicializar() {
		ventanaPrincipal.setTitle("Desktop");
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setVisible(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanaPrincipal.getBtngestionarUsuarios()) {
			// crear el modelo necesario
			//crear la vista que tendrá que abrir
			
			//crear el controlador pasandole el modelo y la vista que controlara
			//inicializar y visualizar
			System.out.println("Usuarios clicado");
		}
		else if (e.getSource() == ventanaPrincipal.getBtngestionarActividades()) {
			
			System.out.println("Actividades clicado");
		}
		else if (e.getSource() == ventanaPrincipal.getBtngestionarInscripciones()) {
			
			System.out.println("Inscripciones clicado");
		}
		
	}
}
