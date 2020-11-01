package singleton.Singleton_implementation;

public class Thread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running");
        CaptainSingleton captainSingleton = CaptainSingleton.getInstance();
    }
}
