package ecommerce.models;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) { // Recebe um ItemPedido e adiciona na lista itens
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) { // percorre cada item da lista
            total += item.calcularSubtotal(); // soma o subtotal de cada um
        }
        return total;
    }

    public void gerarRecibo() {
        System.out.println("===== RECIBO =====");
        System.out.println("Pedido Nº: " + numero);
        System.out.println(cliente.exibirResumo());
        System.out.println("\n--- Itens ---");
        for (ItemPedido item : itens) {
            System.out.println(item.calcularSubtotal());
        }
        System.out.println("\nTotal: R$" + calcularTotal());
        System.out.println("==================");
    }
}