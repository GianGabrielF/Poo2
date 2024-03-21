package engtelecom.poo;

public class Retangulo {

    private int largura;
    private int altura;
    private String tipo;

    public Retangulo(int largura, int altura, String tipo) {
        this.largura = (largura> 0)?largura:4;
        this.altura = (altura>0)?altura:3;
        this.tipo = (tipo == "ASCII" || tipo == "UTF8")?tipo:"ASCII";
    }

    public Retangulo(){
        this(4,3,"ASCII");
    }

}