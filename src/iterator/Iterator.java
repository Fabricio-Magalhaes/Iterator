package iterator;

/**
 *
 * @author Usuario
 */
public class Iterator {

    public static void main(String[] args) {
        Produto[] Itens = new Produto[3];

        Itens[0] = new Produto("Arroz");
        Itens[1] = new Produto("Feijao");
        Itens[2] = new Produto("Macarrao");

        IteratorPD itensIterator = new ProdutosIterator(Itens);

        while (itensIterator.hasNext()) {
            Produto produto = (Produto) itensIterator.next();
            System.out.println(produto.nome);
        }
    }
}
