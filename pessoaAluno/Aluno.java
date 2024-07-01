package pessoaAluno;

class Aluno extends Pessoa {
    private String curso;

    // Construtor da classe Aluno
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    // Método para mostrar os dados do aluno
    @Override
    public void mostraDados() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Curso do aluno: " + curso);
    }
}