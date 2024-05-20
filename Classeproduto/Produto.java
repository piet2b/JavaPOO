package Classeproduto;

public class Produto {
    public String nome;
    public String descricao;
    public String codigo;
    public float preco;

    Produto(String nome, String descricao, String codigo, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void mostrarDadosProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
    }

    public float calcularTotal(int quantidade) {
        return quantidade * preco;
    }
}
