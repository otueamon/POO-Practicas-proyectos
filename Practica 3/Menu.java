package paquete;
import java.util.Scanner;
public class Menu {
    public int respuesta;
    public int mostrarMenu()
    {
        //mosrar menu para poder selecionar los siguientes datos
        System.out.println("Elije la opcion que deseas\n");
        System.out.println("1. ver nombre");
        System.out.println("2. ver Fecha de nacimiento");
        System.out.println("3. ver RFC");
        System.out.println("4. ver Curp");
        System.out.println("5 ver Curp y RFC");
        Scanner scan = new Scanner(System.in);
        respuesta = scan.nextInt();
        scan.nextLine();
        return respuesta;

    }
}