package Visitor.modified_visitor;

public interface IVisitor {
    void visitSimpleEmployee(SimpleEmployee employee);

    void visitCompositeEmployee(CompositeEmployee employee);
}
