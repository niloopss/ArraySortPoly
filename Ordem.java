enum Ordem {
    CRESCENTE(1),
    DECRESCENTE(2);

    private final int valor;

    Ordem(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static Ordem fromValor(int valor) {
        for (Ordem ordem : values()) {
            if (ordem.valor == valor) {
                return ordem;
            }
        }
        throw new IllegalArgumentException("Valor inválido para Ordem: " + valor);
    }
}
