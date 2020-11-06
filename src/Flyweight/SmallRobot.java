package Flyweight;

public class SmallRobot implements Robot {
    // robotTypeCreated is intrinsic
    private final String robotTypeCreated;

    public SmallRobot() {
        robotTypeCreated = "A small robot created";
        System.out.print(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with color : " + color);
    }
}
