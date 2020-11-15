package Strategy;

public class AirTransport implements TransportMedium {
    @Override
    public void transport() {
        System.out.println("I'm transporting in Air");
    }
}
