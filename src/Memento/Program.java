package Memento;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Memento Pattern Demo ***");
        Originator originator = new Originator();
        Memento memento;
        originator.setStateID(1);
        memento = originator.saveMemento(originator.getStateID());
        originator.setStateID(3);
        originator.revertMemento(memento);
        System.out.println("-----------------------------------");
        List<Memento> mementoList = new ArrayList<>();
        originator.setStateID(4);
        memento = originator.saveMemento(originator.getStateID());
        mementoList.add(memento);
        originator.setStateID(5);
        memento = originator.saveMemento(originator.getStateID());
        mementoList.add(memento);
        originator.setStateID(6);
        memento = originator.saveMemento(originator.getStateID());
        mementoList.add(memento);
        for (int i = mementoList.size() - 1; i >= 0; i--) {
            originator.revertMemento(mementoList.get(i));
        }
    }
}
