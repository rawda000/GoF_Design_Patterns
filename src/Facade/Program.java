package Facade;

public class Program {
    public static void main(String[] args) {
        System.out.println("Facade Pattern implementation");
        System.out.println("------------------------------------------");
        RobotFacade robotFacade1 = new RobotFacade();
        robotFacade1.createMilanoRobot();
        robotFacade1.createRobonautRobot();
        robotFacade1.destroyMilanoRobot();
        robotFacade1.destroyRobonautRobot();
    }
}
