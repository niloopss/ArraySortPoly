/**
 * Enumeração que representa os possíveis tipos de arranjos numéricos: INTEIRO, DOUBLE, FLOAT, BYTE, SHORT, LONG e CHAR.
 *
 * @author Nivea Lins
 */
enum TipoArranjo {

    /**
     * Indica que o arranjo é do tipo inteiro (int[]).
     */
    INTEIRO(1),

    /**
     * Indica que o arranjo é do tipo double (double[]).
     */
    DOUBLE(2),

    /**
     * Indica que o arranjo é do tipo float (float[]).
     */
    FLOAT(3),

    /**
     * Indica que o arranjo é do tipo byte (byte[]).
     */
    BYTE(4),

    /**
     * Indica que o arranjo é do tipo short (short[]).
     */
    SHORT(5),

    /**
     * Indica que o arranjo é do tipo long (long[]).
     */
    LONG(6),

    /**
     * Indica que o arranjo é do tipo char (char[]).
     */
    CHAR(7);

    /**
     * O valor numérico associado ao tipo de arranjo.
     */
    private final int valor;

    /**
     * Construtor privado da enum TipoArranjo.
     *
     * @param valor O valor numérico associado ao tipo de arranjo.
     */
    TipoArranjo(int valor) {
        this.valor = valor;
    }

    /**
     * Retorna o valor numérico associado ao tipo de arranjo.
     *
     * @return O valor numérico do tipo de arranjo.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Obtém o tipo de arranjo correspondente ao valor numérico fornecido.
     *
     * @param valor O valor numérico do tipo de arranjo.
     * @return O tipo de arranjo correspondente ao valor, ou lança IllegalArgumentException se o valor for inválido.
     * @throws IllegalArgumentException Se o valor não corresponder a nenhum tipo de arranjo válido.
     */
    public static TipoArranjo fromValor(int valor) {
        for (TipoArranjo tipo : values()) {
            if (tipo.valor == valor) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Valor inválido para TipoArranjo: " + valor);
    }
}
