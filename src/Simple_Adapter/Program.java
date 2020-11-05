package Simple_Adapter;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Adapter Pattern Demo ***");
        Triangle triangle = new Triangle(12.0, 20.0);
        Adapter adapter = new Adapter();
        double area = adapter.getArea(triangle);
        System.out.println("Triangle area " + area);
    }
}
