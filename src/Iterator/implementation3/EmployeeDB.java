package Iterator.implementation3;

import java.util.LinkedList;

public class EmployeeDB implements DataBase {
    private LinkedList<Employee> employees;
    public void createEmployees() {
        employees = new LinkedList<>();
        employees.add(new Employee("Omar", 3200, 23));
        employees.add(new Employee("Fatma", 6000, 15));
        employees.add(new Employee("Diaa", 5000, 12));
    }

    @Override
    public EmployeesIterator createEmployeesIterator() {
        createEmployees();
        return new EmployeesIterator(employees);
    }
}
