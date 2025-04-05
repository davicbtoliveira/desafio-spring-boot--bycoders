package spring.boot.desafio.cnab.model;

public enum TipoTransacao {
    DEBITO(1, "Debito","Entrada", "+"),
    BOLETO(2, "Boleto","Saida", "-"),
    FINANCIAMENTO(3, "Financiamento","Saida", "-"),
    CREDITO(4, "Credito","Entrada", "+"),
    RECEBIMENTO_EMPRESTIMO(5, "Recebimento Emprestimos","Entrada", "+"),
    VENDAS(6, "Vendas","Entrada", "+"),
    RECEBIMENTO_TED(7, "Recebimento Ted","Entrada", "+"),
    RECEBIMENTO_DOC(8, "Recebimento Doc","Entrada", "+"),
    ALUGUEL(9, "Aluguel","Saida", "-");

    private final int codigo;
    private final String descricao;
    private final String natureza;
    private final String sinal;

    TipoTransacao(int codigo, String descricao, String natureza, String sinal){
        this.codigo = codigo;
        this.descricao = descricao;
        this.natureza = natureza;
        this.sinal = sinal;
    }

    public static TipoTransacao fromCodigo(int codigo){
        for(TipoTransacao tipo : TipoTransacao.values()) {
            if (tipo.codigo == codigo) {
                return tipo;
            }
        }

        throw new IllegalArgumentException("Tipo de Transacao Invalida");
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNatureza() {
        return natureza;
    }

    public String getSinal() {
        return sinal;
    }

}
