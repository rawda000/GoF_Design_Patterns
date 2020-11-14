package Visitor.modified_visitor;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Modified Visitor Pattern ***");
        IEmployee iEmployee = new SimpleEmployee();
        ((SimpleEmployee) iEmployee).setYearsOfExperience(15);
        ((SimpleEmployee) iEmployee).setName("Yasser");
        IVisitor visitor = new ConcreteVisitor();
        iEmployee.acceptVisit(visitor);

        iEmployee = new CompositeEmployee();
        ((CompositeEmployee) iEmployee).setYearsOfExperience(5);
        ((CompositeEmployee) iEmployee).setName("Omar");
        iEmployee.acceptVisit(visitor);
    }
}
