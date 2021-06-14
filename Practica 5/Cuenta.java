package paquete;
//todos los datos de la cuenta son privados y solo funcionan dentro de la clase y no puede ser usado por otra clase solo modificarse dentro de Cuenta
public class Cuenta {
    private String propietario;
    private int PIN;
    private int Saldo;

    public Cuenta() {
    }
    public String getPropietario() {
        return this.propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public int getPIN() {
        return this.PIN;
    }
    public void setPIN(int pIN) {
        this.PIN = pIN;
    }

    public int getDinero() {
        return this.Saldo;
    }
    public void setDinero(int dinero) {
        this.Saldo = dinero;
    }
}