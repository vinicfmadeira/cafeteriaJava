public class ExtraLeite extends BebidaDecorator {
    public ExtraLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2;
    }

    @Override
    public String getNome() {
        return bebida.getNome() + " + leite";
    }
}
