package service;

import model.RegistroActividad;

/**
 * # Servicio de Actividad
 *
 * Usa records para registrar eventos.
 */
public class ActividadService {

	public void registrar(String mensaje) {
		RegistroActividad r = new RegistroActividad(mensaje, System.currentTimeMillis());
		System.out.println("[ACTIVIDAD] " + r.mensaje() + " @ " + r.timestamp());
	}
}
