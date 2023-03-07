package modelo.bean;

public class Inscripcion {
	
	private int id;
	private int idUsuario;
	private int idActividad;
	
	
	public Inscripcion(int id, int idUsuario, int idActividad) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idActividad = idActividad;
	}
	
	public Inscripcion() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdActividad() {
		return idActividad;
	}
	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	@Override
	public String toString() {
		return "Inscripcion [id=" + id + ", idUsuario=" + idUsuario + ", idActividad=" + idActividad + "]";
	}
	
	
}
