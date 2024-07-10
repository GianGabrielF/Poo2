package engtelecom.poo;

/**
 * Representa um carro em um jogo de corrida
 */
public class Carro {

    /**
     * velocidade atual do Carro
     */
    private int velAtual;
    private static final int VEL_MAX = 120;
    private static final int VEL_MIN = 0;

    /**
     * Incrementa a velocidade do carro de acordo com o parametro
     * @param i
     * @return
     */
    public int acelerar(int i){        
        if(i>=VEL_MIN && i<= this.VEL_MAX - this.velAtual){
            this.velAtual+=i;
        } else if (i>=this.VEL_MAX - this.velAtual) {
            this.velAtual= this.VEL_MAX;
        }

        return this.velAtual;
    }

    /**
     * decrementa a velocidade do carro de acordo com o parametro
     * @param i
     * @return
     */
    public int frear(int i){
        if(i>=VEL_MIN && i<=this.velAtual){
            this.velAtual-=i;
        } else if(i> this.velAtual) {
            this.velAtual=VEL_MIN;
        }
        return this.velAtual;
    }

    public int getVelAtual() {
        return velAtual;
    }
    
}
