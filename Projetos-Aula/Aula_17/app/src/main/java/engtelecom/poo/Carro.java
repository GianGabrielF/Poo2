package engtelecom.poo;

/**
 * Representa um carro em um jogo de corrida
 */
public class Carro {

    /**
     * velocidade atual do Carro
     */
    private int velAtual;


    /**
     * Incrementa a velocidade do carro de acordo com o parametro
     * @param i
     * @return
     */
    public int acelerar(int i){        
        if(i>=0){
            this.velAtual+=i;
        }
        return this.velAtual;
    }

    /**
     * decrementa a velocidade do carro de acordo com o parametro
     * @param i
     * @return
     */
    public int frear(int i){
        if(i>=0 && i<=this.velAtual){
            this.velAtual-=i;
        }
        return this.velAtual;
    }

    public int getVelAtual() {
        return velAtual;
    }
    
}
