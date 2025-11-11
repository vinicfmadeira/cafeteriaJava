import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> itens = new ArrayList<>();
    private Pagamento pagamento;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(Produto p) {
        itens.add(p);
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento; // DI por método
    }

    public double total() {
        return itens.stream().mapToDouble(Produto::getPreco).sum();
    }

    public void finalizar() {
        pagamento.pagar(total());
        System.out.println("Pedido do cliente " + cliente.getNome() + " confirmado!");
    }
}
