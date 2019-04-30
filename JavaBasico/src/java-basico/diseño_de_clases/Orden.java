package diseño_de_clases;

public class Orden {
	
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	
	public Orden() {
		this.idOrden = ++contadorOrdenes;
		productos = new Producto[MAX_PRODUCTOS];
	}
	
	public void agregarProducto(Producto producto) {
		if(contadorProductos < MAX_PRODUCTOS) {
			productos[contadorProductos++] = producto;
		} else {
			System.out.println("Se a superado el maximo de productos: "+ MAX_PRODUCTOS);
		}
	}
	
	public double calcularTotal() {
		double total = 0;
		
		for(int i=0; i<contadorProductos; i++) {
			total += productos[i].getPrecio();
		}
		return total;
	}
	
	public void mostrarorden() {
		System.out.println("Orden # "+ idOrden);
		System.out.println("Total de la orden: $"+calcularTotal());
		System.out.println("Productos en la orden:");
		for(int i=0; i<contadorProductos; i++)
			System.out.println(productos[i]);
	}

}
