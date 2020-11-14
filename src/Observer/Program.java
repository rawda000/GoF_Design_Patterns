package Observer;

public class Program {
    public static void main(String[] args) {
        System.out.println("*** Observer Pattern Demo ***");
        ISubject subject = new MySubject();
        IObserver observer1 = new MyObserver1();
        IObserver observer2 = new MyObserver2();
        subject.register(observer1);
        subject.register(observer2);
        subject.notifyObservers();
        subject.unregister(observer1);
        subject.notifyObservers();
    }
}
