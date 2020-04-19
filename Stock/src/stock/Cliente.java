package stock;

import java.time.LocalDate;

public class Cliente extends Persona {
	
	private int telefono;


	public Cliente(int idPersona,String nombre, String apelido, LocalDate fechaNacimiento, String mail,int telefono ) {
		super(idPersona,nombre, apelido, fechaNacimiento, mail);
		this.telefono = telefono;
		
		// TODO Auto-generated constructor stub
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [telefono=" + telefono + ", idPersona=" + idPersona + ", nombre=" + nombre + ", apelido="
				+ apelido + ", fechaNacimiento=" + fechaNacimiento + ", mail=" + mail + "]";
	}

	/*@Override
	public String toString() {
	return getNombre();
	
	}*/
	




	
	
}
