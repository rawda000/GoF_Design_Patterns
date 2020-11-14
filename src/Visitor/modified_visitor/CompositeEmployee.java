package Visitor.modified_visitor;


import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee {
    private List<IEmployee> employees;
    private String name = "";
    private int yearsOfExperience = 0;
    public CompositeEmployee() {
        employees = new ArrayList<>();
    }

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    public void removeEmployee(IEmployee employee) {
        employees.remove(employee);
    }

    @Override
    public void printEmployee() {
        for (IEmployee employee : employees) {
            employee.printEmployee();
        }
    }

    @Override
    public void acceptVisit(IVisitor visitor) {
        visitor.visitCompositeEmployee(this);
    }

    public List<IEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<IEmployee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
