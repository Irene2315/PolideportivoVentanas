package principal;

import controlador.ControladorPrincipal;
import vista.Principal;

public class App {
	

	public static void main(String[] args) {
		Principal principal = new Principal();
		
		ControladorPrincipal cp = new ControladorPrincipal(principal);
		cp.inicializar();
		principal.setVisible(true);
		
	}

}