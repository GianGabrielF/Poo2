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
    
    public boolean addContato (Contato contato){
        for(Contato e: contatos){
            if(contato.getNome().equals(e.getNome())){
                if(contato.getSobrenome().equals(e.getSobrenome())){
                    return false;
                }
            }
        }
        return this.contatos.add(contato);
    }

    public void removeContato (String nome, String sobrenome){
        this.contatos.removeIf(e->e.getNome().equals(nome) && e.getSobrenome().equals(sobrenome));
    }

    public boolean addTelefone (Contato contato,String rotulo, Telefone telefone){
        // if(this.contatos.contains(contato)){
        //     int j= this.contatos.indexOf(contato);
        //     this.contatos.get(j).adicionaTelefone(telefone, rotulo);
        //     return true;
        // } else {
        //     return false;
        // }ArrayList
        return contato.adicionaTelefone(telefone, rotulo);
        
    }

    public boolean addEmail (Contato contato,String rotulo, Email email){
        // if(this.contatos.contains(contato)){
        //     int j= this.contatos.indexOf(contato);
        //     this.contatos.get(j).adicionaEmail(email, rotulo);
        //     return true;
        // } else {
        //     return false;
        // }
        return contato.adicionaEmail(email, rotulo);
    }

    public boolean alteraTelefone (Contato contato,String rotulo, Telefone telefone){
        return contato.alteraTelefone(rotulo, telefone);
    }

    public boolean alteraEmail(Contato contato,String rotulo, Email email){
        return contato.alteraEmail(rotulo, email);
    }

    @Override
    public String toString() {
        StringBuilder toS = new StringBuilder("Agenda:\n");
        this.contatos.forEach(e->{
            toS.append(e.toString());
            toS.append("\n");
        });
        
        return toS.toString();

    }

    // public void procura(String nome){

    // }


}
