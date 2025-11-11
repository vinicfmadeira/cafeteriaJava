public abstract class BebidaDecorator extends Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        super(bebida.getNome(), bebida.getPreco());
        this.bebida = bebida;
    }
}
