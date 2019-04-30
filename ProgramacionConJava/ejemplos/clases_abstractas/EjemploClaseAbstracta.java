package clases_abstractas;

public class EjemploClaseAbstracta {

	public static void main(String[] args) {
		
		//Creacion de objetos
		FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
		FiguraGeometrica triangulo = new Triangulo("Triangulo");
		FiguraGeometrica circulo = new Circulo("Circulo");
		
		System.out.println(rectangulo);
		rectangulo.dibujar();
		
		System.out.println("");
		System.out.println(triangulo);
		triangulo.dibujar();
		
		System.out.println("");
		System.out.println(circulo);
		circulo.dibujar();
	}

}
