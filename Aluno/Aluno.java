package Aluno;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[] notas;

    public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

    public boolean isAprovado(int indiceDisciplina) {
        if (indiceDisciplina < 0 || indiceDisciplina >= notas.length) {
            throw new IllegalArgumentException("Índice de disciplina inválido");
        }
        return notas[indiceDisciplina] >= 7.0;
    }

    public void mostrarResultados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Resultados das disciplinas:");
        for (int i = 0; i < disciplinas.length; i++) {
            String status = isAprovado(i) ? "Aprovado" : "Reprovado";
            System.out.println(disciplinas[i] + ": " + notas[i] + " - " + status);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Curso do aluno: ");
        String curso = scanner.nextLine();

        String[] disciplinas = new String[3];
        double[] notas = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome da disciplina " + (i + 1) + ": ");
            disciplinas[i] = scanner.nextLine();
            System.out.print("Nota da disciplina " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();  // Limpar o buffer
        }

        Aluno aluno = new Aluno(nome, matricula, curso, disciplinas, notas);
        aluno.mostrarResultados();

        scanner.close();
    }
}
