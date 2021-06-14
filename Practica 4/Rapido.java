package paquete;
//la clase rapido extiende a pajaro, por lo tanto puede usar datos de Pajaro y de su propias subclases
public class Rapido extends Pajaros {
    float aceleracion = 2;
    float lijero = 2;
    public Rapido(String nombre,float peso, float tiempo_de_habilidad,float velocidad,float dano){
        super(nombre,peso,tiempo_de_habilidad,velocidad,dano);
    }

    public float acelera() {
        System.out.println("el pajaro " + nombre + " a acelerado!");
        velocidad = velocidad*aceleracion;
        return velocidad;
    }
    public float pluma_brillante(){
        peso = peso-lijero;
        System.out.println("el pajaro ahora pesa.. "+ peso+" y ahora dura "+tiempo_de_habilidad+"segundos");
        return  peso;
    }
}
