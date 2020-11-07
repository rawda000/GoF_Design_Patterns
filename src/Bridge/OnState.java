package Bridge;

public class OnState implements State {
    @Override
    public void moveState() {
        System.out.println("On State");
    }

    @Override
    public void hardPress() {
        System.out.println("The device is already on. Don't press the on button so hard");
    }
}
