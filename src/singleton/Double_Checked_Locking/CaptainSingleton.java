package singleton.Double_Checked_Locking;

/**
 * Thread Safe
 */
public final class CaptainSingleton {
    private static CaptainSingleton instance;

    private CaptainSingleton() {
        System.out.println("A new Captain has been created");
    }

    public static CaptainSingleton getInstance() {
        if (instance == null) {
            synchronized (CaptainSingleton.class) {
                if (instance == null) {
                    instance = new CaptainSingleton();
                } else {
                    System.out.println("You have already a captain for your team");
                }
            }
        }
        return instance;
    }

    public static void dummyMethod() {
        System.out.println("Inside dummy method");
    }
}
