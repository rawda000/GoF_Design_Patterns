package Memento;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Memento Pattern Demo ***");
        Originator originator = new Originator();
        Memento memento;
        originator.setStateID(1);
        memento = originator.saveMemento(originator.getStateID());
        originator.setStateID(3);
        originator.revertMemento(memento);
    }
}
