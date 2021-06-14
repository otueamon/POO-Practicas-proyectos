package Paquete;

public class Hiena extends Animal {
    public Hiena(String nombre, int edad, boolean Vacunado) {
        super(nombre, edad, Vacunado);
    }

    public void Accion() {
        System.out.println(this.nombre + " esta riendo sin Parar");
    }

    public String mostrar() {
        return "HIENA";
    }
}
