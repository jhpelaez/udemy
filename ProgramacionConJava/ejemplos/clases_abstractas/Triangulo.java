package clases_abstractas;


public class Triangulo extends FiguraGeometrica {

	protected Triangulo(String tipoFigura) {
		super(tipoFigura);
	}

	//No se usa el @override ya que la clase padre no declara ningun comportamiento
	//para este metodo.
	public void dibujar() {
		System.out.println("Aqui deberia dibujar un: "+this.getClass().getSimpleName());		
	}
}
