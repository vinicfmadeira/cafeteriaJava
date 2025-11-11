public class Main {
    public static void main(String[] args) {

        // DI por construtor
        OrderService service = new OrderService(FilaPedidos.getInstancia());

        Cliente c = new Cliente("João");
        Pedido pedido = new Pedido(c);

        // Factory
        Bebida cafe = (Bebida) ProdutoFactory.criarProduto("cafe");

        // Decorator
        cafe = new ExtraChocolate(new ExtraLeite(cafe));

        // adiciona bebida decorada
        pedido.adicionarItem(cafe);

        // comida normal
        pedido.adicionarItem(ProdutoFactory.criarProduto("sanduiche"));

        // DI por método
        pedido.setPagamento(new PagamentoCartao());

        // registra e finaliza
        service.registrar(pedido);
        pedido.finalizar();
    }
}
