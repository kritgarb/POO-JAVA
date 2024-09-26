public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    private int codigoProduto;
    private String categoria;

    public Produto(String nome, double preco, int quantidadeEmEstoque, int codigoProduto, String categoria) {
        if (preco < 0 || quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("Preço e quantidade em estoque devem ser não negativos.");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.codigoProduto = codigoProduto;
        this.categoria = categoria;
    }

    public void atualizarEstoque(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidadeEmEstoque = novaQuantidade;
        } else {
            throw new IllegalArgumentException("Quantidade em estoque não pode ser negativa.");
        }
    }

    public void mostrarInformacoes() {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Preço: R$%.2f%n", preco);
        System.out.printf("Estoque: %d unidades%n", quantidadeEmEstoque);
        System.out.printf("Código do Produto: %d%n", codigoProduto);
        System.out.printf("Categoria: %s%n", categoria);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Caneta Bic", 2.50, 100, 12345, "Papelaria");
        produto.mostrarInformacoes();
        produto.atualizarEstoque(50);
        produto.mostrarInformacoes();
    }
}