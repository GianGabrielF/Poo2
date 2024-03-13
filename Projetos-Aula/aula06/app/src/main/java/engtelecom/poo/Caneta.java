package engtelecom.poo;

public class Caneta {

    private int tinta;
    private boolean tampa;
    private String cor;

    public void abrirFechar(){
        tampa = !tampa;
    }

    //método chamado só na hora do new
    public Caneta(String cor, int tinta) {
        this.tinta = 100;
        this.definirTinta(tinta);
        this.tampa = false;
        this.cor = cor;
    }

    public Caneta(String cor) {
        this(cor,100);
    }

    


    public Caneta() {
        this("preto");
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
        if(n>=0 && n<=100){
            tinta =n;
        }
    }

    
}
