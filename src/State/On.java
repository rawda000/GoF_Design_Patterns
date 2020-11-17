package State;

public class On implements PossibleState {

    @Override
    public void pressOn(TV context) {
        System.out.println("current state : " + context.getCurrentState());
        System.out.println("You pressed On button");
        System.out.println("Current state is same : " + context.getCurrentState());
        System.out.println("----------------------------------------------");
    }

    @Override
    public void pressOff(TV context) {
        System.out.println("current state : " + context.getCurrentState());
        System.out.println("You pressed Off button");
        context.setCurrentState(new Off());
        System.out.println("Current state : " + context.getCurrentState());
        System.out.println("----------------------------------------------");

    }

    @Override
    public void pressMute(TV context) {
        System.out.println("current state : " + context.getCurrentState());
        System.out.println("You pressed Mute button");
        context.setCurrentState(new Mute());
        System.out.println("Current state : " + context.getCurrentState());
        System.out.println("----------------------------------------------");
    }

    @Override
    public String toString() {
        return "On State";
    }
}
