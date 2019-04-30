package enums;

public class EjemploEnums {

	public static void main(String[] args) {
		System.out.println("Valor 1: "+Dias.LUNES);
		System.out.println("Valor 2: "+Dias.MARTES.name());
		System.out.println("Continente "+Continentes.AMERICA+" con "+
							Continentes.AMERICA.getPaises()+" paises");
		
		imprimirContinentes();
	}

	private static void imprimirContinentes() {
		for(Continentes continente: Continentes.values()) {
			System.out.println(continente +" tiene "+ continente.getPaises()+" paises");
		}
	}

}
