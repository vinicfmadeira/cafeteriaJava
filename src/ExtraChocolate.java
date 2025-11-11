public class ExtraChocolate extends BebidaDecorator {
    public ExtraChocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 3;
    }

    @Override
    public String getNome() {
        return bebida.getNome() + " + chocolate";
    }
}
