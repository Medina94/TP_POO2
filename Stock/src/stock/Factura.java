package stock;

public class Factura {
	
	private int idFactra;
	private int aPagar;
	private Cliente cliente;
	private Pedido pedido;
	public int getIdFactra() {
		return idFactra;
	}
	public void setIdFactra(int idFactra) {
		this.idFactra = idFactra;
	}
	public int getaPagar() {
		return aPagar;
	}
	public void setaPagar(int aPagar) {
		this.aPagar = aPagar;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Factura(int idFactra, int aPagar, Cliente cliente, Pedido pedido) {
		super();
		this.idFactra = idFactra;
		this.aPagar = aPagar;
		this.cliente = cliente;
		this.pedido = pedido;
	}
	@Override
	public String toString() {
		return "Factura [idFactra=" + idFactra + ", aPagar=" + aPagar + ", cliente=" + cliente + ", pedido=" + pedido
				+ "]";
	}

	
}
