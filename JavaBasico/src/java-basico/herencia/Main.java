package herencia;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Juan", 25000);
		System.out.println("Objeto empleado 1: " + e1);
		
		Empleado e2 = new Empleado("Pedro", 15000);
		e2.setEdad(28);
		e2.setGenero('M');
		e2.setDireccion("Medellin, Colombia");
		System.out.println("Objeto empleado 2: " + e2);
		
		Cliente c1 = new Cliente(new Date(), false);
		System.out.println("Objeto cliente 1: " + c1);
		c1.setNombre("Karla");
		c1.setEdad(22);
		c1.setGenero('F');
		c1.setDireccion("Mexico, DF");
		System.out.println("Nuevamente - Objeto cliente 1: " + c1);
	}

}
