/*
 * Description
 * -----------
 * The instance of the singleton class is created at the time of class loading.
 * If your singleton class is not using a lot of resources, this is the approach to use.
 * 
 * But in most of the scenarios, singleton classes are created for resources 
 * such as File System, Database connections, etc. 
 * We should avoid the instantiation unless the client calls the getInstance method
 * 
 * Pros
 * ----
 * Thread-safe because used for final keyword and creates class in class loading.
 * 
 * Cons
 * ----
 * It is that the method is created even though the client application might not be using it.
 * This method doesn’t provide any options for exception handling.
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getIstance() {
        return instance;
    }
}