package Facade;

public class RobotFacade {
    private RobotBody robotBody;
    private RobotHands robotHands;
    private RobotColor robotColor;

    public RobotFacade() {
        robotBody = new RobotBody();
        robotHands = new RobotHands();
        robotColor = new RobotColor();
    }

    public void createMilanoRobot() {
        System.out.println("Started to create Milano Robot");
        robotBody.createRobot();
        robotColor.setDefaultColor();
        robotHands.setMilanoHand();
        robotBody.createHands();
        robotBody.createRemainingParts();
        System.out.println("Milano Robot Creation Ends");
        System.out.println("------------------------------------------");
    }

    public void createRobonautRobot() {
        System.out.println("Started to create Robonaut Robot");
        robotBody.createRobot();
        robotColor.setGreenColor();
        robotHands.setRobonautHand();
        robotBody.createHands();
        robotBody.createRemainingParts();
        System.out.println("Robonaut Robot Creation Ends");
        System.out.println("------------------------------------------");

    }

    public void destroyMilanoRobot() {
        System.out.println("Started to destroy Milano Robot");
        robotBody.destroyRobot();
        robotHands.resetMilanoHand();
        robotBody.destroyHands();
        robotBody.destroyParts();
        System.out.println("Milano Robot destroy Ends");
        System.out.println("------------------------------------------");

    }

    public void destroyRobonautRobot() {
        System.out.println("Started to destroy Robonaut Robot");
        robotBody.destroyRobot();
        robotHands.resetRobonautHand();
        robotBody.destroyHands();
        robotBody.destroyParts();
        System.out.println("Robonaut Robot destroy Ends");
        System.out.println("------------------------------------------");

    }
}
