package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this(0);
    }

    public Horario(int hora) {
        this(hora,0);
    }

    public Horario(int hora, int minuto) {
        this(hora,minuto,0);
    }

    public Horario(int hora, int minuto, int segundo){
        this.hora = (hora>=0 && hora <= 23)?hora:0;
        this.minuto = (minuto >=0 && minuto <=59)?minuto:0;
        this.segundo = (segundo >=0 && segundo <=59)?segundo:0;
    }

    public boolean setHora(int hora) {
        if(hora >=0 && hora <24){
            this.hora=hora;
        }

        return (hora >=0 && hora <24);
    }

    public boolean setMinuto(int minuto) {
        if(minuto >=0 && minuto <60){
            this.minuto=minuto;
        }

        return (minuto >=0 && minuto <60);
    }

    public boolean setSegundo(int segundo) {
        if(segundo >=0 && minuto <60){
            this.segundo=segundo;
        }
        return (segundo >=0 && minuto <60);
    }


    @Override
    public String toString() {
        return String.format("%02d", this.hora) + ":" + String.format("%02d", this.minuto) + ":" + String.format("%02d", this.segundo);
    }

    private String porExtenso(int i, boolean genero){

            String s;
            String[] unidade = {"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
            String[] dezenas = {"vinte", "trinta", "quarenta", "cinquenta"};
            String[] casosEspeciais = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "desesseis", "desessete", "desoito", "desenove"};
                if(i < 10) {
                    s = unidade[i - 1];
                    if((i-1)==0){
                        if(genero){
                            s="uma";
                        }
                    }
                } else if(i < 20) {
                    s = casosEspeciais[i - 10];
                } else {
                    int d = i / 10;
                    int u = i - (d * 10);
                    if (u == 0) {
                        s = dezenas[d-2];
                    } else {
                        if(genero && u==1) {
                            s = dezenas[d - 2] + " e uma";
                        } else {
                            s = dezenas[d - 2] + " e " + unidade[u - 1];
                        }
                    }
                }
            return s;
    }

    public String horaPorExtenso(){

        int[] vet = {this.hora,this.minuto,this.segundo};
        String[] extenso = new String[3];
        String[][] pluralidade = {{"hora","horas"},{"minuto","minutos"},{"segundo","segundos"}};
        String[] plural = new String[3];
        boolean genero=true;
        for(int j =0; j < 3 ; j++){
            extenso[j]= porExtenso(vet[j],genero);
            genero=false;
            if(vet[j]<=1){
                plural[j] = pluralidade[j][0];
            } else {
                plural[j] = pluralidade[j][1];
            }

        }
        return extenso[0] + " " + plural[0] + ", " + extenso[1] + " " + plural[1] + " e "+ extenso[2] + " " + plural[2];
    }

    public long hrSegundos(){
        return (this.hora*60*60) + (this.minuto*60) + this.segundo;
    }

    public long diferenca(Horario h){
        return Math.abs((hrSegundos() - h.hrSegundos()));
    }


    
    
}
