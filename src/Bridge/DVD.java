package Bridge;

public class DVD extends ElectronicGoods {
    public DVD(State state) {
        super(state);
    }

    public void doublePress() {
        hardButtonPress();
        hardButtonPress();
    }
}
