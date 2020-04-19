package stock;

import java.time.LocalDate;

public class Empleado extends Persona {
	
	private int sueldo;
	private boolean esGerente;

	private long dni;
	
	
	public Empleado(int idPersona,String nombre, String apelido, LocalDate fechaNacimiento, String mail, int sueldo, boolean esGerente, long dni) {
		super(idPersona,nombre, apelido, fechaNacimiento, mail);
		this.sueldo = sueldo;
		this.dni = dni;
		this.esGerente = esGerente;
	
	}




	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}


	public boolean isEsGerente() {
		return esGerente;
	}


	public void setEsGerente(boolean esGerente) {
		this.esGerente = esGerente;
	}






	public long getDni() {
		return dni;
	}




	public void setDni(long dni) {
		this.dni = dni;
	}




	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", esGerente=" + esGerente + ", dni=" + dni + ", idPersona=" + idPersona
				+ ", nombre=" + nombre + ", apelido=" + apelido + ", fechaNacimiento=" + fechaNacimiento + ", mail="
				+ mail + "]";
	}

/*	public String toStringSimple() {
		return getNombre();
	}
*/



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (dni ^ (dni >>> 32));
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		return dni == ((Empleado)obj).getDni();
	}


	


	
}
