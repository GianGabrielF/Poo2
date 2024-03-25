public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia) {
        this(dia,1);
    }

    public Data(int dia,int mes){
        this(dia,mes,1970);
    }

    private int mesDias(){
        if(this.mes==2){
            if(this.isBissexto()){
                return 29;
            } else {
                return 28;
            }
        } else {    
            return (this.mes<=7)?((this.mes%2 != 0)?31:30):((this.mes%2 == 0)?31:30);
        }
    }

    private boolean isBissexto(){
        return (this.ano%4 == 0 && (this.ano%100 != 0 || this.ano%400 ==0));
    }

    public Data(int dia,int mes,int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(){
        this(1,1,1970);
    }
    
    

    

    
}
