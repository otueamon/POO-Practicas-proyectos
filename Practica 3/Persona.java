package paquete;
import java.util.Scanner;
public class Persona {
    //la clase persona para poder registrar los datos de cada uno
    String nombre;
    String fecha_nacimiento;
    String RFC;
    String curp;

    public Persona(String nombre, String fecha_nacimiento,String curp, String RFC){
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.curp = curp;
        this.RFC = RFC;
    }
    public void setNombre() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa nombre completo con espacios");
        nombre = scan.nextLine();
    }

    public void setFecha_nacimiento() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa Fechadenacimiento (año/mes/dia)");
        fecha_nacimiento = scan.nextLine();
    }

    public void setCurp() {
        CalculaCurp calculaCurp = new CalculaCurp(nombre,fecha_nacimiento);
        curp = calculaCurp.Calculadatos();
    }

    public void setRFC() {
        CalculaRfc calculaRfc = new CalculaRfc(nombre,fecha_nacimiento);
        RFC = calculaRfc.Calculadatos();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurp() {
        return curp;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getRFC() {
        return RFC;
    }
}
