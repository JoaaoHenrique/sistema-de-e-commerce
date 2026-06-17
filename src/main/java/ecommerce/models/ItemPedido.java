package ecommerce.models;

public class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(int quantidade, Produto produto) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }
    
}
