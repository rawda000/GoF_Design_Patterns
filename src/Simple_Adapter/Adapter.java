package Simple_Adapter;

public class Adapter {
    public double getArea(Triangle triangle) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 0.5 * triangle.base;
        rectangle.height = triangle.height;
        double area = Calculator.getArea(rectangle);
        return area;
    }
}
