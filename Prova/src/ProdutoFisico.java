public class ProdutoFisico extends Produto {

    private double peso;

    public ProdutoFisico(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularTotal(int i = 0) {

        switch (peso) {
            case "2kg":
                return getPreco() + 5;
            case "5kg":
                return getPreco() + 10;
            case "Acima 5kg":
                return getPreco() + getQuantidade() * 2.5;
        }
    }
}

