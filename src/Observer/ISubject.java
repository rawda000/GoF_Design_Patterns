package Observer;

public interface ISubject {
    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyObservers();
}
