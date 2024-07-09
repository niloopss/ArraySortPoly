enum TipoArranjo {
    INTEIRO(1),
    DOUBLE(2),
    FLOAT(3),
    BYTE(4),
    SHORT(5),
    LONG(6),
    CHAR(7);

    private final int valor;

    TipoArranjo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static TipoArranjo fromValor(int valor) {
        for (TipoArranjo tipo : values()) {
            if (tipo.valor == valor) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Valor inválido para TipoArranjo: " + valor);
    }
}
