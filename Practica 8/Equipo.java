//Josue Ramon Garcia Gutierrez 1273078
package Paquete;

public class Equipo {
    String Equipo;
    String Division;
    String Entrenador;
    String Torneos_Participacion;
    int Ganados;
    int perdidos;
    int sumadepuntos = 0;
    Jugador[] jugadores = new Jugador[10];

    public void formar_Equipo() {
        sumadepuntos = 0;
        //se crean 10 objetos de jugadores diferentes y normalmente minimo se ocupan 12 incluyendo en la banca
        for(int i = 0; i < 10; ++i) {
            System.out.println("Bienvenid Jugador "+(i+1));
            jugadores[i] = new Jugador();
            jugadores[i].setNombre(CapturaEntrada.capturarString("\nSu nombre porfavor: "));
            jugadores[i].setNumero_uniforme(CapturaEntrada.capturarEntero("Numero de uniforme: "));
            jugadores[i].setPuntos_anotados(CapturaEntrada.capturarEntero("Puntos anotados(Habilidad): "));
            jugadores[i].setPosicion(CapturaEntrada.capturarString("Poscion de Juego: "));
            jugadores[i].setEstatura(CapturaEntrada.capturarFloat("Ingrese estatura en M: "));

            for(int j = 0; j < i; ++j) {
                //proteccion de datos si se repite un mismo numero de camiseta del jugador

                do {
                    System.out.println("\nERROR! SE REPITIO UN MISMO JUGADOR");
                    jugadores[i].setNombre(CapturaEntrada.capturarString("\nSu nombre porfavor: "));
                    jugadores[i].setNumero_uniforme(CapturaEntrada.capturarEntero("Numero de uniforme: "));
                    jugadores[i].setPuntos_anotados(CapturaEntrada.capturarEntero("Puntos anotados(Habilidad): "));
                    jugadores[i].setPosicion(CapturaEntrada.capturarString("Poscion de Juego: "));
                    jugadores[i].setEstatura(CapturaEntrada.capturarFloat("Ingrese estatura en M: "));
                } while(jugadores[i].numero_uniforme == jugadores[j].numero_uniforme);
            }
            //puntos de habilidad del Equipo
            sumadepuntos += jugadores[i].getPuntos_anotados();
            System.out.println("Puntaje del Equipo: " + sumadepuntos);
        }

    }
//sets y gets para esta practica
    public void setNombre_equipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public void setDivision(String division) {
        this.Division = division;
    }

    public void setNombre_Entrenador(String Entrenador) {
        this.Entrenador = Entrenador;
    }

    public void setTorneos_Participacion(String torneos_Participacion) {
        this.Torneos_Participacion = torneos_Participacion;
    }

    public void setTorneos_ganados(int Ganados) {
        this.Ganados = Ganados;
    }
    public void setTorneos_perdidos(int perdidos) {
        this.perdidos = perdidos;
    }
}
