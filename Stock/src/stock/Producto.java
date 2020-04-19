package stock;



public class Producto {
	private int idProducto;
	private String descripcion;
	private int precioUnitario;
	
	public Producto(int idProducto,String descripcion, int precioUnitario) {
		super();
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
	
		this.idProducto = idProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;

	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + " ]";
	}

	
	
}

