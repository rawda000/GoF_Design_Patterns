package Flyweight;

public class FixedSizeRobot implements Robot {
    private String robotTypeCreated;

    public FixedSizeRobot() {
        robotTypeCreated = "Fixed Size robot is created";
        System.out.print(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with color: blue (default)");
    }
}
