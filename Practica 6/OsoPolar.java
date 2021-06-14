package Paquete;

public class OsoPolar extends Animal {
    public OsoPolar(String name, int nombre, boolean Vacunado) {
        super(name, nombre, Vacunado);
    }

    public void Accion() {
        System.out.println(this.nombre + " esta comiendo Jugando en la nieve.");
    }

    public String mostrar() {
        return "OSO POLAR";
    }
}
