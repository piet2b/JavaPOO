package EmployeeManagerDeveloper;

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void increaseSalary() {
        double increasedSalary = getSalary() * 1.1; // Increase salary by 10%
        setSalary(increasedSalary);
    }
}
