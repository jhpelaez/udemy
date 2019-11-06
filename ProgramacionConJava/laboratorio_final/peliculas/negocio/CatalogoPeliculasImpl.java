package peliculas.negocio;

import peliculas.datos.AccesoDatos;
import peliculas.datos.AccesoDatosImpl;
import peliculas.domain.Pelicula;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
	
	AccesoDatos accesoDatos = new AccesoDatosImpl();

	@Override
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) {	
		accesoDatos.escribir(new Pelicula(nombrePelicula), nombreArchivo, true);		
	}

	@Override
	public void listarPeliculas(String nombreArchivo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPelicula(String nombreArchivo, String buscar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		// TODO Auto-generated method stub
		
	}

}
