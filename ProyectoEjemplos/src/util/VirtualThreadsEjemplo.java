package util;

import java.util.concurrent.Executors;

/**
 * # Virtual Threads (Java 21)
 */
public class VirtualThreadsEjemplo {

	public static void ejecutarTareas() throws InterruptedException {
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
			for (int i = 0; i < 1000; i++) {
				int num = i;
				executor.submit(() -> {
					Thread.sleep(50);
					System.out.println("Tarea virtual " + num + " ejecutada");
					return null;
				});
			}
		}
	}
}
