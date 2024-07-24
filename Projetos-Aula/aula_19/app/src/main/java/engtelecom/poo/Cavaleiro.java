package engtelecom.poo;

public class Cavaleiro extends Personagem implements Guerreiro{


    public Cavaleiro(int v, int a, double vel) {
        super(v, a, vel);
        //TODO Auto-generated constructor stub
    }


    public String atacar(){
        return "Cavaleiro ataca";

    }


    public String mover(){
        return "Cavaleiro se move";

    }
    
}
