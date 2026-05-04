package ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class TemperaturasApp {

    public static void main(String[] args) {
        List<RegistroTemperatura> registros = new ArrayList<>();

        registros.add(new RegistroTemperatura("Lunes", 18.5));
        registros.add(new RegistroTemperatura("Martes", 21.0));
        registros.add(new RegistroTemperatura("Miércoles", 19.8));
        registros.add(new RegistroTemperatura("Jueves", 24.3));
        registros.add(new RegistroTemperatura("Viernes", 27.1));
        registros.add(new RegistroTemperatura("Sábado", 26.4));
        registros.add(new RegistroTemperatura("Domingo", 22.7));

        mostrarRegistros(registros);

        double media = calcularTemperaturaMedia(registros);
        System.out.println("Temperatura media: " + media + " ºC");

        RegistroTemperatura diaMasCaluroso = buscarDiaMasCaluroso(registros);
        System.out.println("Día más caluroso: " + diaMasCaluroso);

        int diasCalurosos = contarDiasPorEncimaDe(registros, 25.0);
        System.out.println("Días por encima de 25 ºC: " + diasCalurosos);

        List<RegistroTemperatura> diasSuaves = obtenerDiasEntreTemperaturas(registros, 20.0, 25.0);
        System.out.println();
        System.out.println("Días con temperatura suave:");
        mostrarRegistros(diasSuaves);
    }

    public static void mostrarRegistros(List<RegistroTemperatura> registros) {
        for (RegistroTemperatura registro : registros) {
            System.out.println(registro);
        }
    }

    public static double calcularTemperaturaMedia(List<RegistroTemperatura> registros) {
        double suma = 0;

        for (RegistroTemperatura registro : registros) {
            suma += registro.getTemperatura();
        }

        return suma / registros.size();
    }

    public static RegistroTemperatura buscarDiaMasCaluroso(List<RegistroTemperatura> registros) {
        RegistroTemperatura diaMasCaluroso = registros.get(0);

        for (int i = 1; i < registros.size(); i++) {
            RegistroTemperatura registroActual = registros.get(i);

            if (registroActual.getTemperatura() > diaMasCaluroso.getTemperatura()) {
                diaMasCaluroso = registroActual;
            }
        }

        return diaMasCaluroso;
    }

    public static int contarDiasPorEncimaDe(List<RegistroTemperatura> registros, double limite) {
        int contador = 0;

        for (RegistroTemperatura registro : registros) {
            if (registro.getTemperatura() > limite) {
                contador++;
            }
        }

        return contador;
    }

    public static List<RegistroTemperatura> obtenerDiasEntreTemperaturas(
            List<RegistroTemperatura> registros,
            double temperaturaMinima,
            double temperaturaMaxima) {

        List<RegistroTemperatura> resultado = new ArrayList<>();

        for (RegistroTemperatura registro : registros) {
            double temperatura = registro.getTemperatura();

            if (temperatura >= temperaturaMinima && temperatura <= temperaturaMaxima) {
                resultado.add(registro);
            }
        }

        return resultado;
    }
}

class RegistroTemperatura {

    private String dia;
    private double temperatura;

    public RegistroTemperatura(String dia, double temperatura) {
        this.dia = dia;
        this.temperatura = temperatura;
    }

    public String getDia() {
        return dia;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return dia + ": " + temperatura + " ºC";
    }
}