package Proxy;

public class ConcreteSubject implements Subject {
    @Override
    public void doSomeWork() {
        System.out.println("Inside ConcreteSubject class : doSomeWork");
    }
}
