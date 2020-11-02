package Builder;

public class MotorCycle implements IBuilder {
   private Product product;
   private String name;

    public MotorCycle(String name) {
        this.name = name;
        product = new Product(name);
    }

    @Override
    public void startOperation() {
        product.add("started operation");
    }

    @Override
    public void addBody() {
        product.add("added body to " + name);
    }

    @Override
    public void addWheels() {
        product.add("added 2 wheels to " + name);
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
