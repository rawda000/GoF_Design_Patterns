package Prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    private String modelName;
    private double basePrice, onRoadPrice;

    public BasicCar(String modelName) {
        this.modelName = modelName;
    }

    public BasicCar() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getOnRoadPrice() {
        return onRoadPrice;
    }

    public void setOnRoadPrice(double onRoadPrice) {
        this.onRoadPrice = onRoadPrice;
    }

    public static double setAdditionalPrice() {
        return new Random().nextDouble() * 100000;
    }

    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
