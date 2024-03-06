package engtelecom.poo;

public class Contador {

    private int valorAtual;

    public void atribuirValor(int n){
        valorAtual=n;
    }

    public void incrementarValor(){
        valorAtual++;
    }

    public int obtervalor(){
        return valorAtual;
    }
    
}
