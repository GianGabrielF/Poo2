package engtelecom.poo;

import java.time.LocalDate;

public class Autor {

    private String nome;
    private String nacionalidade;
    private LocalDate dataNasc;
    
    public Autor(String nome, String nacionalidade, LocalDate dataNasc) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "\n nome: " + nome + "\n nacionalidade: " + nacionalidade + "\n dataNasc: " + dataNasc ;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    
    
}
