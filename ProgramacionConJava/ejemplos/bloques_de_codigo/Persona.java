package bloques_de_codigo;

public class Persona {
	
	private final int idPersona;
	private static int contadorPersonas;
	
	/**
	 * Bloque de inicializacion estatico
	 * EN ESTE BLOQUE NO SE PUEDEN USAR
	 * VARIABLES NO ESTATICAS
	 */
	static {
		contadorPersonas = 10;
		System.out.println("Ejecuta bloque estatico");
	}
	
	/**
	 * Bloque de codigo para inicializar atributos de la clase
	 * Este bloque se copia a cada constructor de la clase
	 */
	{
		System.out.println("Ejecuta bloque inicializador");
		idPersona = ++contadorPersonas;
	}

	public Persona() {
		System.out.println("Ejecuta constructor");
	}
	
	public int getIdPersona() {
		return idPersona;
	}
}
