package singleton.Singleton_implementation;

public class ThreadingTest {
    public static void main(String[] args) {
        /**
         * Not thread safe !!
         */
        for (int i = 0; i < 5; i++) {
            Thread1 thread = new Thread1();
            new Thread(thread).start();
        }
    }
}
