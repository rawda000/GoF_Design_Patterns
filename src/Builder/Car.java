package Builder;

public class Car implements IBuilder {
    private Product product;
    private String name;

    public Car(String name) {
        this.name = name;
        this.product = new Product(name);
    }

    @Override
    public void startOperation() {
        product.add("started building " + name);
    }

    @Override
    public void addBody() {
        product.add("added body to " + name);

    }

    @Override
    public void addWheels() {
        product.add("added 4 wheels to " + name);

    }

    @Override
    public Product getVehicle() {
        return product;
    }

}
