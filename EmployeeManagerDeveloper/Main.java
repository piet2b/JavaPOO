package EmployeeManagerDeveloper;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 5000.0);
        Developer developer = new Developer("Alice", 4000.0);

        manager.increaseSalary();
        developer.increaseSalary();

        System.out.println("Manager's Name: " + manager.getName());
        System.out.println("Manager's Salary: " + manager.getSalary());

        System.out.println("Developer's Name: " + developer.getName());
        System.out.println("Developer's Salary: " + developer.getSalary());
    }
}
