package Visitor.modified_visitor;

public interface IEmployee {
    void printEmployee();

    void acceptVisit(IVisitor visitor);
}
