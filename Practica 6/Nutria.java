package Paquete;

public class Nutria extends Animal {
    public Nutria(String nombre, int edad, boolean Vacunado) {
        super(nombre, edad, Vacunado);
    }

    public void Accion() {
        System.out.println(this.nombre + " esta comiendo Pescado.");
    }

    public String mostrar() {
        return "NUTRIA";
    }
}