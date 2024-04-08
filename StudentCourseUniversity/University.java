package StudentCourseUniversity;

import java.util.ArrayList;
import java.util.List;

public class University {
    public String name_university;
    public String description;
    List<Course> courses;

    public University(String name_university) {
        this.name_university = name_university;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public String getNameUniversity() {
        return name_university;
    }

    public void getNameCourses() {
        for (Course c : courses) {
            System.out.println(c.getNameCourse());
        }
    }

    public int getTotalCourses() {
        return courses.size();
    }

    public int getTotalStudents() {
        int numberOfStudents = 0;
        for (Course c : courses) {
            numberOfStudents += c.students.size();
        }
        return numberOfStudents;
    }
}
