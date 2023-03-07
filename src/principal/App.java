package principal;

import controlador.ControladorPrincipal;
import vista.Principal;

public class App {
	

	public static void main(String[] args) {
		Principal frmPrincipal = new Principal();
		
		ControladorPrincipal principalC = new ControladorPrincipal(frmPrincipal);
		principalC.inicializar();
		frmPrincipal.setVisible(true);
		
	}

}