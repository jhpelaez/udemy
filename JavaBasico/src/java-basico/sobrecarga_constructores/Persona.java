package sobrecarga_constructores;

public class Persona {
	
	private String nombre;
	private static int contadorPersona;
	private int idPersona;
	private int edad;
	
	private Persona() {
		this.idPersona = ++contadorPersona;
	}
	
	public Persona(String nombre, int edad) {
		this();
		this.nombre = nombre;
		this.edad = edad; 
	}
	
	

}
