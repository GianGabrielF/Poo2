package engtelecom.poo;

public class Termometro {

    private double temperatura;
    private static final String escala = "C";
    private static final double TEMPERATURA_MIN = 0;
    private static final double TEMPERATURA_MAX = 100;
    
    public Termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    public String returnTemperatura(String escala){
        double newTemperatura;
        double newTempMax;
        double newTempMin;
        switch(escala){
            case "C"-> {
                newTemperatura=this.temperatura;
                newTempMax=this.TEMPERATURA_MAX;
                newTempMin=this.TEMPERATURA_MIN;
            }
            case "F"-> {
                newTemperatura=1.8*this.temperatura + 32;
                newTempMax=1.8*this.TEMPERATURA_MAX + 32;
                newTempMin=1.8*this.TEMPERATURA_MIN + 32;
            }
            case "K"-> {
                newTemperatura=this.temperatura + 273.15;
                newTempMax=this.TEMPERATURA_MAX + 273.15;
                newTempMin=this.TEMPERATURA_MIN + 273.15;
            }
            default -> {
                return "escala invalida";
            }
        }
        return newTemperatura + ", " + newTempMax + ", " + newTempMin;
    }

    

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public static String getEscala() {
        return escala;
    }

    
    
}
