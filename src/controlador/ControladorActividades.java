package controlador;

import modelo.dao.ActividadModelo;
import vista.GestorActividades;

public class ControladorActividades {

	private ActividadModelo actividadM;
	private GestorActividades actividadG;

	public ControladorActividades(ActividadModelo actividadM, GestorActividades actividadG) {
		this.actividadM = actividadM;
		this.actividadG = actividadG;
	}

	public void inicializar() {
		actividadG.setTitle("Actividad");
		actividadG.setLocationRelativeTo(null);
		actividadG.setVisible(false);
	}

}
