package engtelecom.poo;

public class Carro {

    //atributos
    private double velocidade;
    private String modeloString;

    private final double V_MAX;
    private final double V_MIN = 0;

    // public Carro(double velocidade, String modeloString) {
    //     this.velocidade =0;
    //     this.acelerar(velocidade);
    //     this.velocidade = velocidade;
    //     this.modeloString = modeloString;
    // }

    public Carro(double vMax){
        this.V_MAX=vMax;
    }
    

    //métodos

    public void acelerar (double v){
        if(v >=0){
            this.velocidade+=v;
        }
        if(velocidade >V_MAX){
            this.velocidade = V_MAX;
        }
        
    }

    public void frear(double v){
        if(v >=0){
            this.velocidade -= v;
        }
        if(velocidade < V_MIN){
            this.velocidade = V_MIN;
        }
    }

    public double obtervelocidade(){
        return this.velocidade;
    }

    public void setVelocidade(double v){
        // if(v>=200 && v<=0){
        //     this.velocidade=v;
        // }
        this.velocidade =V_MIN;
        this.acelerar(v);
    }
    
}
