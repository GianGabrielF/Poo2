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
    
    public String porExtenso(){
        String[] mes = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};

        return this.dia + " de " + mes[this.mes] + " de " + this.ano;
    }    

    private int comparaData(Data d1,Data d2){
        
        if(d1.getAno()>d2.getAno()){
            return 1;//d1>d2
        }
        if(d1.getAno()<d2.getAno()){
            return -1;//d1<d2
        }
        if(d1.getMes()>d2.getMes()){
            return 1;
        } 
        if(d1.getMes()<d2.getMes()){
            return -1;
        }
        if(d1.getDia()>d2.getDia()){
            return 1;
        }
        if(d1.getDia()<d2.getDia()){
            return -1;
        }
        return 0;//d1==d2

    }

    public int diffDias(Data d2){
        int dif;

        if(this.mes == d2.getMes() && this.ano == d2.getAno()){
            return Math.abs(this.dia - d2.getDia());
        } else if (this.ano == d2.getAno()){
            if(comparaData(this, d2)==1){
                dif = mesDias(d2.getMes()) - d2.getDia();
                for(int i= d2.getMes()+1; i<this.mes;i++){
                    dif+=mesDias(i);
                }
                dif+=this.dia;
                return dif;
            } else {
                if(comparaData(this, d2)==-1){
                    dif = mesDias(this.mes) - this.dia;
                    for(int i= this.mes+1; i<d2.getMes();i++){
                        dif+=mesDias(i);
                    }
                    dif+=d2.getDia();
                    return dif;
                }
            }

        } else {
            if
        }
    }

    

    
}
