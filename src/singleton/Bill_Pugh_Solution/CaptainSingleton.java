package singleton.Bill_Pugh_Solution;

/**
 *  Thread Safe
 */
public final class CaptainSingleton {
    private CaptainSingleton() {
        System.out.println("A new Captain has been created");
    }

    public static CaptainSingleton getInstance() {
        System.out.println("You have a captain for your team.");
        return SingletonHelper.instance;
    }

    public static void dummyMethod() {
        System.out.println("Inside dummy method");
    }

    private static final class SingletonHelper {
        private static final CaptainSingleton instance = new CaptainSingleton();
    }
}
