package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GestorUsuarios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField IDTxt;
	private JTextField nombreApellidoTxt;
	private JTextField DNITxt;
	private JTextField codigoTxt;
	
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JLabel id;
	private JLabel nombreApellido;
	private JLabel DNI;
	private JLabel codigo;
	private JButton btnGuardar;

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
			btnGuardar = new JButton("GUARDAR");
			btnGuardar.setBounds(305, 45, 89, 23);
			contentPanel.add(btnGuardar);
		}
		{
			JLabel gestorUsuarios = new JLabel("GESTOR USUARIOS");
			gestorUsuarios.setBounds(163, 11, 117, 14);
			contentPanel.add(gestorUsuarios);
		}
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(293, 79, 101, 23);
		contentPanel.add(btnModificar);
		
	    btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(305, 123, 89, 23);
		contentPanel.add(btnEliminar);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setBounds(305, 161, 89, 23);
		contentPanel.add(btnLimpiar);
		
		id = new JLabel("ID");
		id.setBounds(32, 54, 46, 14);
		contentPanel.add(id);
		
		IDTxt = new JTextField();
		IDTxt.setBounds(128, 51, 86, 20);
		contentPanel.add(IDTxt);
		IDTxt.setColumns(10);
		
		nombreApellido = new JLabel("NOMBRE_APELLIDO");
		nombreApellido.setBounds(10, 94, 108, 14);
		contentPanel.add(nombreApellido);
		
		nombreApellidoTxt = new JTextField();
		nombreApellidoTxt.setBounds(128, 91, 86, 20);
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
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}
}
