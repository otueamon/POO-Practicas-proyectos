//Josue Ramon Garcia Gutierrez 1273078
package paquete;

public class Banco {
    Cuenta[] clientes;

    public Banco() {
    }

    public void setCuenta(int numCliente) {
        clientes = new Cuenta[numCliente];
        //se hace un arreglo de objetos llamdo clientes
        for(int i = 0; i < numCliente; ++i) {
            //se indica cuantos clientes se desea
            clientes[i] = new Cuenta();
            clientes[i].setPropietario(CapturaEntrada.capturarString("INGRESE NOMBRE DEL PROPIETARIO: "));

            boolean coincidencia;
            // esta parte se define si el PIN que se ingreso se repite en otra cuenta, la forma de acceder a las cuentas es por medio de pines
            do {
                coincidencia = false;
                if (i == 0) {
                    clientes[i].setPIN(CapturaEntrada.capturarEntero("INGRESE PIN: "));
                } else {
                    clientes[i].setPIN(CapturaEntrada.capturarEntero("INGRESE PIN: "));

                    for(int j = 0; j < i; ++j) {
                        if (clientes[i].getPIN() == clientes[j].getPIN()) {
                            coincidencia = true;
                            System.out.println("ELIJA OTRO PIN");
                        }
                    }
                }
            } while(coincidencia);

            clientes[i].setDinero(CapturaEntrada.capturarEntero("INGRESE SALDO: "));
        }

    }
//en esta parte se revisa mostrando los datos del usuario y la forma de entrar es con el pin
    public void revisarCuenta(int PIN) {
        for(int i = 0; i < clientes.length; ++i) {
            if (PIN == clientes[i].getPIN()) {
                System.out.println("\nUSUARIO: " + clientes[i].getPropietario());
                System.out.println("\nSALDO ACTIVO: " + clientes[i].getDinero());
            }
            else System.out.println("USUARIO NO ECONTRADO INTENTE DE NUEVO");
        }

    }
//aqui se deposita dinero modificando los valores
    public void Deposito(int pIN, int Saldo) {

        for(int i = 0; i < clientes.length; ++i) {
            if (pIN == clientes[i].getPIN()) {
                int nuevo_din = clientes[i].getDinero() + Saldo;
                clientes[i].setDinero(nuevo_din);
                System.out.println("ACCION REALIZADA CON EXITO");
            }
        }

    }
//se extra el dinero por medio de pin reduciendo su estado
    public void Extraccion(int PIN, int Saldo) {

        for (int i = 0; i < clientes.length; ++i) {
            if (PIN == clientes[i].getPIN()) {
                int nuevo_din = clientes[i].getDinero() - Saldo;
                clientes[i].setDinero(nuevo_din);
                System.out.println("ACCION REALIZADA CON EXITO");
            }
        }

    }
}
