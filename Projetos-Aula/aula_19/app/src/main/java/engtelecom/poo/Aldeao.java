package engtelecom.poo;

public class Aldeao extends Personagem implements Guerreiro,Coletador{
    public Aldeao(int v, int a, double vel) {
        super(v, a, vel);
        //TODO Auto-generated constructor stub
    }


    @Override
    public String atacar(){
        return "Aldeao ataca";

    }

    @Override
    public String coletarOuro(){
        return "Aldeao coleta";

    }


    @Override
    public String coletarMadeira(){
        return "Aldeao coleta";

    }

    @Override
    public String mover(){
        return "Aldeao se move";

    } 
    
    
}
