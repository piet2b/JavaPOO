package pessoaAluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa;

        // Pergunta ao usuário se ele deseja instanciar uma pessoa ou um aluno
        System.out.println("Deseja instanciar uma Pessoa ou um Aluno? (P/A)");
        String escolha = scanner.nextLine();

        // Lógica para criar o objeto correspondente
        if (escolha.equalsIgnoreCase("A")) {
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do aluno:");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            System.out.println("Digite o curso do aluno:");
            String curso = scanner.nextLine();

            pessoa = new Aluno(nome, idade, curso);
        } else {
            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade da pessoa:");
            int idade = scanner.nextInt();

            pessoa = new Pessoa(nome, idade);
        }

        // Chama o método mostraDados() para exibir os dados
        pessoa.mostraDados();
        scanner.close();
    }
}