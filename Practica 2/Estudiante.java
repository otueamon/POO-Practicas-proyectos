//Josue Ramon Garcia Gutiereez 1273078
package paquete;
import java.util.Scanner;
public class Estudiante {
    public static void main(String[] args) {
        int respuesta;
        String yesno;
        Menu men = new Menu();
        Scanner scan = new Scanner(System.in);
        Datos[] arraydatos = new Datos[10];
        // se crean 5 estudiantes con sus respectivos datos
        arraydatos[0] = new Datos("Josue","quimica",1278990,01,78);
        arraydatos[1] = new Datos("Pedro","Fisica",4239421,02,56);
        arraydatos[2] = new Datos("Angela","algebra",945645,03,87);
        arraydatos[3] = new Datos("Luis","calculo",1233124,04,23);
        arraydatos[4] = new Datos("Juan","poo",1274950,05,80);
        System.out.println("Quieres Capturar nuevos Alumnos? s/n");
        yesno = scan.nextLine().trim();
        //se crean 5 estudiantes extras con informacion manual
        if (yesno.equals("s")) {
            for (int i = 5; i < arraydatos.length; i++) {
                arraydatos[i] = new Datos("null", "null", 0, 0, 0);
                arraydatos[i].setNombre();
                arraydatos[i].setMateria();
                arraydatos[i].setMatricula();
                arraydatos[i].setId();
                arraydatos[i].setCalificacion();
            }
        }
        //opciones get and set para poder modificar los valores
        respuesta = men.mostrarMenu();
        switch (respuesta)
        {
            case 1:
                for (int i=0;i<arraydatos.length;i++){
                    System.out.println(arraydatos[i].getNombre());
                }
                break;
            case 2:
                for (int i=0;i<arraydatos.length;i++){
                    System.out.println(arraydatos[i].getMateria());
                }
                break;
            case 3:
                for (int i=0;i<arraydatos.length;i++){
                    System.out.println(arraydatos[i].getMatricula());
                }
                break;
            case 4:
                for (int i=0;i<arraydatos.length;i++){
                    System.out.println(arraydatos[i].getId());
                }
                break;
            case 5:
                for (int i=0;i<arraydatos.length;i++){
                    System.out.println(arraydatos[i].getCalificacion());
                }
                break;
            case 6:
                for (int i=0;i<arraydatos.length;i++){
                    System.out.println(arraydatos[i].getEstado());
                }
                break;
        }
    }
}