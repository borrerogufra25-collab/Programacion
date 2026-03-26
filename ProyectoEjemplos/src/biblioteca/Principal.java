package biblioteca;

import model.Libro;
import model.Material;
import model.Revista;
import model.RegistroActividad;
import model.Usuario;
import service.ActividadService;
import service.LibroService;
import service.PrestamoService;
import service.UsuarioService;
import util.PatternMatchingEjemplo;
import util.RecordPatternsEjemplo;
import util.TextBlockEjemplo;
import util.VirtualThreadsEjemplo;

import java.util.Scanner;

/*
 * SISTEMA DE GESTIÓN DE BIBLIOTECA — EVOLUCIÓN DE JAVA 8 A JAVA 23
 *
 * Este proyecto muestra cómo las distintas versiones de Java han ido
 * mejorando el lenguaje y cómo esas mejoras pueden aplicarse a un
 * sistema real de gestión de biblioteca.
 *
 * Cada versión incorpora una funcionalidad destacada:
 * - Java 13: Text Blocks
 * - Java 16: Pattern Matching para instanceof y Records
 * - Java 17: Sealed Classes
 * - Java 19–21: Record Patterns y Virtual Threads
 * - Java 23: Comentarios JavaDoc en Markdown
 */

public class Principal {

	private static final LibroService libroService = new LibroService();
	private static final UsuarioService usuarioService = new UsuarioService();
	private static final PrestamoService prestamoService = new PrestamoService();
	private static final ActividadService actividadService = new ActividadService();

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			TextBlockEjemplo.mostrarBanner();
			int opcion;

