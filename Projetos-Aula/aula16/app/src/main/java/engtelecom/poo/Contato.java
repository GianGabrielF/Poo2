package engtelecom.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String , Telefone > telefones ;
    private HashMap<String , Email > emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc, HashMap<String, Telefone> telefones,
            HashMap<String, Email> emails) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = telefones;
        this.emails = emails;
    }

    public Boolean adicionaEmail(Email email,String rotulo){
        if(email.isValid()){
            if(!this.emails.containsKey(rotulo)){
                this.emails.put(rotulo, email);
                return true;
            } else { 
                return false;
            }
        } else {
            return false;
        }

    }


    public HashMap<String, Telefone> getTelefones() {
        return telefones;
    }

    public HashMap<String, Email> getEmails() {
        return emails;
    }

    public Email

    public Boolean adicionaTelefone(Telefone telefone,String rotulo){
            if(!this.telefones.containsKey(rotulo)){
                this.telefones.put(rotulo, telefone);
                return true;
            } else { 
                return false;
            }
         
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    
    

}
