public class ArranjoShort extends Arranjo<Short> {
    private short[] elementos;

    public ArranjoShort(int tamanho) {
        super(tamanho);
        elementos = new short[tamanho];
    }

    @Override
    public void classificar(boolean decrescente) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if ((decrescente && elementos[j] < elementos[j + 1]) ||
                        (!decrescente && elementos[j] > elementos[j + 1])) {
                    short temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void inserir(int indice, Short valor) {
        if (indice >= 0 && indice < tamanho) {
            elementos[indice] = valor;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    @Override
    public Short getElemento(int indice) {
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
        for (short elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
