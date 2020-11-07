package Bridge;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Bridge Pattern Demo ***");
        System.out.println("Dealing with TV now");
        System.out.println("On state");
        State state = new OnState();
        ElectronicGoods electronicGoods = new TV(state);
        electronicGoods.moveToCurrentState();
        electronicGoods.hardButtonPress();
        System.out.println("--------------------------------");
        System.out.println("Off state");
        state = new OffState();
        electronicGoods.setState(state);
        electronicGoods.moveToCurrentState();
        electronicGoods.hardButtonPress();
        System.out.println("--------------------------------");
        System.out.println("Dealing with DVD now");
        System.out.println("On state");
        state = new OnState();
        electronicGoods = new DVD(state);
        electronicGoods.moveToCurrentState();
        electronicGoods.hardButtonPress();
        ((DVD) electronicGoods).doublePress();
        System.out.println("--------------------------------");
        System.out.println("Off state");
        state = new OffState();
        electronicGoods.setState(state);
        electronicGoods.moveToCurrentState();
        electronicGoods.hardButtonPress();
        ((DVD) electronicGoods).doublePress();
    }
}
