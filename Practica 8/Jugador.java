//Josue Ramon Garcia Gutierrez 1273078
package Paquete;

public class Jugador {
    String Nombre,Posicion;
    int numero_uniforme;
    int puntos_anotados;
    Float estatura;
//sets y gets
    public void setNumero_uniforme(int numero_uniforme) {
        this.numero_uniforme = numero_uniforme;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setPuntos_anotados(int puntos_anotados) {
        this.puntos_anotados = puntos_anotados;
    }

    public void setPosicion(String posicion) {
        this.Posicion = posicion;
    }

    public void setEstatura(Float estatura) {
        this.estatura = estatura;
    }

    public int getNumero_uniforme() {
        return numero_uniforme;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public int getPuntos_anotados() {
        return this.puntos_anotados;
    }
}
