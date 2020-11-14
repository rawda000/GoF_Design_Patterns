package Visitor;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Visitor Pattern Code ***");
        IVisitor iVisitor = new ConcreteVisitor();
        MyClass myClass = new MyClass();
        System.out.println("Original value " + myClass.getMyInt());
        iVisitor.visit(myClass);
    }
}
