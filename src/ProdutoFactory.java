public class ProdutoFactory {

    public static Produto criarProduto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "cafe": return new Bebida("Café", 5);
            case "cha": return new Bebida("Chá", 4);
            case "sanduiche": return new Comida("Sanduíche", 12);
            case "bolo": return new Comida("Bolo", 8);
            default: throw new IllegalArgumentException("Produto desconhecido");
        }
    }
}
