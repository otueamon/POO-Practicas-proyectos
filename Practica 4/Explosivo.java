package paquete;

public class Explosivo extends Pajaros {
    //igual que el otro el pajaro explosivo extiende a pajaro con difernetes habiliadades
    float dano_explosivo = 10;
    public Explosivo(String nombre,float peso, float tiempo_de_habilidad,float velocidad,float dano){
        super(nombre,peso,tiempo_de_habilidad,velocidad,dano);
    }

    public float Explota() {
        System.out.println("el pajaro"+ nombre+ "a explotado!");
        dano = dano+dano_explosivo;
        return dano;
    }
    public void temporizador(){
        peso = 15; //hace mas lento y pesado cuando esta usando su habilidad
        velocidad = 2;
        System.out.println("tik tok expotara en:"+tiempo_de_habilidad+ " segundos");
    }
}
