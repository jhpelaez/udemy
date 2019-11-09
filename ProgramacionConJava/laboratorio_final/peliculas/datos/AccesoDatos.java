package peliculas.datos;

import java.util.List;

import peliculas.domain.Pelicula;
import peliculas.excepciones.AccesoDatosEx;
import peliculas.excepciones.EscrituraDatosEx;
import peliculas.excepciones.LecturaDatosEx;

public interface AccesoDatos {
	
	public boolean existe(String nombreArchivo) throws AccesoDatosEx;
	
	public List<Pelicula> listar(String nombre) throws LecturaDatosEx;
	
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
	
	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
	
	public void crear(String nombreArchivo) throws AccesoDatosEx;
	
	public void borrar(String nombreArchivo) throws AccesoDatosEx;

}
