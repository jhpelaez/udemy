package manejo_interfaces.manejo_interfaces;

import manejo_interfaces.datos.AccesoDatos;
import manejo_interfaces.datos.ImplementacionMySql;
import manejo_interfaces.datos.ImplementacionOracle;

public class ManejoInterfaces {
	
	public static void main(String[] args) {
		AccesoDatos datos = new ImplementacionOracle();
		ejecutar(datos, "listar");
		
		datos = new ImplementacionMySql();
		ejecutar(datos, "insertar");
	}

	private static void ejecutar(AccesoDatos datos, String accion) {
		if("listar".equals(accion))
			datos.listar();
		else if("insertar".equals(accion))
			datos.insertar();		
	}

}
