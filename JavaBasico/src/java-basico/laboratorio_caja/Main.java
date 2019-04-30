package laboratorio_caja;

public class Main {

	public static void main(String[] args) {
		int ancho = 3;
		int alto = 2;
		int profundo = 6;
		
		Caja caja = new Caja(ancho, alto, profundo);
		System.out.println("con las variables de clase: "+caja.calcularVolumen());
		
		Caja caja2 = new Caja();
		System.out.println("con las variables pasadas por parametro: "+caja2.calcularVolumen(2, 2, 2));

	}

}
