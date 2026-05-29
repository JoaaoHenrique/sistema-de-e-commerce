package ecommerce.models;

import java.util.List;

public class Pedido {

    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(int numero, Cliente cliente, List<ItemPedido> itens) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = itens;

    }

    public adicionaritem(ItemPedido) {

    }

    public double calcularTotal() {

    }

    public void gerarRecibo() {
        
    }
}
