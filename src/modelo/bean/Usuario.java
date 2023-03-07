package modelo.bean;


public class Usuario {
	private int id;
	private String nombreApellido;
	private String dni;
	private String codigo;
	
	public Usuario(int id, String nombreApellido, String dni, String codigo) {
		super();
		this.id = id;
		this.nombreApellido = nombreApellido;
		this.dni = dni;
		this.codigo = codigo;
	}
	
	public Usuario() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido2) {
		this.nombreApellido = nombreApellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreApellido=" + nombreApellido + ", dni=" + dni + ", codigo=" + codigo + "]";
	}
	
	

}
