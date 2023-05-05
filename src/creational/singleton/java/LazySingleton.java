/*
 * Single Thread
 * Unthread-safe
 * 
 * Pros
 * ----
 * 
 * Cons
 * ----
 * Only current thread
 * Unthread-safe
 * 
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
