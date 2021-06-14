import java.util.Arrays;
import java.util.Scanner; // Josue Ramon Garcia Gutierrez 1273078
public class PracticaMain{
    public static void main(String[] args){
        String nombre;
        String respuestacal;
        float cal;
        int respuestamenu;
        int cont = 0;
        float grande = 0;
        float chico = 0;
        float sum = 0;
        float prom;
        boolean respuesta;
        boolean activo = true;
        float[] vector = new float[1000];
        Scanner scan = new Scanner(System.in);
        System.out.println("menu\n");
        System.out.println("1. imprimir nombre y calificaciones\n");
        System.out.println("2. imprimir calificaciones y promedio de calificaciones\n");
        System.out.println("3. imprimir calificaciones y calificacion mas baja\n");
        System.out.println("4. imprimir calificaciones y calificacion mas alta\n");
        System.out.println("5. salir\n");
        respuestamenu = scan.nextInt();
        while (respuestamenu != 5) {
            System.out.println("captura tu nombre\n");
            scan.nextLine();
            nombre = scan.nextLine();
            while (activo) {
                System.out.println("Captura tu calificacion\n");
                cal = scan.nextFloat();
                if (sum == 0) {
                    chico = cal;
                    grande = cal;
                }
                vector[cont] = cal;
                sum += cal;
                if (cal < chico) {
                    chico = cal;
                }
                if (cal > grande) {
                    grande = cal;
                }
                System.out.println("quieres capturar otro dato?s/n\n");
                scan.nextLine();
                respuestacal = scan.next().trim();
                respuesta = respuestacal.equals("n");
                if (respuesta) {
                    activo = false;
                }
                cont++;
            }
            prom = sum / cont;
            float[] Vcal = new float[cont];
            System.arraycopy(vector, 0, Vcal, 0, Vcal.length);
            switch (respuestamenu) {
                case 1:
                    System.out.println(nombre + " tus calificaicon(es) es: " + Arrays.toString(Vcal));
                    break;
                case 2:
                    System.out.println(Arrays.toString(Vcal) + " el promedio es: " + prom);
                    break;
                case 3:
                    System.out.println(nombre + " tu calificacion mas baja es: " + chico);
                    break;
                case 4:
                    System.out.println(nombre + " tu calificacion mas alta es: " + grande);
                    break;
                case 5:
                    break;
            }
        }
    }
}