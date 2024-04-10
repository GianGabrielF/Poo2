package engtelecom.poo;

public class Motor {

    private double potencia;
    private double vMax;

    
    public Motor(double potencia, double vMax) {
        this.potencia = potencia;
        this.vMax = vMax;
    }


    @Override
    public String toString() {
        return "Motor [potencia=" + potencia + ", vMax=" + vMax + "]";
    }

    
    
}
