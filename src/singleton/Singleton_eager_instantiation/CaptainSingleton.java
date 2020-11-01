package singleton.Singleton_eager_instantiation;

/**
 * Thread Safe
 */
public final class CaptainSingleton {
    private static CaptainSingleton instance = new CaptainSingleton();

    private CaptainSingleton() {
        System.out.println("A new Captain has been created");
    }

    public static CaptainSingleton getInstance() {
        System.out.println("You have a captain for your team.");
        return instance;
    }

    public static void dummyMethod() {
        System.out.println("Inside dummy method");
    }
}
