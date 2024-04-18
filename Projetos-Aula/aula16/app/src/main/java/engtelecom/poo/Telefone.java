package engtelecom.poo;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Telefone{

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Telefone(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String resultado = null;
        try {
            MaskFormatter mask = new MaskFormatter("(##) #####−####");
            resultado = mask.valueToString(this.valor)

        } catch (ParseException e){
            e.printStackTrace();
        }

        return resultado;
    }

    
}