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
        return validCheck(hora, this.hora, 0, 24);
    }

    public boolean setMinuto(int minuto) {
        return validCheck(minuto, this.minuto, 0, 60);
    }

    public boolean setSegundo(int segundo) {
        return validCheck(segundo, this.segundo, 0, 60);
    }

    private boolean validCheck(int n,int replace, int low, int high){
        if(n>= low && n < high){
            replace=n;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d", this.hora) + ":" + String.format("%02d", this.minuto) + ":" + String.format("%02d", this.segundo);
    }


    
    
}
