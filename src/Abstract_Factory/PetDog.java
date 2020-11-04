package Abstract_Factory;

public class PetDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Pet dog says softly bow bow!");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Dog prefers staying at home");
    }
}
