package Observer;

import java.util.ArrayList;
import java.util.List;

public class MySubject implements ISubject {
    List<IObserver> observerList;

    public MySubject() {
        observerList = new ArrayList<>();
    }

    @Override
    public void register(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observerList) {
            observer.update("notified");
        }
    }
}
