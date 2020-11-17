package State;

public class TV {
    private PossibleState currentState;

    public TV() {
        currentState = new Off();
    }

    public PossibleState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PossibleState currentState) {
        this.currentState = currentState;
    }

    public void pressOnButton() {
        this.currentState.pressOn(this);
    }

    public void pressOffButton() {
        this.currentState.pressOff(this);
    }

    public void pressMuteButton() {
        this.currentState.pressMute(this);
    }
}
