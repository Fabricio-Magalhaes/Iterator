package iterator;

/**
 *
 * @author Usuario
 */
public class ProdutosIterator implements IteratorPD {

    Produto[] itens;
    int posicao = 0;

    public ProdutosIterator(Produto[] itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Produto produto = itens[posicao];
        posicao++;
        return produto;
    }

}
