package conversion_objetos;

public class Escritor extends Empleado {
	
	final TipoEscritura tipoEscritura;
	
	public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
		super(nombre, sueldo);
		this.tipoEscritura = tipoEscritura;
	}
	
	public TipoEscritura getTipoEscritura() {
		return tipoEscritura;
	}
	
	public String getTipoEscrituraEnTexto() {
		return tipoEscritura.getDescripcion();
	}
	
	public String obtenerDetalles() {
		return super.obtenerDetalles() + 
				", tipo escritura: "+tipoEscritura.getDescripcion();
	}

}
