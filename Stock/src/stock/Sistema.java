package stock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Sistema {
	
	private List<Local> lstLocales;
	private List<Persona> lstPersonas;
	private List<Pedido>	lstPedido;
	private List<Stock> lstStock;
	private List<Producto> lstProducto;
	private List<SolicitudStock> lstSolicitud;
	private List<Factura> lstFactura;
	public Sistema() {
		super();
		this.lstFactura = new ArrayList<Factura>();
		this.lstLocales = new ArrayList<Local>();
		this.lstPersonas = new ArrayList<Persona>();
		this.lstPedido = new ArrayList<Pedido>();
		this.lstProducto = new ArrayList<Producto>();
		this.lstStock = new  ArrayList<Stock>();
		this.lstSolicitud = new ArrayList<SolicitudStock>();
	}
	public List<Local> getLstLocales() {
		return lstLocales;
	}
	public void setLstLocales(List<Local> lstLocales) {
		this.lstLocales = lstLocales;
	}
	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}
	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}
	public List<Pedido> getLstPedido() {
		return lstPedido;
	}
	public void setLstPedido(List<Pedido> lstCarrito) {
		this.lstPedido = lstCarrito;
	}
	public List<Producto> getLstProducto() {
		return lstProducto;
	}
	public void setLstProducto(List<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}
	public List<Stock> getLstStock() {
		return lstStock;
	}
	public void setLstStock(List<Stock> lstStock) {
		this.lstStock = lstStock;
	}
	
	//FORMULA PARA CALCULAR DISTANCIA
	//public int calcularDistancia (Local local,Local local2) {
		
	//}
	
	

	
	public List<SolicitudStock> getLstSolicitud() {
		return lstSolicitud;
	}
	public void setLstSolicitud(List<SolicitudStock> lstSolicitud) {
		this.lstSolicitud = lstSolicitud;
	}
	//AYUDA PARA TRAER LOCAL POR ID
	
	public List<Factura> getLstFactura() {
		return lstFactura;
	}
	public void setLstFactura(List<Factura> lstFactura) {
		this.lstFactura = lstFactura;
	}
	//METODO PARA TRAER STOCK DE UN MISMO LOCAL
	public Stock traerStock (int idLocal) {
		Stock  s = null;
		int i = 0;
		while(i<this.getLstStock().size() && s == null) {
			if(this.getLstStock().get(i).getLocal().getIdLocal() == idLocal) {
				s = this.getLstStock().get(i);
			}i++;
		}return s;
	}
	
	//TRAER LISTA STOCKS DE UN MISMO LOCAL
	public List<Stock> stockLocales (int idLocal){
		List<Stock> aux = new ArrayList<Stock>();
		for(Stock s : this.getLstStock()){
			if(s.getLocal().getIdLocal()==idLocal) {
				aux.add(s);
			}
			
		}return aux;
		
		
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//LOCALES LOCALES LOCALES
		
		
		//ALTA BAJA Y MODIFICACION DE LOCALES-----------------------------------PUNTO1
	
	public Local traerLocal (int idLocal) {

		Local p = null;
		int i = 0;
		
		while(i<this.getLstLocales().size() && p == null) {
			if(this.getLstLocales().get(i).getIdLocal()==idLocal) {
				p=this.getLstLocales().get(i);
			}i++;
		}return p;
				
	}
	
	public Local traerLocalE (Long dni) {
		Local p = null;
		int i = 0;
		
		while(i<this.getLstLocales().size() && p == null) {
			if(this.getLstLocales().get(i).getEmpleado().getDni()==dni) {
				p=this.getLstLocales().get(i);
			}i++;
		}return p;
				
	}
	
	
	//ALTA LOCAL
	public boolean altaLocal (int telefono,String direccion,int longitud,int latitud,Empleado empleado) {
		int id = 1;
		
		if(!this.getLstLocales().isEmpty()) {
			id = this.getLstLocales().get(this.getLstLocales().size()-1).getIdLocal()+1;
		}return lstLocales.add(new Local(id,telefono,direccion,longitud,latitud,empleado));
	}
	
	//BAJA LOCAL
	public boolean bajaLocal (int idLocal) {
		
		return this.getLstLocales().remove(this.traerLocal(idLocal));
	}

	//MODIFICAION LOCAL
	public void modificarLocal (int idLocal,int telefono,String direccion,int longitud, int latitud) {
		Local p = this.traerLocal(idLocal);
		p.setDireccion(direccion);
		p.setLongitud(longitud);
		p.setTelefono(telefono);
		p.setLatitud(latitud);	
	}
	
	

	
	
	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//EMPLEADO EMPLEADOS
	
	
	//ALTA BAJA Y MODIFICAION DE EMPLEADOS---------------------------------PUNTO2
	
	//TRAER EMPLEADO
	public List<Empleado> listaEmpleado () {
		List<Empleado> lst = new  ArrayList <Empleado> ();

		
		for(Persona p : this.getLstPersonas()){
			if(p instanceof Empleado) {
				lst.add((Empleado) p);
			}
		}return lst;
		
	}
	
	public Empleado traerEmpleado (long dni) {
		Empleado p = null;
		int i=0;
		
		while(i<this.listaEmpleado().size() && p == null) {
			if(this.listaEmpleado().get(i).getDni() == dni) {
				p = (Empleado) listaEmpleado().get(i);
			}i++;
		}return p;
	}
	
	public Empleado traerEmpleadoID (int id) {
		Empleado p = null;
		int i=0;
		
		while(i<this.listaEmpleado().size() && p == null) {
			if(this.listaEmpleado().get(i).getIdPersona() == id) {
				p = (Empleado) listaEmpleado().get(i);
			}i++;
		}return p;
	}
	
	//ALTA EMPLEADO
	public boolean altaEmpleado (String nombre , String apellido , LocalDate fechaNacimiento, String mail,int sueldo, boolean tipoEmpleado , long dni) {
		int id=1;
		
		if(!this.getLstPersonas().isEmpty()) {
			id = this.getLstPersonas().get(this.getLstPersonas().size()-1).getIdPersona()+1;
		}
				
		return lstPersonas.add(new Empleado(id,nombre,apellido,fechaNacimiento,mail,sueldo,true,dni));	
		
	}
	
	//BAJA EMPLEADO
	public boolean bajaEmpleado (long dni) {

		for(Empleado p : this.listaEmpleado()) {
			if(p.getDni() == dni) 
			
				this.getLstPersonas().remove(p);
			
		}return true;
	}
	
	//MODIFICACION EMPLEADO 
	public void modificasEmpleado (int id,String nombre , String apellido , LocalDate fechaNacimiento, String mail,int sueldo, boolean tipoEmpleado , long dni) {
		Empleado p = this.traerEmpleadoID(id);
		
		p.setApelido(apellido);
		p.setDni(dni);
		p.setIdPersona(id);
		p.setNombre(nombre);
		p.setMail(mail);
		p.setFechaNacimiento(fechaNacimiento);
		
	}
	
	
	
	
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//CLIENTES CLIENTES
	
	//ALTA BAJA Y MODIFICACION DE CLIENTES--------------------------------PUNTO3
	//TRAER LISTA CLIENTE
	public List<Cliente> listaClientes () {
		List<Cliente> lst = new  ArrayList <Cliente> ();

		
		for(Persona p : this.getLstPersonas()){
			if(p instanceof Cliente) {
				lst.add((Cliente) p);
			}
		}return lst;
		
	}
	//TRAER CLIENTE
	public Cliente traerCliente (int telefono) {
		Cliente p = null;
		int i=0;
		
		while(i<this.listaClientes().size() && p == null) {
			if(this.listaClientes().get(i).getTelefono()==telefono) {
				p = (Cliente) listaClientes().get(i);
			}i++;
		}return p;
	}
	
	//ALTA CLIENTE
	public boolean altaCliente (String nombre , String apellido , LocalDate fechaNacimiento, String mail,int telefono) {
		int id=1;
		
		if(!this.getLstPersonas().isEmpty()) {
			id = this.getLstPersonas().get(this.getLstPersonas().size()-1).getIdPersona()+1;
		}
		
		return lstPersonas.add(new Cliente(id,nombre,apellido,fechaNacimiento,mail,telefono));
	}
	
	//BAJA CLIENTE
	public boolean bajaCliente (int telefono) {

		for(Cliente c : this.listaClientes()) {
			if(c.getTelefono()==telefono) {
				this.getLstPersonas().remove(c);
			}
			
				
			
		}return true;
	}
	
	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//PRODUCTOS PRODUCTOS
	
	//PUNTO 4 (OBLIGATORIOS) ALTA, BAJA , Y MODIFICACION DE PRODUCTOS
	
	//AYUDA TRAER PRODUCTO POR ID
	public Producto traerProducto (int idProducto) {
		Producto p = null;
		int i = 0;
		
		while (i<this.getLstProducto().size() && p == null) {
			if(this.getLstProducto().get(i).getIdProducto()==idProducto) {
				p = this.getLstProducto().get(i);
			}i++;
		}return p;
	}	
	
	//AYUDA TRAER PRODUCTO POR DESCRIPCION
	public Producto traerProducto (String descripcion) {
			Producto p = null;
			int i = 0;
			
			while (i<this.getLstProducto().size() && p == null) {
				if(this.getLstProducto().get(i).getDescripcion().equals(descripcion)) {
					p = this.getLstProducto().get(i);
				}i++;
			}return p;
	}
	
	//ALTA PRODUCTO
	public boolean altaProducto (String descripcion,int precioUnitario) {
		int id = 1;
		
		if(!this.lstProducto.isEmpty()) {
		id =	this.getLstProducto().get(this.getLstProducto().size()-1).getIdProducto()+1;
		}return lstProducto.add(new Producto (id,descripcion,precioUnitario));
	}
	
	//BAJA PRODUCTO
	public boolean bajaProducto (int idProducto) {
		
		 return lstProducto.remove(this.traerProducto(idProducto));
	}
	
	//MODIFICACION PRODUCTO
	public void modificarProducto (int idProducto,String descripcion, int precioUnitario) {
		Producto p = this.traerProducto(idProducto);
		
		p.setDescripcion(descripcion);
		p.setIdProducto(idProducto);
		p.setPrecioUnitario(precioUnitario);
	}
	
	
	
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	//PUNTO 7 (OBLIGATORIO) VALIDACION STOCK Y POSIBILIDADES DE SOLICITAR STOCK SI CORRESPONDE
	
	//VALIDA EL STOCK DE LA MISMA SUCURSAL PUNTO 7 PARTE 1
	public int cantidadStock(Pedido pedido) {
		int cantidad = 0;
		for(Stock s : this.getLstStock()) {
			if(pedido.getSolicitador().equals(s.getLocal().getEmpleado()) && pedido.getProducto().equals(s.getProduto())) {
			cantidad = cantidad + s.getCantidadStock();
			}
		}return cantidad;
			
		
	}
	
	public boolean	validarStock (Pedido pedido) {
		boolean valido = false;
		for(Local l : this.getLstLocales()) {
			if(l.getEmpleado().equals(pedido.getSolicitador())) {
				if(pedido.getCantidadSolicitada()<=this.cantidadStock(pedido)) {
					valido=true;
				}
				
			}
			
		}return valido;
	}
	
	//PARTE 2 DEL PUNTO 7 (COMO NO SALIA DISTANCIA Y TENIA PROBLEMA CON LAS LISTAS, ESTE METODO TRAE EL PRIMER LOCAL QUE TENGA STOCK DISPONIBLE PARA ESE PRODUCTO)
	public Local localDisponible(Pedido pedido) {
		Local l = null;
		int i = 0;
		
		while(i<this.getLstStock().size() && l==null ) {
			if(this.getLstStock().get(i).getCantidadStock()>=pedido.getCantidadSolicitada() && this.getLstStock().get(i).getProduto().equals(pedido.getProducto())) {
				l = this.getLstStock().get(i).getLocal();
			}i++;
		}return l;
		
	}
	
	
		
	//GENERAR PEDIDO
	public boolean altaPedido(int cantidadSolicitada,Producto producto,LocalDate fecha,Cliente cliente,Empleado empleado) {
	int id = 1;
	
		if(!this.getLstPedido().isEmpty()) {
		id = this.getLstPedido().get(this.getLstPedido().size()-1).getIdPedido()+1;
		}
			return lstPedido.add(new Pedido(id,cantidadSolicitada,producto,fecha,cliente,empleado));
	}
	
	
	//TRAER PEDIDO POR FECHA
	public Pedido traerPedido (LocalDate fecha) {

		int i=0;
		Pedido p = null;
		
		
		while(i<this.getLstPedido().size() && p == null) {
			if(this.getLstPedido().get(i).getFecha().equals(fecha)) {
				p = this.getLstPedido().get(i);
			}i++;
		}return p;
		
	}
	
	
	
	//10 GENERACION DE SOLICITUD 
	public boolean generarScolicitud (Pedido pedido)  {
	//if(!this.validarStock(pedido)) throw new Exception ("No hay stock suficiente");	//PROBLEMA CON EXCEPTION ENTONCES LAS BORRE TODAS
	//EL PROBLEMA ES QUE SI TIRA ERROR LA SOLICITUD NO SE GENERA, Y POR LAFORMA EN LA QUE ESTA HECHO EL TP LAS SOLICITUDES SE TIENEN QUE GENERAR
	//AUNQUE NO TENGAN STOCK SUFICIENTE PARA DESPUES ACTUALIZARLAS	
	
	boolean stockDisponible = false;
	boolean aceptado = false;
	
		
			if(!this.validarStock(pedido) ) {
				stockDisponible = false;
				aceptado = false;
			} else if(this.validarStock(pedido) ) {
				stockDisponible = true;
				aceptado = true;
			}
			 lstSolicitud.add(new SolicitudStock(pedido.getSolicitador(),aceptado,stockDisponible,pedido));
			 return stockDisponible;
		}
	
	//ACTUALIZA EL STOCK DE UNA SUCURSAL QUE PUDO GENERAR LA SOLICITUD (STOCK DISPONIBLE PROPIO)
	public void actualizarStock (Pedido pedido) {
		
		int cantidadPedida = 0;
		cantidadPedida = pedido.getCantidadSolicitada();
		
		for(Stock s : this.getLstStock()) {
			if(this.validarStock(pedido) && s.getLocal().getEmpleado().equals(pedido.getSolicitador())) {
				
				s.setCantidadStock(s.getCantidadStock()-cantidadPedida);
			
			}
		}
		
	
	}
	
	
	//ESTA SOLICITUD TRAE EL PRIMER LOCAL QUE TENGA DISPONIBLE STOCK, AGARRA AL UNICO EMPLEADO QUE TIENE(EN EL CASO DE QUE TENGA MAS SE TENDRIA QUE CAMBIAR)
	//Y ESE EMPLEADO QUE TRAE ES EL QUE SE VA A PONER COMO COLABORADOR EN LA SOLICITUD Y VA A SER EL QUE LA TENGA QUE ACEPTAR PARA LUEGO
	//ACTUALIZAR EL STOCK DE SU LOCAL SEGUN EL PEDIDO 
	//GENERACION DE SOLICITUD DE STOCK DE OTRO LOCAL
	public boolean solicitudAjena (Pedido pedido) {
		
		
		
		SolicitudStock s = this.traerSolicitud(pedido);
	 	Empleado o = this.localDisponible(pedido).getEmpleado();
	 	if(o == null) {
	 		s.setColaborador(null);
	 	}
		
		 s.setColaborador(o);
		s.setGenerado(true);
		 
		 return true;
	}
	//SI SE PUEDO GENERAR UNA SOLICITUD AGENA, LA SOLICITUD SE VA A ACEPTAR Y SE VA A ACTUALIZAR EL STOCK DE EL LOCAL COLABORADOR
	public boolean  aceptarSolicitudAjena(Pedido pedido, Empleado empleado) {
		 int cantidadAux = pedido.getCantidadSolicitada();
		 
		
		for(Stock l : this.getLstStock()) {
				if(l.getLocal().getEmpleado().equals(empleado)) {
					l.setCantidadStock(l.getCantidadStock()-cantidadAux);
					this.traerSolicitud(pedido).setAceptado(true);
					
				}
		}
		
		return true;
		
	}
			
	
		
		
		
	
	
	
	
	
	
	
	//TRAER SOLICITUD STOCK
	public SolicitudStock traerSolicitud (Pedido pedido) {
		int i = 0;
		SolicitudStock s = null;
		
		while (i<this.getLstSolicitud().size() && s == null) {
			if(this.getLstSolicitud().get(i).getPedido().equals(pedido)) {
				s = this.getLstSolicitud().get(i);
			}i++;
		}return s;
		
		
	}
	
	
	//TRAER PEDIDO
	public Pedido traerPedido (int idPedido) {
		Pedido p = null;
		int i = 0;
		
		while(i<this.getLstPedido().size()   &&  p == null) {
			if(this.getLstPedido().get(i).getIdPedido() == idPedido) {
				p = this.getLstPedido().get(i);
			}i++;
		}return p;
		
	}
	

	//TRAER STOCK
	public Stock traerStock1 (int idStock ) {
		int i = 0;
		Stock s = null;
		
		while(i<this.getLstStock().size() && s == null) {
			if(this.getLstStock().get(i).getIdStock()==idStock) {
				s= this.getLstStock().get(i);
			}i++;
		}return s;
	}
	
	//ALTA STOCK
	public boolean altaStock (Local local,Producto producto, int cantidadStock , int cantidadLote ,  LocalDate fechaEntrada) {
		int id = 1;
		
		if(!this.getLstStock().isEmpty()) {
			id = this.getLstStock().get(this.getLstStock().size()-1).getIdStock()+1;
		}
		return lstStock.add(new Stock (id,local,producto,cantidadStock,cantidadLote,fechaEntrada));
	}
	
	//GENERACION DE FACTURA
	public boolean generarFactura (Pedido pedido) {
		int id = 1;
		
		
		if(!this.lstFactura.isEmpty()) {
			id = this.getLstFactura().get(this.getLstFactura().size()-1).getIdFactra()+1;
		}
		
		 lstFactura.add(new Factura (id,pedido.getProducto().getPrecioUnitario()*pedido.getCantidadSolicitada(),pedido.getCliente(),pedido));
		return true;
		 
	}
	
	public Factura traerFactura(int idFactura) {
		
		int i = 0;
		Factura f = null;
		
		while(i<this.getLstFactura().size() && f == null) {
			if(this.getLstFactura().get(i).getIdFactra()==idFactura) {
				f=this.getLstFactura().get(i);
			}i++;
		}
		return f;
		
	}
	
	
}
	
