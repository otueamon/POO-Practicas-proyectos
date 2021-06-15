//Josue Ramon Garcia Gutierrez 01273078
package Paquete;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        int cantidad_alumnos = 3;
        int num_de_cal = 7;
        //se crea un arreglo de objetos alumnos con cada quien una cierta cantidad de calificaciones, en este caso todos tienen 7 calificaciones
        Alumno[] alumnos = new Alumno[cantidad_alumnos];
        alumnos[0] = new Alumno();
        alumnos[0].setNombre("Josue");
        alumnos[0].setMatricula(1273078);
        alumnos[0].setCalificaciones(num_de_cal);
        alumnos[1] = new Alumno();
        alumnos[1].setNombre("Pedro");
        alumnos[1].setMatricula(1273246);
        alumnos[1].setCalificaciones(num_de_cal);
        alumnos[2] = new Alumno();
        alumnos[2].setNombre("Andrea");
        alumnos[2].setMatricula(127231);
        alumnos[2].setCalificaciones(num_de_cal);
        //se toma la cantidad de alumnos y se imprimen sus datos
        for(int i = 0; i < cantidad_alumnos; ++i) {
            //palabracorta para imprimir datos
            PrintStream print = System.out;
            String nombre = alumnos[i].getNombre();
            print.println("\nDatos Recogidos\nPaquete.Alumno: " + nombre + "\nMatricula: " + alumnos[i].getMatricula());
            System.out.print("Calificaciones del Alumno: ");
            alumnos[i].setPromedio(Calculos.CalcularP(alumnos[i].list_cal()));
            alumnos[i].getCalificaciones();
            System.out.println("\nPromedio del alumno: " + alumnos[i].getPromedio()+"\n");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
        //excepcion si los datos de los alumnos fallan, y si no se cumple se imprime una excepcion en la consola predeterminada
        try {
            FileOutputStream fileOut = new FileOutputStream("Alumnos.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject("\t"+alumnos[0].getNombre()+"\t"+alumnos[0].getMatricula()+"\t"+alumnos[0].getPromedio()+"\n");
            objectOut.writeObject("\t"+alumnos[1].getNombre()+"\t"+alumnos[1].getMatricula()+"\t"+alumnos[1].getPromedio()+"\n");
            objectOut.writeObject("\t"+alumnos[2].getNombre()+"\t"+alumnos[2].getMatricula()+"\t"+alumnos[2].getPromedio()+"\n");
            objectOut.close();
            System.out.println("Se ah creado el archivo sin errores ");
        } catch (Exception excrp) {
            excrp.printStackTrace();
        }

    }
}
