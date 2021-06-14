//Josue Ramon Garcia Gutierrez 1273078
package Paquete;
//Valores del veterinario para poder modificar
public class Veterinarian {
    String nombre;
    double sueldo;

    public Veterinarian(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void Vacunado(Animal animal) {
        animal.setVacunado();
        System.out.println("\nEL ANIMAL YA FUE VACUNADO");
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getsueldo() {
        return this.sueldo;
    }

    public void setsueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
