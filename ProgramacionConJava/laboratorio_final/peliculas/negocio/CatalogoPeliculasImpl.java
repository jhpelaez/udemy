package peliculas.negocio;

import java.util.List;

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
		List<Pelicula> peliculas = accesoDatos.listar(nombreArchivo);
		for(Pelicula p: peliculas) {
			System.out.println("Pelicula: "+p.getNombre());
		}
	}

	@Override
	public void buscarPelicula(String nombreArchivo, String buscar) {
		String pelicula = accesoDatos.buscar(nombreArchivo, buscar);
		if(pelicula == null)
			System.out.println("No se encontro la pelicula indicada");
		else
			System.out.println("Pelicula encontrada: "+pelicula);
		
	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		// TODO Auto-generated method stub
		
	}

}
