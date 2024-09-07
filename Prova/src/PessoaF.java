public class PessoaF extends Cliente {

    private String cpf;

    public PessoaF(String nome, String telefone, String endereco, String cpf, int quantidadeProdutos) {
        super(nome, telefone, endereco, quantidadeProdutos);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public int getQuantidadeProdutos() {
        if (getQuantidadeProdutos() > 3) ;
        return super.getQuantidadeProdutos();
    }
}
