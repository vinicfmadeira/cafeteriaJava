import java.util.LinkedList;
import java.util.Queue;

public class FilaPedidos {
    private static FilaPedidos instancia;
    private Queue<Pedido> fila = new LinkedList<>();

    private FilaPedidos() {}

    public static synchronized FilaPedidos getInstancia() {
        if (instancia == null)
            instancia = new FilaPedidos();
        return instancia;
    }

    public void adicionar(Pedido p) {
        fila.add(p);
    }

    public Pedido proximo() {
        return fila.poll();
    }
}
