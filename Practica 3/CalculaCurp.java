package paquete;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public class CalculaCurp {
    //calcular curp
    String nombre;
    String fecha_nacimiento;
    String primer_nombre;
    String apellido_paterno;
    String apellido_materno;
    String curp;
    char buscando;
    char consonante_N;
    char consonante_P;
    char consonante_M;
    //linea de consonantesp para selecionar despues el dato
    char[] consonantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
    int valor1;
    int valor2;


    public CalculaCurp(String nombre,String fecha_nacimiento){
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String Calculadatos(){
        String[] partes = nombre.split(" ");
        valor1 = (int)Math.random()*10;
        valor2 = (int)Math.random()*10;
        primer_nombre = partes[0];
        apellido_paterno = partes[1];
        apellido_materno = partes[2];
        //buscador de consonantes de cada parte de un nombre
        for(int i=0;i<primer_nombre.length();i++){
            buscando = primer_nombre.charAt(i);
            for (int j=0;j<consonantes.length;j++){
                if(buscando == consonantes[j]){
                    consonante_P = primer_nombre.charAt(i);
                }
            }
        }
        for(int i=0;i<apellido_paterno.length();i++){
            buscando = apellido_paterno.charAt(i);
            for (int j=0;j<consonantes.length;j++){
                if(buscando == consonantes[j]){
                    consonante_P = apellido_paterno.charAt(i);
                }
            }
        }
        for(int i=0;i<apellido_materno.length();i++){
            buscando = apellido_materno.charAt(i);
            for (int j=0;j<consonantes.length;j++){
                if(buscando == consonantes[j]){
                    consonante_P = apellido_materno.charAt(i);
                }
            }
        }
        curp = (""+primer_nombre.charAt(0)+primer_nombre.charAt(1)+apellido_paterno.charAt(0)+apellido_materno.charAt(0)+fecha_nacimiento+"M"+"BC"+
                consonante_N+consonante_P+consonante_M+valor1+valor2);
        return curp.toUpperCase();
    }
}
