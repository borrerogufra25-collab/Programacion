package zFechas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EjemploFechas {
	public static void main(String[] args) {

		// Obtener la fecha actual del sistema
		LocalDate hoy = LocalDate.now();
		System.out.println("Fecha de ahora: " + hoy);

		// Crear una fecha específica (ej. LocalDate (2026, 12, 31))
		LocalDate hoy2 = LocalDate.of(2026, 12, 31);
		System.out.println("Fecha predefinida: " + hoy2);

		// Sumar y restar a fechas
		// IMPORTANTE: como son inmutables, el resultado debe guardarse en una nueva
		// variable
		LocalDate proximaSemana = hoy.plusDays(7);
		LocalDate elMesPasado = hoy.minusMonths(1);
		System.out.println("Dentro de 7 día será: " + proximaSemana);
		System.out.println("Hace un mes fue: " + elMesPasado);

		// Demostración de inmutabilidad: la variable 'hoy' no ha cambiado

		// Comprobar si una fecha es anterior o posterior

		// Comprobar si

		LocalDateTime ahora = LocalDateTime.now();
		System.out.println(ahora);

	}
}
