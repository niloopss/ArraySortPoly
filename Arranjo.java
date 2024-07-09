public abstract class Arranjo<T extends Comparable<T>> {
    protected int tamanho;

    public Arranjo(int tamanho) {
        this.tamanho = tamanho;
    }

    public abstract void classificar(boolean decrescente);

    public int getTamanho() {
        return tamanho;
    }

    public abstract void inserir(int indice, T valor);

    public abstract T getElemento(int indice);

    public abstract void remover(int indice);

    public abstract void listar();
}
