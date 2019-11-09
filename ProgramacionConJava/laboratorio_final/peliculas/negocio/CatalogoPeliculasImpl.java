package peliculas.negocio;

import java.util.List;

import peliculas.datos.AccesoDatos;
import peliculas.datos.AccesoDatosImpl;
import peliculas.domain.Pelicula;
import peliculas.excepciones.AccesoDatosEx;
import peliculas.excepciones.EscrituraDatosEx;
import peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
	
	private final AccesoDatos accesoDatos;
	
	public CatalogoPeliculasImpl() {
		this.accesoDatos = new AccesoDatosImpl();
	}

	@Override
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
		boolean anexar = false;
		try {
			accesoDatos.escribir(new Pelicula(nombrePelicula), nombreArchivo, accesoDatos.existe(nombreArchivo));
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace();
		}		
	}

	@Override
	public void listarPeliculas(String nombreArchivo) {
		try {
			List<Pelicula> peliculas = accesoDatos.listar(nombreArchivo);
			for(Pelicula p: peliculas) {
				System.out.println("Pelicula: "+p.getNombre());
			}
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace();
		}		
	}

	@Override
	public void buscarPelicula(String nombreArchivo, String buscar) {
		String pelicula = null;
		try {
			pelicula = accesoDatos.buscar(nombreArchivo, buscar);
		} catch (LecturaDatosEx e) {
			System.out.println("Error al buscar la pelicula");
			e.printStackTrace();
		}
		System.out.println("Resultado busqueda: "+pelicula);	
	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		try {
			if(accesoDatos.existe(nombreArchivo)) {
				accesoDatos.borrar(nombreArchivo);
				accesoDatos.crear(nombreArchivo);
			} else {
				accesoDatos.crear(nombreArchivo);
			}
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace();
		}
	}
}
