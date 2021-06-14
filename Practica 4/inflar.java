package paquete;

public class inflar extends Pajaros{
    //el pajaro inflar extiende a pajaro con sus diferentes habilidades
    float cambio_de_tamano=10;
    float tension= 20;
    public inflar(String nombre,float peso, float tiempo_de_habilidad,float velocidad,float dano){
        super(nombre,peso,tiempo_de_habilidad,velocidad,dano);
    }
    public void incharse(){
        System.out.println("el pajaro "+ nombre+" Se ah inchado!");
        System.out.println("su habilidad durara: "+tiempo_de_habilidad+ " segundos");
        dano = dano+tension;
        peso = cambio_de_tamano+peso;
        velocidad = velocidad-cambio_de_tamano;
    }
}
