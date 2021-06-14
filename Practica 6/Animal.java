package Paquete;
//Clase padre de los animales, cada animal tendra estos valores y metodos
//cada animal tendra su respectiva accion
public class Animal {
    String nombre;
    int edad;
    boolean Vacunado;

    public Animal(String nombre, int edad, boolean Vacunado) {
        this.nombre = nombre;
        this.edad = edad;
        this.Vacunado = Vacunado;
    }

    public void eat() {
        System.out.println(this.nombre + " esta comiendo.");
    }

    public void dormir() {
        System.out.println(this.nombre + "esta durmiendo.");
    }

    public String mostrar() {
        return "Animal";
    }

    public void setVacunado() {
        this.Vacunado = true;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public boolean isVacunado() {
        return this.Vacunado;
    }
}
