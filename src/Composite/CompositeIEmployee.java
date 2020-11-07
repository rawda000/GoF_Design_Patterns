package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeIEmployee implements IEmployee {
    private List<IEmployee> IEmployees;
    private String name;
    private String department;
    private int count = 0;

    public CompositeIEmployee() {
        IEmployees = new ArrayList<>();
    }

    public CompositeIEmployee(String name, String department) {
        this.name = name;
        this.department = department;
        this.IEmployees = new ArrayList<>();
    }

    public List<IEmployee> getIEmployees() {
        return IEmployees;
    }

    public void setIEmployees(List<IEmployee> IEmployees) {
        this.IEmployees = IEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addEmployee(IEmployee IEmployee) {
        IEmployees.add(IEmployee);
        this.count++;
    }

    public void remove(IEmployee IEmployee) {
        IEmployees.remove(IEmployee);
        this.count--;
    }

    @Override
    public void printStructure() {
        System.out.println("Composite Employee name: " + this.name
                + "\nworks in department: "
                + this.department + "\nnumber of employees: " + this.getEmployeeCount());
        System.out.println("___________________________________________");
        for (IEmployee IEmployee : IEmployees) {
            IEmployee.printStructure();
        }
        System.out.println("___________________________________________");

    }

    @Override
    public int getEmployeeCount() {
        for (IEmployee employee : IEmployees) {
            this.count += employee.getEmployeeCount();
        }
        return this.count;
    }
}
