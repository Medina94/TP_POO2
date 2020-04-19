package test;



import java.time.LocalDate;


import stock.Sistema;

public class Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Sistema s = new Sistema ();
	//TRAER Y AGREGAR PRODUCTOS
		System.out.println("PUNTO 4------------------------------------------------------------------------------------------------------------------");
		s.altaProducto("Zapatillas", 1500);
		s.altaProducto("Remera", 800);
		
		//s.modificarProducto(1, "Zapatillas", 1400);
		//s.bajaProducto(1);
		System.out.println(s.traerProducto(1));	
		System.out.println(s.traerProducto(2));
		
		//TRAER Y AGREGAR EMPLEADOS
		System.out.println("PUNTO 2------------------------------------------------------------------------------------------------------------------");
		LocalDate fecha1 = LocalDate.of (2019,05,31);
		
		s.altaEmpleado("Agustin", "Gonzale",fecha1 , "456@gmail.com",1, true, 11111111);
		s.altaEmpleado("Federico", "Pep", fecha1, "789@gmail.com", 2, true, 22222222);
		s.altaEmpleado("Pablo", "Balb", fecha1, "852@gmail.com", 3, true, 33333333);
		s.altaEmpleado("Esteban", "Ch", fecha1, "369@gmail.com", 4, true, 44444444);
		
		System.out.println(s.traerEmpleado(11111111));
		System.out.println(s.traerEmpleado(22222222));
		System.out.println(s.traerEmpleado(33333333));
		System.out.println(s.traerEmpleado(44444444));
		
		//TRAER Y AGREGAR CLIENTES
		System.out.println("PUNTO 3------------------------------------------------------------------------------------------------------------------");
		s.altaCliente("juan", "Perez", fecha1, "123@gmail.com", 123456);
		s.altaCliente("Pepe", "Martinez", fecha1, "321@gmail.com", 654321);
		
		System.out.println(s.traerCliente(123456));
		System.out.println(s.traerCliente(654321));
		

		
		
		
		//TRAER Y AGREGAR LOCALES
		System.out.println("PUNTO 1------------------------------------------------------------------------------------------------------------------");
		
		s.altaLocal(111111111, "Calle 1" , 1, 1, s.traerEmpleado(11111111));
		s.altaLocal(222222222, "Calle 2" , 2, 2, s.traerEmpleado(22222222));
		s.altaLocal(333333333, "Calle 3" , 3, 3, s.traerEmpleado(33333333));
		s.altaLocal(444444444, "Calle 4" , 4, 4, s.traerEmpleado(44444444));
		
		System.out.println(s.traerLocal(1));
		System.out.println(s.traerLocal(2));
		System.out.println(s.traerLocal(3));
		System.out.println(s.traerLocal(4));
		
	
		
		//TRAER Y AGREGAR STOCK
		
		s.altaStock(s.traerLocal(1), s.traerProducto(1), 200, 200, fecha1);
		s.altaStock(s.traerLocal(2), s.traerProducto(1), 80, 200, fecha1);
		s.altaStock(s.traerLocal(3), s.traerProducto(2), 0, 300, fecha1);
		s.altaStock(s.traerLocal(4), s.traerProducto(2), 500, 500, fecha1);
		
		
		System.out.println("INFORMACION DE LOS STOCK");
		System.out.println(s.traerStock1(1));
		System.out.println(s.traerStock1(2));
		System.out.println(s.traerStock1(3));
		System.out.println(s.traerStock1(4));
		
		
		//TRAER Y AGREGAR PEDIDOS
		System.out.println("GENERACION DE PEDIDOS");
		s.altaPedido(80, s.traerProducto(1), fecha1,  s.traerCliente(123456),s.traerEmpleado(11111111));
		s.altaPedido(40, s.traerProducto(1), fecha1,  s.traerCliente(123456),s.traerEmpleado(22222222));
		s.altaPedido(20, s.traerProducto(2), fecha1, s.traerCliente(654321),s.traerEmpleado(33333333));
		s.altaPedido(100, s.traerProducto(2), fecha1, s.traerCliente(654321),s.traerEmpleado(44444444));
		
		System.out.println(s.traerPedido(1));
		System.out.println(s.traerPedido(2));
		System.out.println(s.traerPedido(3));
		System.out.println(s.traerPedido(4));
		
		//VALIDACION DE STOCK

		System.out.println("PUNTO 10------------------------------------------------------------------------------------------------------------------");
			System.out.println("SOLICITUD DEL PEDIDO 1");
			s.generarScolicitud(s.traerPedido(1));
			System.out.println(s.traerSolicitud(s.traerPedido(1)));
			s.actualizarStock(s.traerPedido(1));
			System.out.println("SOLICITUD DEL PEDIDO 2");
			s.generarScolicitud(s.traerPedido(2));
			System.out.println(s.traerSolicitud(s.traerPedido(2)));
			s.actualizarStock(s.traerPedido(2));
			//NO SE PUEDE REALIZAR
			System.out.println("SOLICITUD DEL PEDIDO 3");
			s.generarScolicitud(s.traerPedido(3));
			System.out.println(s.traerSolicitud(s.traerPedido(3)));
			System.out.println("SOLICITUD DEL PEDIDO 4");
			s.generarScolicitud(s.traerPedido(4));
			System.out.println(s.traerSolicitud(s.traerPedido(4)));
			s.actualizarStock(s.traerPedido(4));
			//GENERACION AUTOMATICA DEL PEDIDO 3 CON STOCK DISPONIBLE
			System.out.println("SOLICITUD DEL PEDIDO 3 CON STOCK DISPONIBLE DE OTRO COLABORADOR(LOCAL)");
			s.solicitudAjena(s.traerPedido(3));
			System.out.println(s.traerSolicitud(s.traerPedido(3)));
			s.aceptarSolicitudAjena(s.traerPedido(3), s.traerEmpleado(44444444));
			System.out.println("Solicitud aceptada con stock actualizado");
			System.out.println(s.traerSolicitud(s.traerPedido(3)));

			System.out.println("STOCKS ACTUALIZADOS");
			System.out.println(s.traerStock1(1));
			System.out.println(s.traerStock1(2));
			System.out.println(s.traerStock1(3));
			System.out.println(s.traerStock1(4));
			
			
			s.generarFactura(s.traerPedido(1));
			System.out.println(s.traerFactura(1));
	}


}
	
