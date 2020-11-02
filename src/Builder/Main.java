package Builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Builder Pattern ***");
        IBuilder builder = new Car("Car");
        Director director = new Director();
        director.construct(builder);
        Product product = builder.getVehicle();
        product.displayProduct();

        builder = new MotorCycle("MotorCycle");
        director.construct(builder);
        product = builder.getVehicle();
        product.displayProduct();
    }
}
