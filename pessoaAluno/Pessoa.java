package pessoaAluno;

class Pessoa {
    protected String nome;
    protected int idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para mostrar os dados da pessoa
    public void mostraDados() {
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Idade da pessoa: " + idade);
    }
}