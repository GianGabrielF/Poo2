public abstract class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + "]";
    }

    
    
}
