package Strategy;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Strategy Pattern Demo ***");
        Vehicle vehicle = new Boat();
        vehicle.showMe();
        vehicle.showTransportMedium();
        System.out.println("____________");
        vehicle = new Aeroplane();
        vehicle.showMe();
        vehicle.showTransportMedium();
        System.out.println("____________");
    }
}
