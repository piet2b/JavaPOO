package StudentCourseUniversity;

public class Main {
    public static void main(String[] args) {
        // Criando uma universidade
        University university = new University("Universidade XYZ");

        // Adicionando cursos à universidade
        Course course1 = new Course("Engenharia de Software", 101);
        Course course2 = new Course("Ciência da Computação", 102);
        university.addCourse(course1);
        university.addCourse(course2);

        // Criando alunos
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Matriculando os alunos nos cursos
        course1.addStudent(student1);
        course2.addStudent(student2);

        // Exibindo informações
        System.out.println("Nome da universidade: " + university.getNameUniversity());
        System.out.println("Total de cursos: " + university.getTotalCourses());
        System.out.println("Total de alunos: " + university.getTotalStudents());

        System.out.println("\nCursos oferecidos pela universidade:");
        university.getNameCourses();

        System.out.println("\nAlunos matriculados no curso de Engenharia de Software:");
        course1.getCourseStudents();
    }
}
