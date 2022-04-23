import java.util.ArrayList;
public class Ubicaciones
{
    private String nombre;
    private double distancia;
    private int cuadrante;
    private int cantidadZ;

    public Ubicaciones(String n, double d,int c ,int cz){
        this.nombre = n;
        this.distancia = d;
        this.cuadrante = c;
        this.cantidadZ = cz;
    }

    public String toString(){
        return "Nombre: "+ this.nombre + "\n" + "Distancia: "+ this.distancia + "\n" + "Cantidad de Zombies: " + this.cantidadZ + "\n" + "\n";
    }

    public static void ordenardis(ArrayList<Ubicaciones> ubicacion) {     

        double menor;

        for(int i = 0; i < ubicacion.size; i++){
            menor = ubicacion.get(0).getDistancia();

            if (ubicacion.get(0).getDistancia() < menor){
                menor = ubicacion.get(i).getDistancia();
            }
            else{
                if (ubicacion.get(i).getDistancia() > menor){
                    menor = menor;
                }      
            }
        }
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public void setDistancia(double d){
        this.distancia = d;

    }

    public void setCantidadZ(int cz){
        this.cantidadZ = cz;

    }

    public String getNombre(){
        return this.nombre;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public int getCantidadZ(){
        return this.cantidadZ;
    }

    public int getCuadrante(){
        return this.cantidadZ;
    }

    /*public static int CantidadC(ArrayList<Ubicaciones> ubicacion){
        for(int i=0 ; i< ubicacion.size(); i++){
            if(ubicacion.get(i).getCuadrante() > ){

            }
        }
    }*/
}
