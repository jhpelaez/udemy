package conversion_objetos;

public class EjemploConversionObjetos {

	public static void main(String[] args) {
		
		//Creacion del tipo de mayor gerarquia
		Empleado empleado = new Escritor("Roy", 15000, TipoEscritura.CLASICO);
		imprimirDetalles(empleado);
		
		empleado = new Gerente("laura", 18000, "Sistemas");
		imprimirDetalles(empleado);
	}

	private static void imprimirDetalles(Empleado empleado) {
		String resultado = null;
		System.out.println("\nDetalle: "+empleado.obtenerDetalles());
		
		//para los detalles de cada clase
		if (empleado instanceof Escritor) {
			//downcasting
			resultado = ((Escritor)empleado).getTipoEscrituraEnTexto();
			System.out.println("Resultado tipoEscritura: "+resultado);
		} else if (empleado instanceof Gerente) {
			//downcasting
			resultado = ((Gerente)empleado).getDepartamento();
			System.out.println("Resultado departamento: "+resultado);
		}
	}

}
