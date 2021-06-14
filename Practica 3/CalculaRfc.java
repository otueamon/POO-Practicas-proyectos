package paquete;
public class CalculaRfc {
    //calculadora de RFC
    String nombre;
    String fecha_nacimiento;
    String primer_nombre;
    String apellido_paterno;
    String apellido_materno;
    String rfc;
    //abc para que se pueda elejir una letra al azar
    char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int valor1;
    char valor2;
    int valor3;


    public CalculaRfc(String nombre,String fecha_nacimiento){
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String Calculadatos(){
        String[] partes = nombre.split(" ");
        //genera numeros al azar
        valor1 = (int)Math.random()*10;
        valor3 = (int)Math.random()*10;
        //se toma el valor 3 para tomar una letra del abecedario
        valor2 = abc[valor3];
        primer_nombre = partes[0];
        apellido_paterno = partes[1];
        apellido_materno = partes[2];
        rfc = (""+apellido_paterno.charAt(0)+apellido_paterno.charAt(1)+apellido_materno.charAt(0)+fecha_nacimiento+valor1+valor2+valor3);
        return rfc.toUpperCase();
    }
}
