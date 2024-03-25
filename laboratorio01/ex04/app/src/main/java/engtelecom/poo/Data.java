package engtelecom.poo;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia,int mes,int ano){

        this.ano = ano;
        this.mes = (mes>0 && mes<=12)?mes:1;
        this.dia = (dia>0 && dia<= mesDias(this.mes))?dia:1;
    }


    public Data(int dia) {
        this(dia,1);
    }

    public Data(int dia,int mes){
        this(dia,mes,1970);
    }

    private int mesDias(int month){
        if(month==2){
            return(this.isBissexto())?29:28;
        } else {    
            return (month<=7)?((month%2 != 0)?31:30):((month%2 == 0)?31:30);
        }
    }

    private boolean isBissexto(){
        return (this.ano%4 == 0 && (this.ano%100 != 0 || this.ano%400 ==0));
    }

    public Data(){
        this(1,1,1970);
    }


    public int getDia() {
        return dia;
    }


    public boolean setDia(int dia) {
        if(dia>0 && dia<= mesDias(this.mes)){
            this.dia = dia;
            return true;
        }
        return false;
    }


    public int getMes() {
        return mes;
    }


    public boolean setMes(int mes) {
        if(mes>0 && mes <=12){
            if(this.dia<=mesDias(mes)){
            this.mes = mes;
            return true;
            }
        }
        return false;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d",this.dia,this.mes,this.ano);
    }
    
        

    

    
}
