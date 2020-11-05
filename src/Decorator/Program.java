package Decorator;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Decorator Pattern Code Snippets ***");
        Component component = new ConcreteComponent();
        component.makeHouse();
        System.out.println("____________________________");
        System.out.println("Using a decorator now");
        AbstractDecorator paintDecorator = new PaintDecorator();
        paintDecorator.setComponent(component);
        paintDecorator.makeHouse();
        System.out.println("____________________________");
        System.out.println("Adding a floor");
        AddFloorDecorator addFloorDecorator = new AddFloorDecorator();
        addFloorDecorator.setComponent(paintDecorator);
        addFloorDecorator.makeHouse();
    }
}
