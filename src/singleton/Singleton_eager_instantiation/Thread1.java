package singleton.Singleton_eager_instantiation;

public class Thread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running");
        CaptainSingleton captainSingleton = CaptainSingleton.getInstance();
    }
}
