package vista;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.bean.Actividad;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.DebugGraphics;

public class GestorActividades extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField IDTxt;
	private JTextField nombreTxt;
	private JTextField diasTxt;
	private JTextField fechaTxt;
	private JTextField horasTxt;
	private JTextField participantesTxt;
	private JTextField precioTxt;
	private JButton btnCargar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestorActividades dialog = new GestorActividades();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestorActividades() {
		setBounds(100, 100, 450, 325);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel gestorActividades = new JLabel("GESTOR ACTIVIDADES");
		gestorActividades.setBounds(158, 11, 145, 14);
		contentPanel.add(gestorActividades);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setBounds(298, 36, 89, 23);
		contentPanel.add(btnRegistrar);

		btnCargar = new JButton("CARGAR");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCargar.setBounds(298, 73, 89, 23);
		contentPanel.add(btnCargar);

		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(298, 106, 102, 23);
		contentPanel.add(btnModificar);

		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(298, 140, 89, 23);
		contentPanel.add(btnEliminar);

		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setBounds(298, 174, 89, 23);
		contentPanel.add(btnLimpiar);

		JLabel id = new JLabel("ID");
		id.setBounds(64, 40, 46, 14);
		contentPanel.add(id);

		IDTxt = new JTextField();
		IDTxt.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		IDTxt.setBounds(123, 36, 86, 20);
		contentPanel.add(IDTxt);
		IDTxt.setColumns(10);

		JLabel nombre = new JLabel("NOMBRE");
		nombre.setBounds(54, 63, 56, 14);
		contentPanel.add(nombre);

		nombreTxt = new JTextField();
		nombreTxt.setBounds(125, 62, 86, 20);
		contentPanel.add(nombreTxt);
		nombreTxt.setColumns(10);

		JLabel fecha_inicio = new JLabel("FECHA_INICIO");
		fecha_inicio.setBounds(29, 88, 81, 14);
		contentPanel.add(fecha_inicio);

		fechaTxt = new JTextField();
		fechaTxt.setBounds(125, 88, 86, 20);
		contentPanel.add(fechaTxt);
		fechaTxt.setColumns(10);

		JLabel dias_semana = new JLabel("DIAS_SEMANA");
		dias_semana.setBounds(29, 124, 81, 14);
		contentPanel.add(dias_semana);

		diasTxt = new JTextField();
		diasTxt.setBounds(125, 121, 86, 20);
		contentPanel.add(diasTxt);
		diasTxt.setColumns(10);

		JLabel horas = new JLabel("HORAS");
		horas.setBounds(43, 160, 46, 14);
		contentPanel.add(horas);

		horasTxt = new JTextField();
		horasTxt.setBounds(125, 152, 86, 20);
		contentPanel.add(horasTxt);
		horasTxt.setColumns(10);

		JLabel max_participantes = new JLabel("MAX_PARTICIPANTES");
		max_participantes.setBounds(10, 185, 119, 14);
		contentPanel.add(max_participantes);

		participantesTxt = new JTextField();
		participantesTxt.setBounds(125, 183, 86, 20);
		contentPanel.add(participantesTxt);
		participantesTxt.setColumns(10);

		JLabel precio = new JLabel("PRECIO");
		precio.setBounds(43, 216, 46, 14);
		contentPanel.add(precio);

		precioTxt = new JTextField();
		precioTxt.setText("");
		precioTxt.setBounds(125, 210, 86, 20);
		contentPanel.add(precioTxt);
		precioTxt.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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

	public JButton getBtnCargar() {
		return btnCargar;
	}

	public void setBtnCargar(JButton btnCargar) {
		this.btnCargar = btnCargar;
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

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}

	public void limpiar(){
		nombreTxt.setText("");
		fechaTxt.setText("");
		horasTxt.setText("");
		participantesTxt.setText("");
		precioTxt.setText("");
	}
	
	public Actividad getDatosActividad(Actividad actividad) {

		String nombre = nombreTxt.getText();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date FechaInicio;
		try {
			FechaInicio = sdf.parse(fechaTxt.getText());
			int horas = Integer.parseInt(horasTxt.getText());

			int participantes = Integer.parseInt(participantesTxt.getText());

			double precio = Double.parseDouble(precioTxt.getText());

			actividad.setNombre(nombre);
			actividad.setFechaInicio(FechaInicio);
			actividad.setHoras(horas);
			actividad.setMax_participantes(participantes);
			actividad.setPrecio(precio);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return actividad;

	}
	
	public void cargarActividad (Actividad actividad) {
		
		nombreTxt.setText(actividad.getNombre());
		
		
		
	}
	
	public int getIdActividad() {
		int id = Integer.parseInt(IDTxt.getText());
		
		return id;
		
	}

}
