package State;

public class Program {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo ***");
        TV tv = new TV();
        System.out.println("User is pressing buttons in the following order : on -> off -> mute -> "
                + "off -> on -> mute");
        tv.pressOnButton();
        tv.pressOffButton();
        tv.pressMuteButton();
        tv.pressMuteButton();
        tv.pressOffButton();
        tv.pressOnButton();
        tv.pressMuteButton();
    }
}
