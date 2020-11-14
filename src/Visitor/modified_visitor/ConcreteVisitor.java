package Visitor.modified_visitor;

public class ConcreteVisitor implements IVisitor{
    @Override
    public void visitSimpleEmployee(SimpleEmployee employee) {
        boolean isEligible = employee.getYearsOfExperience() > 10 ? true : false;
        System.out.println("Employee " + employee.getName() + (isEligible? " is eligible " : " is not eligible" ));
    }

    @Override
    public void visitCompositeEmployee(CompositeEmployee employee) {
        boolean isEligible = employee.getYearsOfExperience() > 10 ? true : false;
        System.out.println("Employee " + employee.getName() + (isEligible? " is eligible " : " is not eligible" ));
    }
}
