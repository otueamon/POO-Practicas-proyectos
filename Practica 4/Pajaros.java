package paquete;
//la calse pajaro toma los datos generales de los animales
public class Pajaros {
    String nombre;
    float peso;
    float tiempo_de_habilidad;
    float velocidad;
    float dano;

    public Pajaros(String nombre, float peso, float tiempo_de_habilidad, float velocidad,float dano){
        this.dano = dano;
        this.peso = peso;
        this.velocidad = velocidad;
        this.tiempo_de_habilidad = tiempo_de_habilidad;
        this.nombre = nombre;
    }
    public void nombrar(){
        System.out.println("Hola me llamo "+nombre+"!");
    }
    public  void enojado(){
        System.out.println("AHH! odio esos puerocs!! (el daño se ah multiplicado!)");
        dano = dano*2;
    }
/////////////para poder editar y cambiar datos
    public void setDano(float dano) {
        this.dano = dano;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setTiempo_de_habilidad(float tiempo_de_habilidad) {
        this.tiempo_de_habilidad = tiempo_de_habilidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getDano() {
        return dano;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public float getTiempo_de_habilidad() {
        return tiempo_de_habilidad;
    }

    public float getVelocidad() {
        return velocidad;
    }
}
