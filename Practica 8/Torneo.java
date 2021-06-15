//Josue Ramon Garcia Gutierrez 1273078
package Paquete;

public class Torneo {
    String nombre_torneo;
    String Region;
    int equipos_participantes;
    int partidos_jugados;
    int partidos_pendientes;
    //se crea el torneo
    public void crear_torneo() {
        //se crea arreglo ed objetos de los equipos
        Equipo[] equipos = new Equipo[equipos_participantes];
        for(int i = 0; i < equipos_participantes ; ++i) {
            System.out.println("Bienvenido al mundial de Baloncesto!! Equipo "+ (i+1));
            equipos[i] = new Equipo();
            equipos[i].setNombre_equipo(CapturaEntrada.capturarString("\nIngrese Nombre del equipo: "));
            equipos[i].setDivision(CapturaEntrada.capturarString("Ingrese su Division: "));
            equipos[i].setNombre_Entrenador(CapturaEntrada.capturarString("Ingrese su entrenador: "));
            equipos[i].setTorneos_Participacion(CapturaEntrada.capturarString("Torneo que participa usted: "));
            equipos[i].setTorneos_ganados(CapturaEntrada.capturarEntero("Torneos Ganados del Equipo: "));
            equipos[i].setTorneos_perdidos(CapturaEntrada.capturarEntero("Torneos Perdidos: "));
            equipos[i].formar_Equipo();
            //proteccion de datos de equipos
            for(byte j = 0; j < i; ++i) {
                for(int k = 0; k < 10; ++k) {
                    for(int l = 0; l < 10; ++l) {
                        do {
                            System.out.println("\nNo se puede usar un mismo jugador en otro equipo");
                            equipos[i].formar_Equipo();
                            //Matriz de equipos para buscar cada jugador en los equipos y ver si se repite un nombre completo
                        } while(equipos[i].jugadores[k].getNombre() == equipos[i].jugadores[l].getNombre());
                    }
                }
            }
        }
    }
//clasicos sets y gets
    public void setNombre_torneo(String nombre_torneo) {
        this.nombre_torneo = nombre_torneo;
    }

    public void setEquipos_participantes(int equipos_participantes) {
        this.equipos_participantes = equipos_participantes;
    }

    public void setPartidos_jugados(int partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }

    public void setPartidos_pendientes(int partidos_pendientes) {
        this.partidos_pendientes = partidos_pendientes;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getRegion() {
        return Region;
    }

    public String getNombre_torneo() {
        return nombre_torneo;
    }

    public int getEquipos_participantes() {
        return equipos_participantes;
    }

    public int getPartidos_pendientes() {
        return partidos_pendientes;
    }

    public int getPartidos_jugados() {
        return partidos_jugados;
    }
}
