package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String, Robot> robotMap = new HashMap<>();

    public RobotFactory() {
    }

    public int totalObjectsCreated() {
        return robotMap.size();
    }

    public synchronized Robot getRobotFromFactory(String type) throws Exception {
        Robot robot = robotMap.get(type);
        if (robot == null) {
            if (type.equals("small")) {
                System.out.println("We do not have a small robot right now so we will " +
                        "create one");
                robot = new SmallRobot();
            } else if (type.equals("large")) {
                System.out.println("We do not have a large robot right now so we will " +
                        "create one");
                robot = new LargeRobot();

            } else if (type.equals("fixed")) {
                System.out.println("We do not have a fixed robot right now so we will " +
                        "create one");
                robot = new FixedSizeRobot();
            } else {
                throw new Exception("Root factory can only create small, large or fixed robots");
            }
            robotMap.put(type, robot);
        } else {
            System.out.println("Using existing robot of type " + type + " and coloring it");
        }
        return robot;
    }
}
