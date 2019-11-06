package peliculas.datos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import peliculas.domain.Pelicula;
import peliculas.excepciones.EscrituraDatosEx;

public class AccesoDatosImpl implements AccesoDatos {

	@Override
	public boolean existe(String nombreArchivo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Pelicula> listar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
		
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(pelicula.getNombre());
			salida.close();
			System.out.println("Se ha escrito correctamente al archivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String buscar(String nombreArchivo, String buscar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crear(String nombreArchivo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String nombreArchivo) {
		// TODO Auto-generated method stub
		
	}

}
