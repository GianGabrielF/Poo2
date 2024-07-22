package engtelecom.poo;

public class Personagem {

    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String atacar(){
        return "deu " + this.ataque + " de dano";
    }

    public String movimentar(){
        return "se moveu " + this.velocidade + "metros";
    }
    
    
}
