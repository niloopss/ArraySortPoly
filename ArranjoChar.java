/**
 * Classe que representa um arranjo de caracteres (char[]), estendendo a classe abstrata {@link Arranjo}.
 * Permite armazenar e classificar um conjunto de valores do tipo char.
 *
 * @author Nivea Lins
 */
public class ArranjoChar extends Arranjo<Character> {

    /**
     * Array para armazenar os elementos do tipo char.
     */
    private char[] elementos;

    /**
     * Constrói um novo objeto ArranjoChar com o tamanho especificado.
     *
     * @param tamanho O tamanho do arranjo a ser criado.
     */
    public ArranjoChar(int tamanho) {
        super(tamanho);
        elementos = new char[tamanho];
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
                    char temp = elementos[j];
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
    public void inserir(int indice, Character valor) {
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
    public Character getElemento(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }

    /**
     * Remove o elemento no índice especificado, substituindo-o por '\0'.
     *
     * @param indice O índice do elemento a ser removido.
     * @throws ArrayIndexOutOfBoundsException Se o índice for inválido (menor que 0 ou maior ou igual ao tamanho do array).
     */
    @Override
    public void remover(int indice) {
        if (indice >= 0 && indice < tamanho) {
            elementos[indice] = '\0'; // Remove o elemento (substitui por caractere nulo)
        } else {
            throw new ArrayIndexOutOfBoundsException("Índice inválido: " + indice);
        }
    }

    /**
     * Imprime todos os elementos do arranjo no console.
     */
    @Override
    public void listar() {
        for (char elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
