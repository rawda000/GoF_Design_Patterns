package Flyweight;

import java.util.Random;

public class Program {
    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();
        Robot robot = robotFactory.getRobotFromFactory("small");
        robot.showMe(getRandColor());
        int numberOfObjects = robotFactory.totalObjectsCreated();
        System.out.println("Number of objects till now " + numberOfObjects);
        System.out.println("----------------------------------------------");
        robot = robotFactory.getRobotFromFactory("large");
        robot.showMe(getRandColor());
        numberOfObjects = robotFactory.totalObjectsCreated();
        System.out.println("Number of objects till now " + numberOfObjects);
        System.out.println("----------------------------------------------");
        robot = robotFactory.getRobotFromFactory("fixed");
        robot.showMe(getRandColor());
        numberOfObjects = robotFactory.totalObjectsCreated();
        System.out.println("Number of objects till now " + numberOfObjects);
        System.out.println("----------------------------------------------");
        // Cause exception
       /* robot = robotFactory.getRobotFromFactory("other");
        robot.showMe(getRandColor());
        numberOfObjects = robotFactory.totalObjectsCreated();
        System.out.println("Number of objects till now " + numberOfObjects);
        System.out.println("----------------------------------------------");*/
    }

    private static String getRandColor() {
        Random random = new Random();
        int r = random.nextInt();
        if (r % 2 == 0) {
            return "Red";
        } else {
            return "Green";
        }
    }
}
