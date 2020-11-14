package Visitor;

public class MyClass implements IOriginalInterface {
    private int myInt;

    public MyClass() {
        myInt = 5;
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getMyInt() {
        return myInt;
    }
}
