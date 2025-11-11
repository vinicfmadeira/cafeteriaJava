public class Bebida extends Produto {
    public Bebida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
