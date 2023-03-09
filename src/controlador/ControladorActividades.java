package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import modelo.dao.ActividadModelo;
import vista.GestorActividades;

public class ControladorActividades implements ActionListener {

	private ActividadModelo actividadM;
	private GestorActividades actividadG;

	public ControladorActividades(ActividadModelo actividadM, GestorActividades actividadG) {
		this.actividadM = actividadM;
		this.actividadG = actividadG;
		
		// asignar escuchadores de controladores y botones
		
		actividadG.getBtnRegistrar().addActionListener(this);;
		actividadG.getBtnCargar().addActionListener(this);
		actividadG.getBtnModificar().addActionListener(this);
		actividadG.getBtnEliminar().addActionListener(this);
		actividadG.getBtnLimpiar().addActionListener(this);
		
	}

	public void inicializar() {
		actividadG.setTitle("Actividad");
		actividadG.setLocationRelativeTo(null);
		actividadG.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == actividadG.getBtnRegistrar()) {
			System.out.println("registrar");
		}
		
		else if(e.getSource() == actividadG.getBtnCargar()) {
			System.out.println("cargar");
		}
		
		else if(e.getSource() == actividadG.getBtnModificar()) {
			System.out.println("modificar");
		}
		
		else if(e.getSource() == actividadG.getBtnEliminar()) {
			System.out.println("eliminar");
		}
		
		else if(e.getSource() == actividadG.getBtnLimpiar()) {
			System.out.println("limpiar");
		}
		
		
	}



}
