package Paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;
//en la clase alumno es para implementar la calificacion de cada uno junto sy matrucula y promedio
public class Alumno implements Serializable {
    String nombre;
    Calificaciones[] cal;
    int promedio;
    int matricula;
    int[] calificacionesCsv = new int[21];

    public Alumno() {
        this.calificacionesCsv[0] = 67;
        String nombre_archivo = "practica9.csv";
        File ubicacion_archivo = new File(nombre_archivo);

        try {
            Scanner scan = new Scanner(ubicacion_archivo);

            while(scan.hasNext()) {
                String data = scan.next();
                String[] values = data.split(",");

                for(int i = 1; i < values.length; ++i) {
                    this.calificacionesCsv[i] = Integer.parseInt(values[i]);
                }
            }

            scan.close();
        } catch (FileNotFoundException var7) {
            var7.printStackTrace();
        }

    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setMatricula(int mat) {
        this.matricula = mat;
    }

    public void setPromedio(int prom) {
        this.promedio = prom;
    }

    public void getCalificaciones() {
        System.out.println(Arrays.toString(list_cal()));
    }
    //se toma valores al azar de la lista de califiaciones y se agreaga en la lista de calificaciones
    public void setCalificaciones(int nummat) {
        cal = new Calificaciones[nummat];

        for(int i = 0; i < nummat; ++i) {
            cal[i] = new Calificaciones();
            cal[i].setCalificacion(this.calificacionesCsv[(int)(Math.random() * 21.0D)]);
        }

    }
    //se  hace una copia de las calificaciones a un arreglo de enteros para guardar todos sus valores
    public int[] list_cal() {
        int[] lista_cal = new int[cal.length];

        for(int i = 0; i < cal.length; ++i) {
            lista_cal[i] = cal[i].calificacion;
        }

        return lista_cal;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public int getPromedio() {
        return this.promedio;
    }
}
