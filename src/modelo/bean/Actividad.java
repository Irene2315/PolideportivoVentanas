package modelo.bean;

import java.sql.Date;

public class Actividad {
	
	private int id;
	private String nombre;
	private Date fechaInicio;
	private String diasSemana;
	private int horas;
	private int max_participantes;
	private double precio;
	
	
	public Actividad(int id, String nombre, Date fechaInicio, String diasSemana, int horas, int max_participantes,
			double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.diasSemana = diasSemana;
		this.horas = horas;
		this.max_participantes = max_participantes;
		this.precio = precio;
	}
	
	public Actividad() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getDiasSemana() {
		return diasSemana;
	}
	public void setDiasSemana(String diasSemana) {
		this.diasSemana = diasSemana;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMax_participantes() {
		return max_participantes;
	}
	public void setMax_participantes(int max_participantes) {
		this.max_participantes = max_participantes;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Actividad [id=" + id + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", diasSemana="
				+ diasSemana + ", horas=" + horas + ", max_participantes=" + max_participantes + ", precio=" + precio
				+ "]";
	}
	
	
	
}
