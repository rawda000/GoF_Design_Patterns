package Prototype;

public class Nano extends BasicCar {
    private double basePrice = 100000;

    public Nano(String modelName) {
        super(modelName);
    }


    @Override
    protected Nano clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }
}
