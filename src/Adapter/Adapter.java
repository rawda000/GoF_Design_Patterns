package Adapter;

public class Adapter implements IRectangle {
    private Triangle triangle;

    public Adapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void aboutRectangle() {
        this.triangle.aboutTriangle();
    }

    @Override
    public double calcAreaOfRectangle() {
        return 2.0 * this.triangle.calcAreaOfTriangle();
    }
}
