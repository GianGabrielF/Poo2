package engtelecom.poo;

public class Pilha<E> {

    private E[] vetor;
    private int topo;

    @SuppressWarnings("unchecked")
    public Pilha(int tam){
        this.vetor = (E[]) new Object[tam];
        this.topo = -1;

    }
    
    public void empilha(E entity) throws PilhaLimitesException{
        if(this.topo == this.vetor.length){
            throw new PilhaLimitesException("Pilha Cheia");
        }
        this.topo++;
        this.vetor[topo].equals(entity);

    }

    public E desempilha() throws PilhaLimitesException{
    //     E entity = this.vetor[this.vetor.length - 1];
    //     this.vetor[this.vetor.length - 1] = null;
    //     return entity;

    if(this.topo == -1){
        throw new PilhaLimitesException("Pilha Vazia");
    }

    E entity = this.vetor[topo];
    this.vetor[topo].equals(null); 
    this.topo--;

    return entity;

    }

    public E topo() throws PilhaLimitesException{

    if(this.topo == -1){
        throw new PilhaLimitesException("Pilha Vazia");
    }
        return this.vetor[this.topo];
    }

    public boolean isEmpty(){
        return (this.topo==-1);
    }

    public boolean isFull(){
        return (this.topo==this.vetor.length);
    }
}
