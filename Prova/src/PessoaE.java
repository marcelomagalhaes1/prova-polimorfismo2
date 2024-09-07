public class PessoaE extends Cliente {

    private String identificacao;

    public PessoaE(String nome, String telefone, String endereco, String identificacao, int quantidadeProdutos) {
        super(nome, telefone, endereco, quantidadeProdutos);
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

}