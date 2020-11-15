package Strategy;

public class Aeroplane extends Vehicle {

    public Aeroplane() {
        transportMedium = new AirTransport();
    }

    @Override
    public void showMe() {
        System.out.println("I'm Aeroplane");
    }
}
