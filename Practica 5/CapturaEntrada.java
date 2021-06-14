package paquete;

import java.util.Scanner;
//de la libreria Scanner aqui se hacen todos los movimientos usandp capturadores
public class CapturaEntrada {
    public CapturaEntrada() {
    }

    public static String capturarString(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextLine();
    }

    public static int capturarEntero(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();
    }
}
