import java.util.ArrayList;
public class Zombies
{
    private  String nombre;
    private double salud;
    private  String fechaDM;
    private  int fechaN;
    private  String tipodeS;
    private  int cuadrante;

    public Zombies(String n, double s, String fdm,int f,String ts, int c){
        this.nombre = n;
        this.salud = s;
        this.fechaDM = fdm;
        this.fechaN = f;
        this.tipodeS = ts;
        this.cuadrante = c;
    }

    public static void Bombanuclear(ArrayList<Zombies> zombie){

        for(int i = 0; i < zombie.size(); i++){
            zombie.get(i).setSalud(zombie.get(i).getSalud()/2);
        }
    }

    public static String toString(Zombies z){
        return ("Nombre: " + z.nombre + "\n" + "Salud: " + z.salud + "\n" + "Fecha de Nacimiento: " + z.fechaN+ "\n" + "Tipo de Sangre: "+z.tipodeS + "\n"+"cuadrante: "+ z.cuadrante+ "\n"+"\n");
    }

    public String toString(){
        return ("Nombre: " + this.nombre + "\n" + "Salud: " + this.salud + "\n" + "Fecha de Nacimiento: " +this.fechaDM + this.fechaN+ "\n" + "Tipo de Sangre: "+this.tipodeS + "\n"+"cuadrante: "+ this.cuadrante+ "\n"+"\n");
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public void setSalud(double s){
        this.salud = s;

    }

    public void setFechaN(int f){
        this.fechaN = f;
    }

    public void setTipodeS(String ts){
        this.tipodeS = ts;
    }

    public void setCuadrante(int c){
        this.cuadrante = c;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getSalud(){
        return this.salud;
    }

    public int getFecha(){
        return this.fechaN;
    }

    public String getTipodeS(){
        return this.tipodeS;
    }

    public int getCuadrante(){
        return this.cuadrante;
    }

    public static String tpsO(ArrayList<Zombies> zombie){
        String datos = "";

        for(int i=0 ; i<zombie.size(); i++){
            if((zombie.get(i).getTipodeS().equals("O+"))||(zombie.get(i).getTipodeS().equals("AB+"))){

                datos += toString(zombie.get(i));

            }

        }
        return datos;
    }

    public static String Mayores(ArrayList<Zombies> zombie){
        String fecha = "";
        for(int i=0; i<zombie.size(); i++){
            if(zombie.get(i).getFecha()>2000){
                fecha += toString(zombie.get(i));
            }
        }
        return fecha;
    }

    public static void Bombanuclear(){
    }
}