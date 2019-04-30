package sobrecarga_constructores;

public class Empleado extends Persona{
	
	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

}
