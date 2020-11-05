package Adapter;

public class Rectangle implements IRectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void aboutRectangle() {
        System.out.println("Rectangle object with width = " + this.width
                + " height = " + this.height + " units");
    }

    @Override
    public double calcAreaOfRectangle() {
        return width * height;
    }
}
