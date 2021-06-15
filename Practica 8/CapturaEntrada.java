//Josue Ramon Garcia Gutierrez 1273078
package Paquete;

import java.util.Scanner;

public class CapturaEntrada {
//capturadores de datos
    public static String capturarString(String msg) {
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int capturarEntero(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        return scan.nextInt();
    }
    public static Float capturarFloat(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        return scan.nextFloat();
    }
}
