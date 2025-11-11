# Sistema de Cafeteria – Padrões de Projeto

## Visão Geral
Esse projeto é uma implementação mínima de um sistema de cafeteria em Java, usando 4 padrões de projeto e um princípio SOLID integrados de verdade no fluxo do sistema.

O sistema permite:
- Criar produtos (bebidas e comidas)
- Customizar bebidas com ingredientes extras
- Processar pagamento
- Enfileirar e processar pedidos
- Interagir via terminal

---

## Padrões e Princípios Usados

### SRP – Single Responsibility Principle
Cada classe tem uma responsabilidade clara:

- `Produto` representa um item básico  
- `Pedido` gerencia apenas lógica do próprio pedido  
- `PedidoService` cuida só da fila de pedidos  
- `TerminalUI` faz apenas a interação do usuário  
- Cada classe de pagamento só cuida de pagamento  

---

### Singleton – PedidoService
A fila de pedidos é única no sistema inteiro.

```java
public static PedidoService getInstancia() {
    if(instancia == null)
        instancia = new PedidoService();
    return instancia;
}
```

---

### Dependency Injection
Usado de duas formas:

#### DI via construtor
`TerminalUI` recebe `PedidoService` pelo construtor:

```java
public TerminalUI(PedidoService pedidoService) {
    this.pedidoService = pedidoService;
}
```

#### DI via método
`Pedido` recebe o pagamento via setter:

```java
pedido.setPagamento(new PagamentoCartao());
```

---

### Factory – ProdutoFactory
Criação de bebidas e comidas sem espalhar `new` no código:

```java
public static Produto criarProduto(String tipo) {
    if(tipo.equalsIgnoreCase("cafe"))
        return new Bebida("Café Preto", 5.0);
}
```

---

### Decorator – BebidaDecorator
Customização de bebidas (leite, chocolate) sem alterar as classes originais:

```java
p = new LeiteDecorator(p);
p = new ChocolateDecorator(p);
```

---

## Arquitetura do Projeto

```
cafeteria/
├── Main.java
├── TerminalUI.java
├── PedidoService.java
├── Pedido.java
├── Produto.java
├── ProdutoFactory.java
├── Bebida.java
├── Comida.java
├── BebidaDecorator.java
├── LeiteDecorator.java
├── ChocolateDecorator.java
├── Pagamento.java
├── PagamentoCartao.java
└── PagamentoDinheiro.java
```

---

## Como Executar

### Requisitos:
- Java 8+ instalado

### Passos:
1. Abra o terminal na pasta do projeto
2. Compile tudo:

```
javac cafeteria/*.java
```

3. Execute:

```
java cafeteria.Main
```

4. Siga as opções no terminal (produto, customizações, pagamento)

---

## Onde Cada Padrão Está

| Padrão / Princípio | Arquivo |
|--------------------|----------|
| SRP | todas as classes |
| Singleton | `PedidoService` |
| DI construtor | `TerminalUI` |
| DI método | `Pedido.setPagamento()` |
| Factory | `ProdutoFactory` |
| Decorator | `LeiteDecorator`, `ChocolateDecorator` |
