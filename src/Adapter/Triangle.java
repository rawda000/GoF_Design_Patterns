package Adapter;

public class Triangle implements ITriangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Triangle Object with base " + this.base
                + " height = " + this.height + " unit");
    }

    @Override
    public double calcAreaOfTriangle() {
        return 0.5 * this.base * this.height;
    }
}
