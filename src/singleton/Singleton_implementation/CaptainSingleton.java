package singleton.Singleton_implementation;

/**
 * Not Thread Safe
 */
public final class CaptainSingleton {
    private static CaptainSingleton instance;

    private CaptainSingleton() {
        System.out.println("A new Captain has been created");
    }

    public static CaptainSingleton getInstance() {
        if (instance == null) {
            instance = new CaptainSingleton();
        } else {
            System.out.println("A captain already exists");
        }
        return instance;
    }
}
