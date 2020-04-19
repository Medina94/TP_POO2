package stock;

import java.time.LocalDate;

public class Stock {
	private int idStock;
	private Local local;
	private Producto produto;
	private int cantidadStock;
	private int cantidadLote;
	private	LocalDate fechaEntrada;
	public Stock(int idStock, Local local, Producto produto, int cantidadStock, int cantidadLote,LocalDate fechaEntrada) {
		super();
		this.idStock = idStock;
		this.local = local;
		this.produto = produto;
		this.cantidadStock = cantidadStock;
		this.cantidadLote = cantidadLote;
		this.fechaEntrada = fechaEntrada;
	}
	public int getIdStock() {
		return idStock;
	}
	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Producto getProduto() {
		return produto;
	}
	public void setProduto(Producto produto) {
		this.produto = produto;
	}
	public int getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	public int getCantidadLote() {
		return cantidadLote;
	}
	public void setCantidadLote(int cantidadLote) {
		this.cantidadLote = cantidadLote;
	}
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", local=" + local + ", produto=" + produto + ", cantidadStock="
				+ cantidadStock + ", cantidadLote=" + cantidadLote + ", fechaEntrada=" + fechaEntrada + "]";
	}
	
}
