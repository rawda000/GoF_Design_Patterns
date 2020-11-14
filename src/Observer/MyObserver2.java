package Observer;

public class MyObserver2 implements IObserver {
    @Override
    public void update(String msg) {
        System.out.println("Observer 2 " + msg);
    }
}
