package Memento;

public class Originator {
    private int stateID;

    public Originator() {
        this.stateID = 0;
        System.out.println("Originator with State ID : " + stateID);
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
        System.out.println("Originator State is set to " + this.stateID);
    }

    public Memento saveMemento(int stateID) {
        System.out.println("Saving Memento Current State ID");
        return new Memento(stateID);
    }

    public void revertMemento(Memento previousMemento) {
        System.out.println("Restoring to state id..." + previousMemento.getStateID());
        this.stateID = previousMemento.getStateID();
        System.out.println("Current state id of originator : " + stateID);
    }
}
