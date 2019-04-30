package varargs;


/**
 * Esta funcionalidad var args lo que hace es que permite que un metodo reciba tantos
 * parametros como quiera siempre y cuando sean del mismo tipo
 * @author User
 *
 */
public class Varargs {

	public static void main(String[] args) {
		System.out.println("Imprimiendo numeros");
		imprimirNumeros(1,2,3,4,5,6,7,8);
		imprimirNumeros(9,8,7,6,5);
		imprimirNumeros(1);
		
		System.out.println("\n Imprimiendo sumas");
		System.out.println("resultado de 1er suma: "+sumarNumeros(1,2,3,4));
		System.out.println("resultado de 2er suma: "+sumarNumeros(1,1));
		
		System.out.println("\n Imprimiendo Objetos");
		imprimirObjetos(1, "Calculadora", 4.3, 'M');
	}
	
	public static void imprimirNumeros(int... numeros) {
		for (int i=0; i<numeros.length; i++)
			System.out.print(numeros[i]+" | ");
		System.out.println();
	}
	
	public static int sumarNumeros(int... numeros) {
		int resultado = 0;
		for (int i=0; i<numeros.length; i++)
			resultado += numeros[i];
		
		return resultado;
	}
	
	public static void imprimirObjetos(Object... objetos) {
		for (int i=0; i<objetos.length; i++)
			System.out.print(objetos[i]+" | ");
		System.out.println();
	}

}
