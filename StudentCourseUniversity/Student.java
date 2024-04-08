package StudentCourseUniversity;

public class Student {
    public String name_student;
    public String enrollment;
    public Course course;

    public Student(String name_student) {
        this.name_student = name_student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getNameStudent() {
        return name_student;
    }
}
