//Josue Ramon Garcia Gutierrez 1273078
package paquete;

public class Main {
    public static void main(String[] args) {
        //Se hace un objeto de nombre usuarios de la clase Banco
        Banco usuarios = new Banco();
        int numClientes = 0;
        int Saldo;
        int PIN;
        int Respuesta1;
        //Variables para poder modificar valores en los objetos
        do {
            Menu.menu();
            Respuesta1 = CapturaEntrada.capturarEntero("\nINGRESE OPCION: ");
            switch(Respuesta1) {
                case 1:
                    numClientes = CapturaEntrada.capturarEntero("INGRESA CUANTAS CUENTAS QUIERES AGREGAR: ");
                    usuarios.setCuenta(numClientes);
                    break;
                case 2:
                    int Respuesta2;
                    if (numClientes == 0) {
                        System.out.println("INGRESE PRIMERO LAS CUENTAS");
                    } else {
                        do {
                            Menu.menu_operaciones();
                            Respuesta2 = CapturaEntrada.capturarEntero("\nINGRESE OPCION");
                            switch(Respuesta2) {
                                case 1:
                                    PIN = CapturaEntrada.capturarEntero("INGRESE PIN: ");
                                    Saldo = CapturaEntrada.capturarEntero("INGRESE DINERO A DEPOSITAR");
                                    usuarios.Deposito(PIN, Saldo);
                                    break;
                                case 2:
                                    PIN = CapturaEntrada.capturarEntero("INGRESE PIN: ");
                                    Saldo = CapturaEntrada.capturarEntero("INGRESE DINERO A RETIRAR");
                                    usuarios.Extraccion(PIN, Saldo);
                                    break;
                                case 3:
                                    PIN = CapturaEntrada.capturarEntero("INGRESE PIN: ");
                                    usuarios.revisarCuenta(PIN);
                            }
                        } while(Respuesta2 != 4);
                    }
            }
        } while(Respuesta1 != 4);

    }
}
