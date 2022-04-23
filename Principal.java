import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Principal
{   
    public static ArrayList<Zombies> zombie = new ArrayList<Zombies>();
    public static ArrayList<Ubicaciones> ubicacion = new ArrayList<Ubicaciones>();

    public static void main (String [] args){
        MostrarMenu();

    }

    public static void MostrarMenu(){
        Scanner Sc = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("|****************************************************************************************************************************|");
        System.out.println("|**|                                                            Bienvenidos                                               |**|");
        System.out.println("|**|                                                               Menu                                                   |**|");
        System.out.println("|**|                                                             ZOMBILAND                                                |**|");
        System.out.println("|****************************************************************************************************************************|");
        System.out.println("");
        System.out.println("Digite el numero de accion que desea realizar");   
        System.out.println("[0] Finalizar programa");
        System.out.println("[1] Ingrese los datos del Zombie que desea registrar en orden(Nombre,Salud,Fecha de nacimiento, tipo de Sangre y cuadrante ");
        System.out.println("[2] Registro civil de todos los zombies ingresados");
        System.out.println("[3] Cantidad de Zombies con Registro civil");
        System.out.println("[4] Zombies con O+ o AB+ ");
        System.out.println("[5] Zombies nacidos despues del 2000");
        System.out.println("[6] Bomba Nuclear!! (Disminuye la salud de todos los Zombies a la mitad)");
        System.out.println("[7] Registro de ubicacion en orden (Nombre,distancia,cuadrante[1-6]"+"\n"+"   (Cuadrantes mayores a 6 son areas rurales) y cantidad de zombies en el perimetro)");
        System.out.println("[8] Ubicaciones registradas");
        System.out.println("[9] Ubicacion mas segura");
        System.out.println("[10] Distancia de ubicaciones");
        System.out.println("[11] Frase de ZombieEeE !!");
        System.out.println("[12] Cantidad de zombies por cuadrante");

        int i = Sc.nextInt();
        int Cont = 0;

        while(i != 0){
            switch(i){
                case 1:
                    System.out.println("Ingrese el nombre del Zombie");
                    String n = Sc.next();
                    System.out.println("Ingrese la salud del Zombie");
                    double s = Sc.nextDouble();
                    System.out.println("Ingrese la fecha de nacimiento del Zombie en formato DD/MM/AAAA ");
                    System.out.println("Dia de Nacimiento ");
                    int f1 = Sc.nextInt();
                    System.out.println("Mes de Nacimiento ");
                    int f2 = Sc.nextInt();
                    System.out.println("Año de Nacimiento ");
                    int f3 = Sc.nextInt();
                    System.out.println("Ingrese el el tipo de sangre del Zombie");
                    String ts = Sc.next().toUpperCase();
                    System.out.println("Ingrese el cuadrante del Zombie");
                    int c = Sc.nextInt();

                    Zombies Z = new Zombies(n,s,(f1+"/"+f2+"/"),f3,ts,c);
                    Principal.zombie.add(Z);

                    break;

                case 2:

                    System.out.println(Principal.zombie);

                    break;

                case 3:
                    System.out.println("  La cantidad de Zombies con Registro Civil son " + Principal.zombie.size());

                    break;

                case 4:

                    System.out.println(Zombies.tpsO(Principal.zombie));

                    break;

                case 5:

                    System.out.println(Zombies.Mayores(Principal.zombie));

                    break;

                case 6:
                    Zombies.Bombanuclear(Principal.zombie);
                    System.out.println("!!BOOOOOOOOOOOOOOOOOOOOOOOM!!");
                    break;
                case 7:
                    System.out.println("Ingrese el nombre de la ubicacion:");
                    String nb = Sc.next();
                    System.out.println("Ingrese la distancia respecto Alexandria:");
                    double dis = Sc.nextDouble();
                    System.out.println("Ingrese el cuadrante");
                    int Cua = Sc.nextInt();
                    System.out.println("Ingrese la cantidad de zombies cercanos a la ubicacion");
                    int Cant = Sc.nextInt();

                    Ubicaciones U = new Ubicaciones(nb,dis,Cua,Cant);
                    Principal.ubicacion.add(U);

                    break;

                case 8:
                    System.out.println(Principal.ubicacion);

                    break;

                case 9:

                    break;

                case 10:
                    Ubicaciones.ordenardis(Principal.ubicacion);
                    System.out.println(Principal.ubicacion);
                    break;

                case 11:
                    String[] frases = new String [5];
                    frases[0]= "¡No pienso seguir hablando hasta que no te coloques la cabeza!";
                    frases[1]="Cuando ya no quede sitio en el infierno, los muertos caminarán por la tierra";
                    frases[2]="Preguntate,¿Es mi casa un lugar seguro en caso de una invasión zombie?";
                    frases[3]="El mejor momento para un ataque zombie seria entre las 6 y 7 de la mañana. Así pasarían desapercibidos entre la gente";
                    frases[4]="Hay muchas formas de conocer a una persona. Comerte el cerebro de su novio muerto es uno de los métodos menos ortodoxos, pero…";

                    int a=(int) Math.random() * frases.length;
                    boolean[] Fa = new boolean[frases.length];
                    for(int z = 0; z < frases.length;){
                        int P = (int)(Math.random() * frases.length);
                        if(!Fa[P]){
                            Fa[P] = true;
                            System.out.println(frases[P]);
                            break;
                        }
                    }         
                    

                case 12:

                    break;
            }

            System.out.println("Digite el numero de accion que desea realizar");
            i = Sc.nextInt();
        }

        System.out.println("GRACIAS POR VISITAR ZOMBIELAND VUELVA PRONTO !");
    }

    /*public static String Fs(String[] Frases){

        return System.out.println(frases[a]);
    }*/
}
