package ProfessorClass;

public class Main {
    public static void main(String[] args) {
        // Criando um professor
        Professor professor = new Professor("João", 123);

        // Criando algumas disciplinas
        Course matematica = new Course("Matemática", 1);
        Course fisica = new Course("Física", 2);

        // Adicionando disciplinas ao professor
        professor.addCourse(matematica);
        professor.addCourse(fisica);

        // Adicionando disciplinas como pré-requisitos
        matematica.addCourseAsPrerequire(fisica);

        // Exibindo os pré-requisitos de uma disciplina
        System.out.println("Pré-requisitos para Matemática:");
        matematica.showAllPrerequireCourses();
    }
}

