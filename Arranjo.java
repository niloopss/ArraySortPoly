/**
 * Classe abstrata que representa um arranjo genérico de elementos comparáveis.
 *
 * @param <T> O tipo dos elementos do arranjo, que deve implementar a interface {@link Comparable}.
 * @author Nivea Lins
 */
public abstract class Arranjo<T extends Comparable<T>> {
    /**
     * O tamanho do arranjo.
     */
    protected int tamanho;

    /**
     * Construtor da classe Arranjo.
     *
     * @param tamanho O tamanho do arranjo a ser criado.
     */
    public Arranjo(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Método abstrato para classificar os elementos do arranjo em ordem crescente ou decrescente.
     *
     * @param decrescente {@code true} para classificar em ordem decrescente, {@code false} para ordem crescente.
     */
    public abstract void classificar(boolean decrescente);

    /**
     * Retorna o tamanho do arranjo.
     *
     * @return O tamanho do arranjo.
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * Método abstrato para inserir um elemento no arranjo.
     *
     * @param indice O índice onde o elemento será inserido.
     * @param valor O elemento a ser inserido.
     */
    public abstract void inserir(int indice, T valor);

    /**
     * Método abstrato para obter um elemento do arranjo.
     *
     * @param indice O índice do elemento a ser obtido.
     * @return O elemento no índice especificado.
     */
    public abstract T getElemento(int indice);

    /**
     * Método abstrato para remover um elemento do arranjo.
     *
     * @param indice O índice do elemento a ser removido.
     */
    public abstract void remover(int indice);

    /**
     * Método abstrato para listar todos os elementos do arranjo.
     */
    public abstract void listar();
}
