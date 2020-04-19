package stock;




public class Local {

	private int idLocal;
	private int telefono;
	private String direccion;
	private int longitud;
	private int latitud;
	private Empleado empleado;
	

	public Local(int idLocal, int telefono, String direccion, int longitud, int latitud,Empleado empleado) {
		super();
		this.idLocal = idLocal;
		this.telefono = telefono;
		this.direccion = direccion;
		this.longitud = longitud;
		this.latitud = latitud;
		this.empleado = empleado;
		
	}
	public int getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getLatitud() {
		return latitud;
	}
	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	


	@Override
	public String toString() {
		return "Local [idLocal=" + idLocal + ", telefono=" + telefono + ", direccion=" + direccion + ", longitud="
				+ longitud + ", latitud=" + latitud + ", empleado=" + empleado + ", stockLocal= ]";
	}


	
}
