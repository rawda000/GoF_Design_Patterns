package Prototype;

public class Ford extends BasicCar {
    private double basePrice = 100000;

    public Ford(String modelName) {
        super(modelName);
    }

    @Override
    protected Ford clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
