package paquete;
import java.util.Scanner;
public class Datos {
    //movimiento de datos
    String nombre, materia;
    int matricula, id;
    float calificacion;
    boolean estado = false;

    public Datos(String nombre, String materia, int matricula, int id, float calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.matricula = matricula;
        this.id = id;
        this.calificacion = calificacion;
        calculaDatos aprobatorio = new calculaDatos();
        estado = aprobatorio.aprovar(this.calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getId() {
        return id;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setNombre() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa nombre");
        nombre = scan.nextLine();
    }

    public void setMateria() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa materia");
        materia = scan.nextLine();
    }

    public void setMatricula() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa matricula");
        matricula = scan.nextInt();
        scan.nextLine();
    }

    public void setId() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa id");
        id = scan.nextInt();
        scan.nextLine();
    }

    public void setCalificacion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa calificacion");
        calificacion = scan.nextFloat();
        scan.nextLine();
        calculaDatos aprobatorio = new calculaDatos();
        estado = aprobatorio.aprovar(this.calificacion);
    }
}
