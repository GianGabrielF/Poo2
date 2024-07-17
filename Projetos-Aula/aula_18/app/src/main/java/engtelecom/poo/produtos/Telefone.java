package engtelecom.poo;

public class Telefone {

    private long codigo;
    private long numeroSerie;
    private String modelo;
    private String cor;
    private double peso;
    private Dimensao dimensoes;

    
    public Telefone(long codigo, long numeroSerie, String modelo, String cor, double peso, Dimensao dimensoes) {
        this.codigo = codigo;
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.cor = cor;
        this.peso = peso;
        this.dimensoes = dimensoes;
    }


    public String imprimirDados() {
        return "Telefone [codigo=" + codigo + ", numeroSerie=" + numeroSerie + ", modelo=" + modelo + ", cor=" + cor
                + ", peso=" + peso + ", dimensoes=" + dimensoes + "]";
    }
    

    
}
