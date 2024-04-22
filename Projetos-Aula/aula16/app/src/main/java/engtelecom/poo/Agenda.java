package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
    
    public void addContato (Contato contato){
        this.contatos.add(contato);
    }

    public void removeContato (Contato contato){
        this.contatos.removeIf(e->e.equals(contato));
    }

    public boolean addTelefone (Contato contato,String rotulo, Telefone telefone){
        // if(this.contatos.contains(contato)){
        //     int j= this.contatos.indexOf(contato);
        //     this.contatos.get(j).adicionaTelefone(telefone, rotulo);
        //     return true;
        // } else {
        //     return false;
        // }
        if(!this.contatos.contains(contato)){
            return false;
        }
        this.contatos.get(this.contatos.indexOf(contato)).adicionaTelefone(telefone, rotulo);
        return true;
    }

    public boolean addEmail (Contato contato,String rotulo, Email email){
        // if(this.contatos.contains(contato)){
        //     int j= this.contatos.indexOf(contato);
        //     this.contatos.get(j).adicionaEmail(email, rotulo);
        //     return true;
        // } else {
        //     return false;
        // }
        if(!this.contatos.contains(contato)){
            return false;
        }
        this.contatos.get(this.contatos.indexOf(contato)).adicionaEmail(email, rotulo);
        return true;
    }

    public boolean alteraTelefone (Contato contato,String rotulo, Telefone telefone){
        if(!this.contatos.contains(contato)){
            return false;
        }
        this.contatos.get(this.contatos.indexOf(contato)).alteraTelefone(rotulo, telefone);
        return true;
    }

    public boolean alteraEmail(Contato contato,String rotulo, Email email){
        if(!this.contatos.contains(contato)){
            return false;
        }
        this.contatos.get(this.contatos.indexOf(contato)).alteraEmail(rotulo, email);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder toS = new StringBuilder("Agenda:\n");
        this.contatos.forEach(e->{
            toS.append(e.toString());
        });
        
        return toS.toString();

    }


}
