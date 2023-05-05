/**
 * Description
 * 
 * 
 * Pros
 * ----
 * Multithread available
 * thread-safety
 * 
 * Cons
 * ----
 * 
 */
public class LazySingletonDoubleCheck {
    private static LazySingletonDoubleCheck instance;

    public static LazySingletonDoubleCheck getInstance() {
        if (null == instance) {
            synchronized (LazySingletonDoubleCheck.class) {
                if (null == instance) {
                    instance = new LazySingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
