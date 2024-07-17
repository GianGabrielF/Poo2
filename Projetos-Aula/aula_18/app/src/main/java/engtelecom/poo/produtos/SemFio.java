package engtelecom.poo;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    
    public SemFio(long codigo, long numeroSerie, String modelo, String cor, double peso, Dimensao dimensoes,
            double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numeroSerie, modelo, cor, peso, dimensoes);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }


    @Override
    public String toString() {
        return "SemFio [frequencia=" + frequencia + ", canais=" + canais + ", distanciaOperacao=" + distanciaOperacao
                + "]";
    }


    @Override
    public String imprimirDados() {
        // TODO Auto-generated method stub
        return super.imprimirDados();
    }

    // public String imprimirDados(){
    //     return super.imprimirDados() + "Freq" + this.frequencia;
    // }
    
}
