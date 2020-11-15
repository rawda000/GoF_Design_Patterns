package Strategy;

public abstract class Vehicle {
    protected TransportMedium transportMedium;

    public void showTransportMedium() {
        transportMedium.transport();
    }

    public void commonJob() {
        System.out.println("We all can be used to transport");
    }

    public abstract void showMe();

    public void setTransportMedium(TransportMedium transportMedium) {
        this.transportMedium = transportMedium;
    }
}
