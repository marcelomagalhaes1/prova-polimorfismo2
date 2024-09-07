public class PessoaJ extends Cliente {

    private String cnpj;
    private String representante;

    public PessoaJ(String nome, String telefone, String endereco, String cnpj, String representante, int quantidadeProdutos) {
        super(nome, telefone, endereco, quantidadeProdutos);
        this.cnpj = cnpj;
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public int getQuantidadeProdutos() {
        if (getQuantidadeProdutos() > 10) ;
        return super.getQuantidadeProdutos();
    }
}
