package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import modelo.dao.ActividadModelo;
import modelo.dao.InscripcionModelo;
import modelo.dao.UsuarioModelo;
import vista.GestorActividades;
import vista.GestorInscripciones;
import vista.GestorUsuarios;
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
			UsuarioModelo usuarioM = new UsuarioModelo();
			//crear la vista que tendrá que abrir
			GestorUsuarios usuarioG = new GestorUsuarios();
			
			//crear el controlador pasandole el modelo y la vista que controlara
			ControladorUsuarios usuarioC = new ControladorUsuarios(usuarioM,usuarioG);
			
			//inicializar y visualizar
			usuarioC.inicializar();
			usuarioG.setVisible(true);
			
			
		}
		
		else if (e.getSource() == ventanaPrincipal.getBtngestionarActividades()) {
			//creamos el modelo necesario
			ActividadModelo actividadM = new ActividadModelo();
			
			//creamos la vista que tenga que abrir
			GestorActividades actividadG = new GestorActividades();
			
			//creamos el controlador pasadole el modelo y la vista
			ControladorActividades actividadC = new ControladorActividades(actividadM,actividadG);
			
			//inicializamos y visualizamos
			actividadC.inicializar();
			actividadG.setVisible(true);
			
		}
		
		else if (e.getSource() == ventanaPrincipal.getBtngestionarInscripciones()) {
			InscripcionModelo inscripcionM = new InscripcionModelo();
			
			GestorInscripciones inscripcionG = new GestorInscripciones();
			
			ControladorInscripciones inscripcionC = new ControladorInscripciones(inscripcionM,inscripcionG);
			
			
			inscripcionC.inicializar();
			inscripcionG.setVisible(true);
			
		}
		
	}
}
