//Josue Ramon Garcia Gutierrez 1273078
package paquete;
import java.util.ArrayList;
public class angry {
    //ejemplo sencillo de como funnciona las subclases en un arreglo llamado pajaro
    //y los datos que se enseñan solo es una prueba de como cambian los datos
    public static void main(String[] args) {
    Rapido rapido1 = new Rapido( "chuck",5,10,40,20);
    Rapido rapido2 = new Rapido( "rayo",5,1,100,5);
    Rapido rapido3 = new Rapido( "sombra",5,100,80,40);
    Explosivo explosivo1 = new Explosivo("Bomb",10,30,12,100);
    Explosivo explosivo2 = new Explosivo("uranio",3,40,40,30);
    Explosivo explosivo3 = new Explosivo("nova",100,400,2,500);
    inflar Inflar1 = new inflar("Bubbles",1,25,15,30);
    inflar Inflar2 = new inflar("esponja",2,40,20,50);
    inflar Inflar3 = new inflar("Globo",5,100,3,80);
    Rapido[] rapidos = {rapido1,rapido2,rapido3};
    Explosivo[] explosivos = {explosivo1,explosivo2,explosivo3};
    inflar[] Inflados = {Inflar1,Inflar2,Inflar3};
    //pruebas rapidos
    rapidos[0].nombrar();
    rapidos[1].pluma_brillante();
    rapidos[2].acelera();
    //explosivos
    explosivos[0].temporizador();
    explosivos[1].Explota();
    explosivos[2].nombrar();
    //inflados
    Inflados[0].incharse();
    Inflados[1].enojado();
    Inflados[2].nombrar();
    }
}
