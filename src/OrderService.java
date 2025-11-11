public class OrderService {
    private FilaPedidos fila;

    public OrderService(FilaPedidos fila) {
        this.fila = fila; // DI por construtor
    }

    public void registrar(Pedido p) {
        fila.adicionar(p);
    }
}
