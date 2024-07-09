public class ArranjoLong extends Arranjo<Long> {
    private long[] elementos;

    public ArranjoLong(int tamanho) {
        super(tamanho);
        elementos = new long[tamanho];
    }

    @Override
    public void classificar(boolean decrescente) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if ((decrescente && elementos[j] < elementos[j + 1]) ||
                        (!decrescente && elementos[j] > elementos[j + 1])) {
                    long temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void inserir(int indice, Long valor) {
        if (indice >= 0 && indice < tamanho) {
            elementos[indice] = valor;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    @Override
    public Long getElemento(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }

    @Override
    public void remover(int indice) {
        if (indice >= 0 && indice < tamanho) {
            elementos[indice] = 0; // Remove o elemento (substitui por 0)
        } else {
            System.out.println("Índice inválido.");
        }
    }

    @Override
    public void listar() {
        for (long elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
