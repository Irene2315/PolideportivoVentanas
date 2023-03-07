package controlador;

import modelo.dao.InscripcionModelo;
import vista.GestorInscripciones;

public class ControladorInscripciones {

	

	private InscripcionModelo inscripcionM;
	private GestorInscripciones inscripcionG;

	public ControladorInscripciones(InscripcionModelo inscripcionM, GestorInscripciones inscripcionG) {
		this.inscripcionM = inscripcionM;
		this.inscripcionG = inscripcionG;
	}

	public void inicializar() {
		inscripcionG.setTitle("Inscripciones");
		inscripcionG.setLocationRelativeTo(null);
		inscripcionG.setVisible(false);
		
	}

}
