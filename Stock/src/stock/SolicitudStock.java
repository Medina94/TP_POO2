package stock;



public class SolicitudStock {
	
	private Empleado colaborador;
	private boolean aceptado;
	private boolean generado;
	private Pedido pedido;
	
	public Empleado getColaborador() {
		return colaborador;
	}
	public void setColaborador(Empleado colaborador) {
		this.colaborador = colaborador;
	}
	public boolean isAceptado() {
		return aceptado;
	}
	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}
	public boolean isGenerado() {
		return generado;
	}
	public void setGenerado(boolean generado) {
		this.generado = generado;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public SolicitudStock(Empleado colaborador , boolean aceptado,boolean generado,Pedido pedido) {
		
		this.colaborador = colaborador;
		this.aceptado = aceptado;
		this.generado = generado;
		this.pedido = pedido;
	}
	@Override
	public String toString() {
		return "SolicitudStock [aceptado=" + aceptado + ",StockDisponible=" + generado + ", colaborador=" + colaborador
				+ ", pedido=" + pedido + "]";
	}


	
	
}
