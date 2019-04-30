package memoria_stack_y_heap;

public class Main {

	static Persona p1 = new Persona("hader", 30);
	static Persona p2 = p1;
	
	public static void main(String[] args) {
		System.out.println("nombre desde p1: "+p1.getNombre());
		System.out.println("edad desde p2: "+p2.getEdad());
		
		System.out.println("modificar edad desde p2");
		p2.setEdad(31);
		System.out.println("nueva edad desde p1: "+p1.getEdad());
		
		p1 = null;
		System.out.println("cambiar nombre desde p2");
		p2.setNombre("Daniela");
		try {
			p1.getNombre();
		} catch(Exception e) {
			System.out.println("ya no existe la referencia de p1");
			System.out.println("nombre desde p2: "+p2.getNombre());
		}
	}
}
