
public class Zombie
{
    private String nombre;
    private float salud;
    private String tipoSangre;

    public Zombie(String n, float s, String ts){
        this.nombre = n;
        this.salud = s;
        this.tipoSangre = ts;
    }

    public static void baile(Zombie z1, Zombie z2){
        z1.setSalud(z1.getSalud()/2);
        z2.setSalud(z2.getSalud()/4);
    }

    public String toString(){
        return this.nombre + " - " + this.salud + " - " + this.tipoSangre;
    }

    public static void mostrarZombiesFuertes(Zombie[] zombies){
        for(int i=0; i<zombies.length; i++){
            if(zombies[i].getSalud()>20){
                System.out.println(zombies[i].toString());
            }
        }
    }

    public Zombie(){
        this("Zombie Cantarin",20,"O+");
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public void setSalud(float s){
        if(s >= 0){
            this.salud = s;
        }else{
            this.salud = 0;
        }
    }

    public void setTipoSangre(String ts){
        this.tipoSangre = ts;
    }

    public String getNombre(){
        return this.nombre;
    }

    public float getSalud(){
        return this.salud;
    }

    public String getTipoSangre(){
        return this.tipoSangre;
    }
}