# Sistema de E-commerce em Java | E-commerce System in Java

---

## 🇧🇷 Português

### Sobre o projeto

Este projeto consiste na implementação de um sistema de e-commerce desenvolvido em Java utilizando Maven e Programação Orientada a Objetos (POO).

O sistema foi desenvolvido com base em um diagrama de classes, simulando o funcionamento básico de uma loja virtual, incluindo clientes, produtos, categorias, pedidos e geração de recibos.

---

### Objetivo

Aplicar conceitos fundamentais de Programação Orientada a Objetos e gerenciamento de projetos utilizando Git/GitHub:

- Criação e utilização de classes e objetos;
- Encapsulamento;
- Associação entre objetos;
- Manipulação de coleções utilizando `ArrayList`;
- Organização de um projeto Maven;
- Controle de versão utilizando branches e merges.

---

### Funcionalidades

- Criação de endereços e clientes;
- Cadastro de categorias e produtos;
- Criação de itens de pedido;
- Associação de produtos aos pedidos;
- Cálculo do valor total do pedido;
- Fechamento do pedido;
- Geração e exibição de recibo.

---

### Estrutura do projeto

- `Cliente` (representa os dados do cliente)
- `Endereco` (representa o endereço do cliente)
- `Categoria` (classificação dos produtos)
- `Produto` (representa os produtos disponíveis)
- `ItemPedido` (representa um produto dentro de um pedido)
- `Pedido` (gerenciamento dos itens e informações do pedido)
- `Main` (execução do sistema)

---

### Regras de negócio

- Um cliente possui um endereço associado.
- Um pedido pertence a um cliente.
- Um pedido pode possuir vários itens.
- Cada item possui um produto e uma quantidade.
- O subtotal de cada item é calculado através da quantidade e preço do produto.
- O valor total do pedido é obtido pela soma dos subtotais dos itens.
- O sistema exibe um recibo contendo as informações da compra.

---

### Tecnologias utilizadas

- Java
- Maven
- Git/GitHub
- ArrayList
- Programação Orientada a Objetos

---

### Versionamento

O projeto utiliza Git para controle de versão, seguindo o fluxo proposto na atividade:

- Criação de branches separadas para desenvolvimento;
- Realização de commits organizados;
- Merge das alterações na branch `main` local;
- Sincronização das alterações com o repositório remoto no GitHub.

---

### Como executar

1. Clone o repositório.
2. Abra o projeto em uma IDE Java (VS Code ou Eclipse).
3. Aguarde o carregamento das dependências Maven.
4. Execute a classe `Main`.

---

## 🇺🇸 English

### About the project

This project consists of the implementation of an e-commerce system developed in Java using Maven and Object-Oriented Programming (OOP).

The system was developed based on a class diagram, simulating the basic operation of an online store, including customers, products, categories, orders, and receipt generation.

---

### Objective

Apply fundamental Object-Oriented Programming concepts and project management practices using Git/GitHub:

- Creation and usage of classes and objects;
- Encapsulation;
- Object relationships;
- Collection handling using `ArrayList`;
- Maven project organization;
- Version control using branches and merges.

---

### Features

- Customer and address creation;
- Category and product registration;
- Order item creation;
- Product association with orders;
- Order total calculation;
- Order completion;
- Receipt generation and display.

---

### Project structure

- `Cliente` (represents customer information)
- `Endereco` (represents customer address)
- `Categoria` (product classification)
- `Produto` (represents available products)
- `ItemPedido` (represents a product inside an order)
- `Pedido` (order management)
- `Main` (system execution)

---

### Business rules

- A customer has an associated address.
- An order belongs to a customer.
- An order can contain multiple items.
- Each item contains a product and a quantity.
- Item subtotal is calculated using product price and quantity.
- The order total is calculated by adding all item subtotals.
- The system displays a receipt containing purchase information.

---

### Technologies used

- Java
- Maven
- Git/GitHub
- ArrayList
- Object-Oriented Programming

---

### Version control

The project uses Git for version control following the workflow proposed in the activity:

- Creation of separate development branches;
- Organized commits;
- Merging changes into the local `main` branch;
- Synchronization with the remote GitHub repository.

---

### How to run

1. Clone the repository.
2. Open the project in a Java IDE (VS Code or Eclipse).
3. Wait for Maven dependencies to load.
4. Run the `Main` class.