public class PagamentoCartao implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no cartão: R$ " + valor);
    }
}
