package util;

import model.RegistroActividad;

/**
 * # Record Patterns (Java 19/21)
 */
public class RecordPatternsEjemplo {

	public static void procesar(RegistroActividad r) {
		switch (r) {
		case RegistroActividad(String msg, long ts) ->
			System.out.println("Record pattern -> mensaje: " + msg + ", ts: " + ts);
		}
	}
}
