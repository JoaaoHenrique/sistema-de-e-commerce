package ecommerce.models;

public class Produto {

    private String nome;
    private int preco;
    private Categoria categoria;

    public Produto(String nome, int preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        
    }

    public double getPreco() {
        return this.preco;
    }
}
