package State;

public class Mute implements PossibleState {
    @Override
    public void pressOn(TV context) {
        System.out.println("current state : " + context.getCurrentState());
        System.out.println("You pressed On button");
        context.setCurrentState(new On());
        System.out.println("Current state : " + context.getCurrentState());
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
        System.out.println("Current state is the same : " + context.getCurrentState());
        System.out.println("----------------------------------------------");
    }

    @Override
    public String toString() {
        return "Mute State";
    }
}
