package Paquete;

public class Calculos {

    public static int CalcularP(int[] calificacion) {
        int suma = 0;
        for(int i = 0; i < calificacion.length; ++i) {
            suma += calificacion[i];
        }
        int prom = (suma / calificacion.length);
        return prom;
    }
}
