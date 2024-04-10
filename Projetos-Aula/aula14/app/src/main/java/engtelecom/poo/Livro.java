package engtelecom.poo;

import java.util.ArrayList;

public class Livro {

    private String isbn;
    private String titulo;
    private ArrayList<Autor> autores;
    
    public Livro(String isbn, String titulo, ArrayList<Autor> autores) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;

        this.autores.getFirst().setNome("Jose");
    }

    @Override
    public String toString() {
        return "Livro: \n titulo: " + titulo + "\n autores: " + autores + "\n isbn: " + isbn;
    }
    
    
}
