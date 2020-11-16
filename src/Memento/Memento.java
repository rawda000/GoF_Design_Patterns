package Memento;

public class Memento {
    private int stateID;

    public Memento(int stateID) {
        this.stateID = stateID;
    }

    public int getStateID() {
        return stateID;
    }
}
