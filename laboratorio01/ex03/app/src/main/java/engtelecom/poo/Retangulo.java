package engtelecom.poo;

public class Retangulo {

    private int largura;
    private int altura;
    private String tipo;

    public Retangulo(int largura, int altura, String tipo) {
        this.largura = (largura> 0)?largura:4;
        this.altura = (altura>0)?altura:3;
        this.tipo = (tipo.equals("ASCII") || tipo.equals("UTF8"))?tipo:"ASCII";
    }

    public Retangulo(String tipo){
        this(4,3,tipo);
    }
    public Retangulo(){
        this(4,3,"ASCII");
    }



    @Override
    public String toString() {
        if(tipo == "ASCII"){
            return montarRetangulo("+","+","+","+","|","-");
        } else {
            return montarRetangulo("\u250c","\u2510","\u2514","\u2518","\u2502","\u2500");
        }
    }

    private String montarRetangulo(String canto1, String canto2, String canto3, String canto4, String side, String topBottom){
        StringBuilder s = new StringBuilder();

            for(int i=1; i<=this.altura; i++){
                for(int j=1;j<=this.largura;j++){
                    if(i==1 && j==1){
                        s.append(canto1);
                    } else if(i==1 && j==this.largura){
                        s.append(canto2);
                    } else if (i==this.altura && j==1) {
                        s.append(canto3);
                    } else if (i==this.altura && j==this.largura){
                        s.append(canto4);
                    } else if (i==1 || i==this.altura){
                        s.append(topBottom);
                    } else if (j==1 || j==this.largura){
                        s.append(side);
                    } else {
                        s.append(" ");
                    }

                }
                s.append(System.getProperty("line.separator"));
            }
        return s.toString();
    }



    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if(largura>0) {
            this.largura = largura;
            return true;
        }
        return false;
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if(altura>0){
            this.altura = altura;
            return true;
        }
        return false;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(String tipo) {
        if (tipo == "ASCII" || tipo == "UTF8") {
            this.tipo = tipo;
            return true;
        }
        return false;
    }

    public int area(){
        return this.altura*this.largura;
    }

    public int perimetro(){
        return 2*(this.altura + this.largura);
    }

}