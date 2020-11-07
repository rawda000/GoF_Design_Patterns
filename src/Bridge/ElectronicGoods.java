package Bridge;

public abstract class ElectronicGoods {
    protected State state;

    public ElectronicGoods(State state) {
        this.state = state;
    }

    public ElectronicGoods() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void moveToCurrentState() {
        System.out.print("The electronic device is functioning at : ");
        state.moveState();
    }

    public void hardButtonPress() {
        state.hardPress();
    }
}
