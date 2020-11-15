package Strategy;

public class WaterTransport implements TransportMedium {
    @Override
    public void transport() {
        System.out.println("I'm transporting in water");
    }
}
