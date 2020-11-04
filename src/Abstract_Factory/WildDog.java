package Abstract_Factory;

public class WildDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Wild dog speaks loudly bow bow!");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild dog prefers staying in the jungle");
    }
}
