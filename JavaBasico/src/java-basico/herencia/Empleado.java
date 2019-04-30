package herencia;

public class Empleado extends Persona {
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleados;
	
	public Empleado(String nombre, double sueldo) {
		super(nombre);
		this.sueldo = sueldo;
		this.idEmpleado = ++contadorEmpleados;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public static int getContadorEmpleados() {
		return contadorEmpleados;
	}

	public static void setContadorEmpleados(int contadorEmpleados) {
		Empleado.contadorEmpleados = contadorEmpleados;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
}
