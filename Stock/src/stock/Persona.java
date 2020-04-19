package stock;

import java.time.LocalDate;

public class Persona {
	protected int idPersona;
	protected String nombre;
	protected String apelido;
	protected LocalDate fechaNacimiento;
	protected String mail;
	public Persona(int idPersona,String nombre, String apelido, LocalDate fechaNacimiento, String mail) {
		super();
		this.nombre = nombre;
		this.apelido = apelido;
		this.fechaNacimiento = fechaNacimiento;
		this.mail = mail;
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	
}
