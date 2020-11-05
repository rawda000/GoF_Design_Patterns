package Decorator;

public class PaintDecorator extends AbstractDecorator {
    public PaintDecorator() {
    }

    @Override
    public void makeHouse() {
        super.makeHouse();
        paintHouse();
    }

    public void paintHouse() {
        System.out.println("The House is being painted");
    }
}
