package clase_object;

public class ClaseObject {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("Juan", 10000);
		Empleado emp2 = new Empleado("Juan", 10000);
		
		compararObjetos(emp1, emp2);

	}

	private static void compararObjetos(Empleado emp1, Empleado emp2) {
		System.out.println("contenido objeto: "+ emp1 );
		
		//Revision por referencia, osea por posicion de memoria
		if(emp1 == emp2)
			System.out.println("Los objetos tienen la misma direccion de memoria");
		else
			System.out.println("Los objetos tienen distinta direccion de memoria");
		
		//Revision por metodo equals, osea por valor
		if(emp1.equals(emp2))
			System.out.println("Los objetos tienen el mismo contenido, soniguales");
		else
			System.out.println("Los objetos NO tienen el mismo contenido, NO son iguales");
		
		//Revisamos el metodo hasCode
		if(emp1.hashCode() == emp2.hashCode())
			System.out.println("Los objetos tienen el mismo codigo hash");
		else
			System.out.println("Los objetos NO tienen el mismo codigo hash");
	}

}
