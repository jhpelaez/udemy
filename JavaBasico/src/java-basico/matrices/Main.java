package matrices;

public class Main {

	public static void main(String[] args) {
		String palabras[][] = new String[2][2];
		int numeros[][] = new int[2][2];
		String nombres[][] = {{"Hader", "Daniela"},{"Alvaro", "Gilma"},{"Adan", "Eva"}};
		
		palabras[0][0] = "hola";		
		numeros[1][1] = 32;
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.println("palabras: "+palabras[i][j]);
				System.out.println("numeros: "+numeros[i][j]);
				System.out.println("");
			}
			
		}
		System.out.println("Matriz de nombres:");
		for (int i=0; i<nombres.length; i++) {
			for (int j=0; j<nombres[i].length; j++) {
				System.out.println("palabras "+i+" - "+j+": " +nombres[i][j]);
			}
			
		}

	}

}
