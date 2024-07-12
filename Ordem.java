/**
 * Enumeração que representa as possíveis ordens de classificação de um arranjo: CRESCENTE ou DECRESCENTE.
 *
 * @author Nivea Lins
 */
enum Ordem {

    /**
     * Indica que o arranjo deve ser classificado em ordem crescente.
     */
    CRESCENTE(1),

    /**
     * Indica que o arranjo deve ser classificado em ordem decrescente.
     */
    DECRESCENTE(2);

    /**
     * O valor numérico associado à ordem.
     */
    private final int valor;

    /**
     * Construtor privado da enum Ordem.
     *
     * @param valor O valor numérico associado à ordem.
     */
    Ordem(int valor) {
        this.valor = valor;
    }

    /**
     * Retorna o valor numérico associado à ordem.
     *
     * @return O valor numérico da ordem.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Obtém a ordem correspondente ao valor numérico fornecido.
     *
     * @param valor O valor numérico da ordem.
     * @return A ordem correspondente ao valor, ou lança IllegalArgumentException se o valor for inválido.
     * @throws IllegalArgumentException Se o valor não corresponder a nenhuma ordem válida.
     */
    public static Ordem fromValor(int valor) {
        for (Ordem ordem : values()) {
            if (ordem.valor == valor) {
                return ordem;
            }
        }
        throw new IllegalArgumentException("Valor inválido para Ordem: " + valor);
    }
}
