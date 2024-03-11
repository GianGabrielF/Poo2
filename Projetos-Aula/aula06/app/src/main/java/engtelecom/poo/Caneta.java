package engtelecom.poo;

public class Caneta {

    private int tinta;
    private boolean tampa;
    private String cor;

    public void abrirFechar(){
        tampa = !tampa;
    }

    public void desenhar(){
        if((tampa) && (tinta >0)){
            System.out.println("desenhando na cor " + cor);
            tinta--;
        }
    }

    public void definirCor(String c){
        cor =c;
    }

    public void definirTinta(int n){
        tinta =n;
    }

    
}
