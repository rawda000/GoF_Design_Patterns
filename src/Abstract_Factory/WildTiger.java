package Abstract_Factory;

public class WildTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("Wild Tiger speaks loudly Halum!");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Tiger prefers hunting in the jungles");
    }
}
