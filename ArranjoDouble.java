/**
 * Classe que representa um arranjo de números de ponto flutuante de dupla precisão (double[]),
 * estendendo a classe abstrata {@link Arranjo}.
 * Permite armazenar e classificar um conjunto de valores do tipo double.
 *
 * @author Nivea Lins
 */
public class ArranjoDouble extends Arranjo<Double> {

    /**
     * Array para armazenar os elementos do tipo double.
     */
    private double[] elementos;

    /**
     * Constrói um novo objeto ArranjoDouble com o tamanho especificado.
     *
     * @param tamanho O tamanho do arranjo a ser criado.
     */
    public ArranjoDouble(int tamanho) {
        super(tamanho);
        elementos = new double[tamanho];
    }

    /**
     * Classifica os elementos do arranjo em ordem crescente ou decrescente utilizando o algoritmo bubble sort.
     *
     * @param decrescente {@code true} para classificar em ordem decrescente, {@code false} para ordem crescente.
     */
    @Override
    public void classificar(boolean decrescente) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if ((decrescente && elementos[j] < elementos[j + 1]) ||
                        (!decrescente && elementos[j] > elementos[j + 1])) {
                    double temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Insere um valor no arranjo no índice especificado.
     *
     * @param indice O índice onde o valor será inserido.
     * @param valor O valor a ser inserido.
     * @throws ArrayIndexOutOfBoundsException Se o índice for inválido (menor que 0 ou maior ou igual ao tamanho do array).
     */
    @Override
    public void inserir(int indice, Double valor) {
        if (indice >= 0 && indice < tamanho) {
            elementos[indice] = valor;
        } else {
            throw new ArrayIndexOutOfBoundsException("Índice inválido: " + indice);
        }
    }

    /**
     * Retorna o elemento no índice especificado.
     *
     * @param indice O índice do elemento a ser retornado.
     * @return O elemento no índice especificado, ou null se o índice for inválido.
     */
    @Override
    public Double getElemento(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }

    /**
     * Remove o elemento no índice especificado, substituindo-o por 0.0.
     *
     * @param indice O índice do elemento a ser removido.
     * @throws ArrayIndexOutOfBoundsException Se o índice for inválido (menor que 0 ou maior ou igual ao tamanho do array).
     */
    @Override
    public void remover(int indice) {
        if (indice >= 0 && indice < tamanho) {
            elementos[indice] = 0.0;
        } else {
            throw new ArrayIndexOutOfBoundsException("Índice inválido: " + indice);
        }
    }

    /**
     * Imprime todos os elementos do arranjo no console.
     */
    @Override
    public void listar() {
        for (double elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
