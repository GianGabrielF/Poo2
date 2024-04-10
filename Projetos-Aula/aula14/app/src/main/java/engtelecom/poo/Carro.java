package engtelecom.poo;

public class Carro {

    private String nome;
    private Motor motor;
    private String cor;
    
    public Carro(String nome, Motor motor) {
        this.nome = nome;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro [nome=" + nome + ", motor=" + motor +"]";
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }
    
    
}
