package EmployeeManagerDeveloper;

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void increaseSalary() {
        double increasedSalary = getSalary() * 1.2; // Increase salary by 20%
        setSalary(increasedSalary);
    }
}
