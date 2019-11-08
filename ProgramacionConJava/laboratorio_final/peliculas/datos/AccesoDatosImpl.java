package peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import peliculas.domain.Pelicula;

public class AccesoDatosImpl implements AccesoDatos {

	@Override
	public boolean existe(String nombreArchivo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Pelicula> listar(String nombre) {
		File archivo = new File(nombre);
		List<Pelicula> lista = new ArrayList<Pelicula>();
		try {
			BufferedReader capturar = new BufferedReader(new FileReader(archivo));
			String pelicula = capturar.readLine();	
			while(pelicula != null) {
				lista.add(new Pelicula(pelicula));
				pelicula = capturar.readLine();
			}
			capturar.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
		
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter escribir = new PrintWriter(new FileWriter(archivo, true));
			escribir.println(pelicula.getNombre());
			escribir.close();
			System.out.println("Se ha escrito correctamente al archivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String buscar(String nombreArchivo, String buscar) {
		File archivo = new File(nombreArchivo);
		String resultado = null;
		try {
			BufferedReader capturar = new BufferedReader(new FileReader(archivo));
			resultado = capturar.readLine();
			while (resultado != null) {
				if (resultado.equals(buscar))
					return resultado = buscar;
				resultado = capturar.readLine();
			}
			capturar.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resultado;
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
