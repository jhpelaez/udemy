package cpjlaboratoriofinal;

import java.util.Scanner;

import peliculas.negocio.CatalogoPeliculas;
import peliculas.negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		String nombreArchivo = "laboratorio_final\\peliculas.txt";
		CatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();
		
		do {
			System.out.println("Elije opcion \n"
					+ "1: Iniciar Catalogo Peliculas \n"
					+ "2: Agregar Pelicula \n"
					+ "3: Listar Peliculas \n"
					+ "4: Buscar Pelicula \n"
					+ "0: Salir");
			opcion = scanner.nextInt();
			System.out.println("opcion: "+opcion);
			
			switch(opcion) {
				case 1: 
						catalogoPeliculas.iniciarArchivo(nombreArchivo);
					break;
				case 2: 
						System.out.println("Introduce el nombre de la pelicula a agregar");
						String nombrePelicula = scanner.next();
						System.out.println("nombrePelicula: "+nombrePelicula);
						catalogoPeliculas.agregarPelicula(nombrePelicula, nombreArchivo);
					break;
				case 3: 
						catalogoPeliculas.listarPeliculas(nombreArchivo);
					break;
				case 4: 
						System.out.println("Ingrese pelicula a buscar:");
						String nombrePeliculaABuscar = scanner.next();
						System.out.println("nombrePelicula: "+nombrePeliculaABuscar);
						catalogoPeliculas.buscarPelicula(nombreArchivo, nombrePeliculaABuscar);
					break;
				case 0:
						System.out.println("Hasta luego");
					break;
				default:
						System.out.println("Opcion no permitida");
					break;
			}	
		} while(opcion != 0);
		
		
	}

}
