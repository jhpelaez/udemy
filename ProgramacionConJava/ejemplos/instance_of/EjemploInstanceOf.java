package instance_of;

public class EjemploInstanceOf {

	public static void main(String[] args) {
		
		FiguraGeometrica figura = new Rectangulo();
		System.out.println("Determina Tipo");
		determinarTipo(figura);
		
		System.out.println("\nDetermina todos los Tipos");
		determinaTodosLosTipos(figura);
		
	}

	private static void determinaTodosLosTipos(FiguraGeometrica figura) {
		if (figura instanceof Elipse)
			System.out.println("Es una elipse");
		if (figura instanceof Circulo)
			System.out.println("Es un circulo");
		if (figura instanceof FiguraGeometrica)
			System.out.println("Es una figura geometrica");
		if (figura instanceof Object)
			System.out.println("Es un Object");
		else 
			System.out.println("No se encontro el tipo");
		
	}

	private static void determinarTipo(FiguraGeometrica figura) {
		if (figura instanceof Triangulo)
			System.out.println("Es un triangulo");
		else if (figura instanceof Elipse)
			System.out.println("Es una elipse");
		else if (figura instanceof FiguraGeometrica)
			System.out.println("Es una figura geometrica");
		else if (figura instanceof Object)
			System.out.println("Es un Object");
		else 
			System.out.println("No se encontro el tipo");
	} 

}
