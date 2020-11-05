package Adapter;

public class program {
    public static void main(String[] args) {
        System.out.println("*** Modified Adapter Pattern Demo");
        Rectangle rectangle = new Rectangle(20, 20);
        System.out.println("Rectangle area = " + rectangle.calcAreaOfRectangle());
        ITriangle triangle = new Triangle(20, 20);
        System.out.println("Triangle area = " + triangle.calcAreaOfTriangle());
        IRectangle adapter = new Adapter((Triangle) triangle);
        double area = adapter.calcAreaOfRectangle();
        System.out.println("Rectangle area using adapter " + area);

    }
}
