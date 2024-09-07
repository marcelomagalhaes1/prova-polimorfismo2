public abstract class Cliente {

    private String nome;
    private String telefone;
    private String endereco;
    private int quantidadeProdutos;

    public Cliente(String nome, String telefone, String endereco, int quantidadeProdutos) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.quantidadeProdutos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeprodutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }
}
