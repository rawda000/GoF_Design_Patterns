package Bridge;

public class OffState implements State {
    @Override
    public void moveState() {
        System.out.println("Off State");
    }

    @Override
    public void hardPress() {
        System.out.println("The device is already off. Do not press the off button very hard");
    }
}
