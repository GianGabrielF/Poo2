package engtelecom.poo;

public class Carro {

    //atributos
    private double velocidade;
    private String modeloString;
    

    //métodos

    public void acelerar (double v){
        velocidade+=v;
    }

    public void frear(double v){
        velocidade -= v;
    }

    public double obtervelocidade(){
        return velocidade;
    }
    
}
