package vista;


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.bean.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GestorUsuarios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField IDTxt;
	private JTextField nombreApellidoTxt;
	private JTextField DNITxt;
	private JTextField codigoTxt;
	
	private JButton btnRegistrar;
	private JButton btnModificar;
	private JButton btnCargar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	
	private JLabel id;
	private JLabel nombreApellido;
	private JLabel DNI;
	private JLabel codigo;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestorUsuarios dialog = new GestorUsuarios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestorUsuarios() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		{
			JLabel gestorUsuarios = new JLabel("GESTOR USUARIOS");
			gestorUsuarios.setBounds(163, 11, 117, 14);
			contentPanel.add(gestorUsuarios);
		}
		{
			btnRegistrar = new JButton("REGISTRAR");
			btnRegistrar.setBounds(305, 45, 89, 23);
			contentPanel.add(btnRegistrar);
		}
		
		btnCargar = new JButton("CARGAR");
		btnCargar.setBounds(305, 72, 89, 23);
		contentPanel.add(btnCargar);
		
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(303, 106, 101, 23);
		contentPanel.add(btnModificar);
		
	    btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(305, 140, 89, 23);
		contentPanel.add(btnEliminar);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setBounds(305, 174, 89, 23);
		contentPanel.add(btnLimpiar);
		
		id = new JLabel("ID");
		id.setBounds(32, 54, 46, 14);
		contentPanel.add(id);
		
		IDTxt = new JTextField();
		IDTxt.setBounds(128, 51, 86, 20);
		contentPanel.add(IDTxt);
		IDTxt.setColumns(10);
		
		nombreApellido = new JLabel("NOMBRE_APELLIDO");
		nombreApellido.setBounds(10, 94, 117, 14);
		contentPanel.add(nombreApellido);
		
		nombreApellidoTxt = new JTextField();
		nombreApellidoTxt.setBounds(128, 91, 101, 20);
		contentPanel.add(nombreApellidoTxt);
		nombreApellidoTxt.setColumns(10);
		
		DNI = new JLabel("DNI");
		DNI.setBounds(32, 127, 46, 14);
		contentPanel.add(DNI);
		
		DNITxt = new JTextField();
		DNITxt.setBounds(128, 124, 86, 20);
		contentPanel.add(DNITxt);
		DNITxt.setColumns(10);
		
		codigo = new JLabel("CODIGO");
		codigo.setBounds(32, 165, 46, 14);
		contentPanel.add(codigo);
		
		codigoTxt = new JTextField();
		codigoTxt.setBounds(128, 162, 86, 20);
		contentPanel.add(codigoTxt);
		codigoTxt.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}
	
	public JButton getBtnCargar() {
		return btnCargar;
	}

	public void setBtnCargar(JButton btnCargar) {
		this.btnCargar = btnCargar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}

	public void setBtnLimpiar(JButton btnLimpiar) {
		this.btnLimpiar = btnLimpiar;
	}

	public JButton getBtnGuardar() {
		return btnRegistrar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnRegistrar = btnGuardar;
	}
	
	//metodos del odjeto
	
	//este metodo recogera los datos de usuario y devovera el odjeto
	public Usuario getDatosUsuario(Usuario usuario) {
		String nombre_apellido = nombreApellidoTxt.getText();
		String dni = DNITxt.getText();
		String codigo = codigoTxt.getText();
		
		
		usuario.setNombreApellido(nombre_apellido);
		usuario.setDni(dni);
		usuario.setCodigo(codigo);
		
		return usuario;
	}
	public void cargarUsuario(Usuario usuario) {
		
		nombreApellidoTxt.setText(usuario.getNombreApellido());
		DNITxt.setText(usuario.getDni());
		codigoTxt.setText(usuario.getCodigo());
		
	}
	
	//consigue el id del usuario que queremos buscar
	public int getIdUsuario() {
		int id = Integer.parseInt(IDTxt.getText());
		
		return id;	
	}
	
	//limpiar la ventana
	public void limpiar() {
		IDTxt.setText("");
		nombreApellidoTxt.setText("");
		DNITxt.setText("");
		codigoTxt.setText("");
		
	}

	

	
}
