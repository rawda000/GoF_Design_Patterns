package singleton.Singleton_thread_safe;

public class Main {
    public static void main(String[] args) {
        CaptainSingleton captain1 = CaptainSingleton.getInstance();
        CaptainSingleton captain2 = CaptainSingleton.getInstance();
        if (captain1 == captain2) {
            System.out.println("Captain1 and Captain2 are the same instance");
        }
    }
}
