package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarroTest {

    @Test
    public void validarConstrutor(){
        Carro c = new Carro();
        assertEquals(0, c.getVelAtual());
    }


    @Test
    public void testarAcelerar(){
        Carro c = new Carro();

        assertEquals(0, c.acelerar(0));
        assertEquals(10, c.acelerar(10));
        assertEquals(20, c.acelerar(10));
        assertEquals(20, c.acelerar(-1));

    }

    @Test
    public void testarFrear(){
        Carro c = new Carro();

        assertEquals(0, c.frear(0));
        assertEquals(0, c.frear(10));
        c.acelerar(100);
        assertEquals(90, c.frear(10));
        assertEquals(90, c.frear(-20));
        assertEquals(0, c.frear(90));
        assertEquals(0, c.frear(100));
    }

    @Test
    public void testeVelMaxima(){
        Carro c = new Carro();

        assertEquals(120, c.acelerar(121));
    }
    
}
