package Decorator;

public class AddFloorDecorator extends AbstractDecorator {

    public AddFloorDecorator() {

    }

    @Override
    public void makeHouse() {
        super.makeHouse();
        addFloor();
    }

    private void addFloor() {
        System.out.println("A floor is added to the house");
    }
}
