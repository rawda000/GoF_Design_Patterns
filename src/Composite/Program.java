package Composite;

/**
 * Compose objects into tree structures to represent part-whole hierarchies.
 * Composite lets clients treat individual objects and compositions of objects uniformly.
 */

public class Program {
    public static void main(String[] args) {
        IEmployee employee1 = new SimpleIEmployee("Rawda Yasser", "Math");
        IEmployee employee2 = new SimpleIEmployee("Fatma Yasser", "CS");
        IEmployee employee3 = new SimpleIEmployee("Diaa Yasser", "IT");
        IEmployee owner = new CompositeIEmployee("Omar Yasser", "Engineering");
        ((CompositeIEmployee) owner).addEmployee(employee1);
        ((CompositeIEmployee) owner).addEmployee(employee2);
        ((CompositeIEmployee) owner).addEmployee(employee3);
        employee1.printStructure();
        owner.printStructure();
        IEmployee owner2 = new CompositeIEmployee("Yasser Mohamed", "Chemistry");
        ((CompositeIEmployee) owner2).addEmployee(owner);
        owner2.printStructure();
    }
}
