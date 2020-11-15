package Strategy;

public class Boat extends Vehicle{
    public Boat() {
        transportMedium = new WaterTransport();
    }

    @Override
    public void showMe() {
        System.out.println("I'm a boat");
    }
}
