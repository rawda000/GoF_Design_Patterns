package Flyweight;

public class LargeRobot implements Robot {
    private String robotTypeCreated;

    public LargeRobot() {
        robotTypeCreated = "A large robot type created";
        System.out.print(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with color : " + color);
    }
}
