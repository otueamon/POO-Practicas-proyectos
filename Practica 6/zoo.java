//Josue Ramon Garcia Gutierrez
package Paquete;
//libreria arraylist para manejar objetos diferentes con una herencia
import java.util.ArrayList;
//libreria scanner para poder capturar datos
import java.util.Scanner;

public class zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList();
        Scanner scan = new Scanner(System.in);
        //se crae el objeto veterinario ya que solo se tendra un veterianario para todo el zoologico
        Veterinarian veterinario = new Veterinarian((String)null, 0.0D);
        //se declara la variable para la respuesta con numeros
        int Respuesta;
        //se despliega el menu
        do {
            System.out.println("Bienvenido al zoologico!\n");
            System.out.println("1) Veterinario");
            System.out.println("2) Animales");
            System.out.println("3) Salir");
            System.out.println("Seleccione Opcion:   ");
            Respuesta = scan.nextInt();
            int indice;
            switch(Respuesta) {
                case 1:
                    System.out.println("Menu Veterinario \n");
                    System.out.println("1) Contratar");
                    System.out.println("2) Mostrar empleado");
                    System.out.println("3) Modificar sueldo");
                    System.out.println("4) Despedir");
                    System.out.println("5) Vacunar animal");
                    System.out.println("6) Alimentar animal");
                    System.out.println("7) Dormir animal");
                    System.out.println("Seleccione Opcion:   ");
                    int Respuesta_Veterinario = scan.nextInt();
                    double sueldo;
                    switch(Respuesta_Veterinario) {
                        case 1:
                            System.out.println("Contratacion del veterinario\n");
                            System.out.println("INGRESE NOMBRE: ");
                            scan.nextLine();
                            String nombre_v = scan.nextLine();
                            System.out.println("INGRESE sueldo: ");
                            sueldo = scan.nextDouble();
                            veterinario = new Veterinarian(nombre_v, sueldo);
                            continue;
                        case 2:
                            System.out.println("Mostrar Veterinario\n");
                            System.out.println("NOMBRE: " + veterinario.getNombre());
                            System.out.println("sueldo: " + veterinario.getsueldo());
                            continue;
                        case 3:
                            System.out.println("Modificador Del sueldo del veterinario\n");
                            System.out.println("INGRESE NUEVO sueldo: ");
                            sueldo = scan.nextDouble();
                            veterinario.setsueldo(sueldo);
                            System.out.println("sueldo MODIFICADO");
                            continue;
                        case 4:
                            System.out.println("Despedir al veterinario\n");
                            veterinario = new Veterinarian((String)null, 0.0D);
                            System.out.println("VETERINARIO DESPEDIDO");
                            continue;
                        case 5:
                            System.out.println("Vacunar Animal x indice\n");
                            System.out.println("Ingrese indice para vacunar: ");
                            indice = scan.nextInt() - 1;
                            veterinario.Vacunado((Animal)animal.get(indice));
                            continue;
                        case 6:
                            System.out.println("Alimentar Animal x indice\n");
                            System.out.println("Ingrese indice para alimentar: ");
                            indice = scan.nextInt() - 1;
                            ((Animal)animal.get(indice)).eat();
                        case 7:
                            System.out.println("Dormir Animal x indice\n");
                            System.out.println("Ingrese indice para dormir: ");
                            indice = scan.nextInt() - 1;
                            ((Animal)animal.get(indice)).dormir();
                        default:
                            continue;
                    }
                    //menu de la lista de animales
                case 2:
                    System.out.println("Lista de Animales\n");
                    System.out.println("1) Hiena");
                    System.out.println("2) Elefante");
                    System.out.println("3) Oso Polar");
                    System.out.println("4) Nutria");
                    System.out.println("5) Liberar por indice");
                    System.out.println("6) Mostrar por indice");
                    System.out.println("Seleccione Opcion:   ");
                    int opcion_animal = scan.nextInt();
                    int edad;
                    boolean Vacunado;
                    String nombre;
                    //Escojer animal
                    switch(opcion_animal) {
                        case 1:
                            System.out.println("Hiena\n");
                            System.out.println("Ingrese nombre: ");
                            scan.nextLine();
                            nombre = scan.nextLine();
                            System.out.println("Ingrese edad: ");
                            edad = scan.nextInt();
                            Vacunado = false;
                            animal.add(new Hiena(nombre, edad, Vacunado));
                            new Hiena(nombre,0,false).Accion();
                            break;
                        case 2:
                            System.out.println("Elefante\n");
                            System.out.println("Ingrese nombre: ");
                            scan.nextLine();
                            nombre = scan.nextLine();
                            System.out.println("Ingrese edad: ");
                            edad = scan.nextInt();
                            Vacunado = false;
                            animal.add(new Elefante(nombre, edad, Vacunado));
                            new Elefante(nombre,0,false).Accion();
                            break;
                        case 3:
                            System.out.println("Oso Polar\n");
                            System.out.println("Ingrese nombre: ");
                            scan.nextLine();
                            nombre = scan.nextLine();
                            System.out.println("\nIngrese edad: ");
                            edad = scan.nextInt();
                            Vacunado = false;
                            animal.add(new OsoPolar(nombre, edad, Vacunado));
                            new OsoPolar(nombre,0,false).Accion();
                            break;
                        case 4:
                            System.out.println("Nutria\n");
                            System.out.println("Ingrese nombre: ");
                            scan.nextLine();
                            nombre = scan.nextLine();
                            System.out.println("Ingrese edad: ");
                            edad = scan.nextInt();
                            Vacunado = false;
                            animal.add(new Nutria(nombre, edad, Vacunado));
                            new Nutria(nombre,0,false).Accion();
                            break;
                        case 5:
                            System.out.println("Liberar animal (Sacar del registro)");
                            System.out.println("Ingrese indice para liberar animal: ");
                            indice = scan.nextInt() - 1;
                            animal.remove(indice);
                            System.out.println("El Animal Esta Libre");
                            break;
                        case 6:
                            System.out.println("Mostrar Animal\n");
                            System.out.println("Ingrese indice para mostrar animal: ");
                            indice = scan.nextInt() - 1;
                            System.out.println("NOMBRE: " + ((Animal)animal.get(indice)).getNombre());
                            System.out.println("EDAD: " + ((Animal)animal.get(indice)).getEdad());
                            System.out.println("ESPECIE: " + ((Animal)animal.get(indice)).mostrar());
                            if (((Animal)animal.get(indice)).Vacunado) {
                                System.out.println(" Esta vacunado.");
                            } else {
                                System.out.println(" No esta vacunado.");
                            }
                    }
            }
        } while(Respuesta != 3);

    }
}