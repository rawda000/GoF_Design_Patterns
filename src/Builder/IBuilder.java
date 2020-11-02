package Builder;

public interface IBuilder {
    void startOperation();

    void addBody();

    void addWheels();

    Product getVehicle();
}
