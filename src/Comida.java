public class Comida extends Produto {
    public Comida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
