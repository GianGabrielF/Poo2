package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TermometroTest {

    @Test
    public void testarRetornaTemp(){
        Termometro t = new Termometro(30);

        assertEquals("30.0, 100.0, 0.0",t.returnTemperatura("C"));
        assertEquals("86.0, 212.0, 32.0",t.returnTemperatura("F"));
        assertEquals("303.15, 373.15, 273.15",t.returnTemperatura("K"));
        assertEquals("escala invalida", t.returnTemperatura("B"));
    }
    
    @public void testarDifTemperatura(){

        Termometro t = new Termometro(30);
        Termometro u = new Termometro(30);
    }
}
