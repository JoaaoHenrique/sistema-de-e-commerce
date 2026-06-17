package ecommerce;

import ecommerce.models.*;

public class Main {

    public static void main(String[] args) {

        // 1. Criar Endereço e Cliente
        Endereco endereco = new Endereco("Rua das Flores", "123", "12345-678");
        Cliente cliente = new Cliente("João Silva", "joao@email.com", endereco);

        // 2. Criar Categorias e Produtos
        Categoria eletronicos = new Categoria("Eletrônicos", "Produtos eletrônicos em geral");
        Categoria acessorios = new Categoria("Acessórios", "Acessórios para eletrônicos");

        Produto smartphone = new Produto("Smartphone", 1500.00, eletronicos);
        Produto fone = new Produto("Fone", 100.00, acessorios);

        // 3. Criar Itens do Pedido
        ItemPedido item1 = new ItemPedido(1, smartphone); // 1 Smartphone
        ItemPedido item2 = new ItemPedido(2, fone);       // 2 Fones

        // 4. Fechar o Pedido
        Pedido pedido = new Pedido(1, cliente);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        // 5. Exibir o Recibo
        pedido.gerarRecibo();
    }
}
