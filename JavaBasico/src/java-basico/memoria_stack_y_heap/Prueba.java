package memoria_stack_y_heap;

public class Prueba {
	
	Persona p1 = new Persona("hader", 30);
	Persona p2 = p1;
	
	public void prueba() {
		System.out.println("nombre desde p1: "+p1.getNombre());
		System.out.println("edad desde p2: "+p2.getEdad());
		
		System.err.println("modificar edad desde p2");
		p2.setEdad(31);
		System.out.println("nueva edad desde p1: "+p1.getEdad());
	}

}
