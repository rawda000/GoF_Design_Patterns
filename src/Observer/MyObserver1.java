package Observer;

public class MyObserver1 implements IObserver {
    @Override
    public void update(String msg) {
        System.out.println("Observer 1 " + msg);
    }
}
