/*
 * @Date 05.05.2023
 *  
 * Description
 * -----------
 * Static block initialization implementation is similar to eager initialization, except that 
 * instance of the class is created in the static block that provides the option for exception handling.
 * 
 * Pros
 * ----
 * Avaiable exception handling.
 * 
 * Cons
 * ----
 * Both eager initialization and static block initialization create the instance even before 
 * it’s being used and that is not the best practice to use.
 * 
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        // static block initialization for exception handling
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating class " + StaticBlockSingleton.class.toString());
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
