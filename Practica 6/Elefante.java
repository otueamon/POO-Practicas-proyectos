package Paquete;

public class Elefante extends Animal {
    public Elefante(String nombre, int edad, boolean Vacunado) {
        super(nombre, edad, Vacunado);
    }

    public void Accion() {
        System.out.println(this.nombre + " esta Bariitando.");
    }

    public String mostrar() {
        return "ELEFANTE";
    }
}

