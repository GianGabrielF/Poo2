package engtelecom.poo;

import java.util.Random;

public class BuzzLightyear {

    private boolean capacete;
    private boolean asas;
    private String[] frases = new String[]
    {"Ao Infinito e além",
    "obrigado metrossexual de plástico",
    "parece um ambiente inóspito",
    "frase4",
    "frase5",
    "frase6" };

    public void capaceteOnOff(){
        capacete = !capacete;
        
    }

    public void abreAsas(){
        asas = !asas;
    }

    public void falarFrases(){
        Random r = new Random();

        int n = r.nextInt(6);

        System.out.println(frases[n]);

    }

    public void disparaLaser(){
        System.out.println("dispara Laser");
    }

    public void golpeKarate(){
        System.out.println("Hisagi Geri");
    }

    
}
