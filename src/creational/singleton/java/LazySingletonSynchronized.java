/**
 * Description
 * A simple way to create a thread-safe singleton class is to make the global
 * access method synchronized so that only one thread can execute this method at
 * a time.
 * 
 * 
 * Pros
 * ----
 * Multithread available
 * thread-safety
 * 
 * Cons
 * ----
 * Reduces the performance because of the cost associated with the synchronized
 * method
 * 
 */
public class LazySingletonSynchronized {
    private static LazySingletonSynchronized INSTANCE;

    public static synchronized LazySingletonSynchronized getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new LazySingletonSynchronized();
        }
        return INSTANCE;
    }
}
