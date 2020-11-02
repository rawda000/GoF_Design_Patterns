package Builder;

public class Director {
    public void construct(IBuilder builder) {
        builder.startOperation();
        builder.addBody();
        builder.addWheels();
    }
}
