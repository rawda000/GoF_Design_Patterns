package Abstract_Factory;

public class PetTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("Pet Tiger says softly Halum!");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Tiger prefers playing in thee animal circus");
    }
}
