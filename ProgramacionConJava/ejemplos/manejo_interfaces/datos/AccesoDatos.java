package manejo_interfaces.datos;

public interface AccesoDatos {
	
	//el compilador por defecto pone publicas y staticas todas las 
	//variables de una interface
	public static int MAX_REGISTROS = 10;
	
	//el compilador por defecto pone publicas y abstract todas los 
	//metodos de una interface
	public abstract void insertar();
	public abstract void listar();

}
