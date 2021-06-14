//Josue Ramon Garcia Gutierrez 1273078
package paquete;
import java.util.Scanner;
public class GeneradorFiscal {
    public static void main(String[] args) {
        int respuestaMenu;
        //menu de generador fiscal
        Scanner scan = new Scanner(System.in);
        Menu men = new Menu();
        System.out.println("Bienvenido al capturador de datos");
        Persona[] datos = new Persona[3];
        Persona per = new Persona("null","null","null","null");
        per.setNombre();
        per.setFecha_nacimiento();
        for (int j=0;j<3;j++){
            datos[j] = new Persona(per.getNombre(), per.getFecha_nacimiento(),"null","null");
            switch(j){
                case 0:
                    datos[j].setCurp();
                    break;
                case 1:
                    datos[j].setRFC();
                    break;
                case 2:
                    datos[j].setCurp();
                    datos[j].setRFC();
                    break;
            }
        }
        //mostrar respectivo menu
        respuestaMenu = men.mostrarMenu();
        switch(respuestaMenu){
            case 1:
                System.out.println(per.getNombre());
                break;
            case 2:
                System.out.println(per.getFecha_nacimiento());
                break;
            case 3:
                System.out.println(datos[1].getRFC());
                break;
            case 4:
                System.out.println(datos[0].getCurp());
                break;
            case 5:
                System.out.println(datos[2].getRFC());
                System.out.println(datos[2].getCurp());
                break;
        }
    }
}
