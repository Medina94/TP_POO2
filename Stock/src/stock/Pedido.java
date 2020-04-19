package stock;

import java.time.LocalDate;

public class Pedido {
	private int idPedido;
    private int cantidadSolicitada;
	private Producto producto;
	private	LocalDate fecha;
	private Cliente cliente;
	private Empleado solicitador;
	
	
	public Pedido(int idPedido,int cantidadSolicitada,Producto producto, LocalDate fecha,Cliente cliente,Empleado solicitador) {
		
		this.idPedido = idPedido;
		this.producto = producto;
		this.fecha = fecha;
		this.solicitador = solicitador;
		this.cantidadSolicitada = cantidadSolicitada;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	

	public int getCantidadSolicitada() {
		return cantidadSolicitada;
	}
	public void setCantidadSolicitada(int cantidadSolicitada) {
		this.cantidadSolicitada = cantidadSolicitada;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public Empleado getSolicitador() {
		return solicitador;
	}
	public void setSolicitador(Empleado solicitador) {
		this.solicitador = solicitador;
	}
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", solicitador=" + solicitador + ", cantidadSolicitada="
				+ cantidadSolicitada + ", producto=" + producto + ", fecha=" + fecha + ", cliente=" + cliente + "]";
	}

	
	
	
	
}


