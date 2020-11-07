package Composite;

public class SimpleIEmployee implements IEmployee {
    private String name;
    private String department;
    private int count;

    public SimpleIEmployee() {
        this.name = "undefined";
        this.department = "undefined";
        this.count = 1;
    }

    public SimpleIEmployee(String name, String department) {
        this.name = name;
        this.department = department;
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

    @Override
    public void printStructure() {
        System.out.println("Simple Employee");
        System.out.println("name: " + name + "\ndepartment: " + department + "\nEmployee count: " + count);
        System.out.println("___________________________________________");
    }

    @Override
    public int getEmployeeCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "SimpleEmployee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", count=" + count +
                '}';
    }
}
