//Josue Ramon Garcia Gutierrez 1273078
package Paquete;

public class Main {
    public static void main(String[] args) {
        // se hace un objeto llamado torneo
        Torneo torneo = new Torneo();
        torneo.setNombre_torneo(CapturaEntrada.capturarString("Ingresa el nombre del torneo "));
        torneo.setRegion(CapturaEntrada.capturarString("Ingresa region del torneo "));
        torneo.setEquipos_participantes(CapturaEntrada.capturarEntero("Cuantos Equipos participaran?"));
        torneo.setPartidos_jugados(CapturaEntrada.capturarEntero("Cuantos partidos Deseas?? "));
        torneo.setPartidos_pendientes(CapturaEntrada.capturarEntero("Ingrese Partiodos pendientes "));
        //se muestran datos completos
        System.out.println("BIENVENDIDO AL TORNEO " + torneo.getNombre_torneo() + " EN LA REGION DE " + torneo.getRegion());
        System.out.println("Equipos participantes: " + torneo.getEquipos_participantes());
        System.out.println("Partidos jugados: " + torneo.getPartidos_jugados());
        System.out.println("Partidos pendientes: " + torneo.getPartidos_pendientes()+"\n");
        //se inicializa el torneo
        torneo.crear_torneo();
    }
}
