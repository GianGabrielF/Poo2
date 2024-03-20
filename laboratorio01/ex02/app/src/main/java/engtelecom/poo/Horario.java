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

    public Horario(int hora, int minuto, int segundo) {
        this.hora = (hora>=0 && hora <= 23)?hora:0;
        this.minuto = (minuto >=0 && minuto <=59)?minuto:0;
        this.segundo = (segundo >=0 && segundo <=59)?minuto:0;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public boolean setSegundo(int segundo) {
        if(segundo >=0 && segundo <= 60){
            this.segundo=segundo;
            return true;
        } else {
            return false;
        }
    }


    
    
}
