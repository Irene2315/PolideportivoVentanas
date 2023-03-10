package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JButton btngestionarUsuarios;
	private JButton btngestionarActividades;
	private JButton btngestionarInscripciones;

	/**
	 * Create the frame.
	 */
	public Principal() {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel menuP = new JLabel("MENU POLIDEPORTIVO");
		menuP.setBounds(147, 24, 177, 14);
		contentPane.add(menuP);
		
		btngestionarUsuarios = new JButton("GESTIONAR USUARIOS");
		btngestionarUsuarios.setBounds(127, 61, 197, 23);
		contentPane.add(btngestionarUsuarios);
	
		
		btngestionarActividades = new JButton("GESTIONAR ACTIVIDADES");
		btngestionarActividades.setBounds(129, 95, 195, 23);
		contentPane.add(btngestionarActividades);
		
		btngestionarInscripciones = new JButton("GESTIONAR INSCRIPCIONES");
		btngestionarInscripciones.setBounds(125, 139, 199, 23);
		contentPane.add(btngestionarInscripciones);
	}
	
	
	public JButton getBtngestionarUsuarios() {
		return btngestionarUsuarios;
	}

	public JButton getBtngestionarActividades() {
		return btngestionarActividades;
	}

	public JButton getBtngestionarInscripciones() {
		return btngestionarInscripciones;
	}

}
