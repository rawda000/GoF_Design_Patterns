package Visitor;

public class ConcreteVisitor implements IVisitor {
    @Override
    public void visit(MyClass myClass) {
        System.out.println("Inside Concrete Visitor");
        System.out.println("MyInt value " + myClass.getMyInt() * 2);
    }
}
