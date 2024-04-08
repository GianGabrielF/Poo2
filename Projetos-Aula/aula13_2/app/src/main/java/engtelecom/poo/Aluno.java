package engtelecom.poo;

import java.time.LocalDate;

public class Aluno {

    private String nome;
    private long id;
    private String email;
    private String curso;
    private LocalDate dataNasc;
    private String cpf;
    private String situacao;

    
    public Aluno(String nome, long id, String email, String curso, LocalDate dataNasc, String cpf) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.curso = curso;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.situacao = "Ativo";
    }

    


    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", id=" + id + ", email=" + email + ", curso=" + curso + ", dataNasc=" + dataNasc
                + ", cpf=" + cpf + ", situacao=" + situacao + "]";
    }




    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }


    public LocalDate getDataNasc() {
        return dataNasc;
    }


    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getSituacao() {
        return situacao;
    }


    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }



    
}