			do {
				System.out.println("""
						=== MENÚ PRINCIPAL ===
						1. Gestionar libros
						2. Gestionar usuarios
						3. Gestionar préstamos
						4. Ejemplos de versiones Java
						0. Salir
						""");

				System.out.print("Opción: ");
				opcion = leerEntero(sc);

				switch (opcion) {
				case 1 -> menuLibros(sc);
				case 2 -> menuUsuarios(sc);
				case 3 -> menuPrestamos(sc);
				case 4 -> menuEjemplosJava();
				case 0 -> System.out.println("Saliendo...");
				default -> System.out.println("Opción no válida");
				}

			} while (opcion != 0);
		}
	}

	private static int leerEntero(Scanner sc) {
		while (!sc.hasNextInt()) {
			System.out.print("Introduce un número válido: ");
			sc.next();
		}
		return sc.nextInt();
	}

	// ---- Menú Libros ----

	private static void menuLibros(Scanner sc) {
		int opcion;
		do {
			System.out.println("""
					--- Gestión de Libros ---
					1. Añadir libro
					2. Listar libros
					3. Eliminar libro
					0. Volver
					""");
			System.out.print("Opción: ");
			opcion = leerEntero(sc);
			sc.nextLine(); // limpiar salto

			switch (opcion) {
			case 1 -> anadirLibro(sc);
			case 2 -> listarLibros();
			case 3 -> eliminarLibro(sc);
			case 0 -> {
			}
			default -> System.out.println("Opción no válida");
			}
		} while (opcion != 0);
	}

	private static void anadirLibro(Scanner sc) {
		System.out.print("ID: ");
		int id = leerEntero(sc);
		sc.nextLine();
		System.out.print("Título: ");
		String titulo = sc.nextLine();
		System.out.print("Autor: ");
		String autor = sc.nextLine();

		Libro libro = new Libro(id, titulo, autor);
		libroService.agregar(libro);
		actividadService.registrar("Añadido libro " + titulo);
	}

	private static void listarLibros() {
		libroService.listar().forEach(System.out::println);
	}

	private static void eliminarLibro(Scanner sc) {
		System.out.print("ID del libro a eliminar: ");
		int id = leerEntero(sc);
		if (libroService.eliminar(id)) {
			actividadService.registrar("Eliminado libro con id " + id);
		} else {
			System.out.println("No se encontró el libro.");
		}
	}

	// ---- Menú Usuarios ----

	private static void menuUsuarios(Scanner sc) {
		int opcion;
		do {
			System.out.println("""
					--- Gestión de Usuarios ---
					1. Añadir usuario
					2. Listar usuarios
					3. Eliminar usuario
					0. Volver
					""");
			System.out.print("Opción: ");
			opcion = leerEntero(sc);
			sc.nextLine();

			switch (opcion) {
			case 1 -> anadirUsuario(sc);
			case 2 -> listarUsuarios();
			case 3 -> eliminarUsuario(sc);
			case 0 -> {
			}
			default -> System.out.println("Opción no válida");
			}
		} while (opcion != 0);
	}

	private static void anadirUsuario(Scanner sc) {
		System.out.print("ID: ");
		int id = leerEntero(sc);
		sc.nextLine();
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();

		Usuario u = new Usuario(id, nombre);
		usuarioService.agregar(u);
		actividadService.registrar("Añadido usuario " + nombre);
	}

	private static void listarUsuarios() {
		usuarioService.listar().forEach(System.out::println);
	}

	private static void eliminarUsuario(Scanner sc) {
		System.out.print("ID del usuario a eliminar: ");
		int id = leerEntero(sc);
		if (usuarioService.eliminar(id)) {
			actividadService.registrar("Eliminado usuario con id " + id);
		} else {
			System.out.println("No se encontró el usuario.");
		}
	}

	// ---- Menú Préstamos ----

	private static void menuPrestamos(Scanner sc) {
		int opcion;
		do {
			System.out.println("""
					--- Gestión de Préstamos ---
					1. Crear préstamo
					2. Listar préstamos
					0. Volver
					""");
			System.out.print("Opción: ");
			opcion = leerEntero(sc);
			sc.nextLine();

			switch (opcion) {
			case 1 -> crearPrestamo(sc);
			case 2 -> listarPrestamos();
			case 0 -> {
			}
			default -> System.out.println("Opción no válida");
			}
		} while (opcion != 0);
	}

	private static void crearPrestamo(Scanner sc) {
		System.out.print("ID libro: ");
		int idLibro = leerEntero(sc);
		System.out.print("ID usuario: ");
		int idUsuario = leerEntero(sc);

		var optLibro = libroService.buscarPorId(idLibro);
		var optUsuario = usuarioService.buscarPorId(idUsuario);

		if (optLibro.isEmpty() || optUsuario.isEmpty()) {
			System.out.println("Libro o usuario no encontrado.");
			return;
		}

		var prestamo = prestamoService.crearPrestamo(optLibro.get(), optUsuario.get());
		if (prestamo.isPresent()) {
			actividadService.registrar("Creado préstamo de libro " + idLibro + " a usuario " + idUsuario);
			System.out.println("Préstamo creado: " + prestamo.get());
		} else {
			System.out.println("El libro no está disponible.");
		}
	}

	private static void listarPrestamos() {
		prestamoService.listar().forEach(System.out::println);
	}

	// ---- Menú Ejemplos Java ----

	private static void menuEjemplosJava() {
		System.out.println("=== Ejemplos de características Java ===");

		// Text Blocks
		TextBlockEjemplo.mostrarBanner();

		// Pattern Matching + sealed classes
		Material m1 = new Libro(1, "Java 17", "Oracle");
		Material m2 = new Revista(2, "Java Magazine", 42);
		PatternMatchingEjemplo.describirMaterial(m1);
		PatternMatchingEjemplo.describirMaterial(m2);

		// Record + Record Patterns
		RegistroActividad r = new RegistroActividad("Ejemplo record patterns", System.currentTimeMillis());
		RecordPatternsEjemplo.procesar(r);

		// Virtual Threads
		System.out.println("Lanzando tareas con virtual threads (puede tardar un poco)...");
		try {
			VirtualThreadsEjemplo.ejecutarTareas();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
