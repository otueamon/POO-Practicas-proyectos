package paquete;
import java.util.Scanner;
public class Menu {
    //demostrando el menu
    public int respuesta;
    public int mostrarMenu()
    {
        System.out.println("Elije la opcion que deseas\n");
        System.out.println("1. ver Nombre");
        System.out.println("2. ver Materia");
        System.out.println("3. ver matricula");
        System.out.println("4. ver id");
        System.out.println("5. Ver calificacion");
        System.out.println("6. ver si aprovo o reprobo (false\\true)\n");
        Scanner scan = new Scanner(System.in);
        respuesta = scan.nextInt();
        scan.nextLine();
        return respuesta;

    }
}