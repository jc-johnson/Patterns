package main.java.Singleton;

/**
 * Created by jjohnson on 2/10/2016.
 */
public class Singleton {
    // Private constructor prevents instantiation from other classes
    private Singleton() {}

    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to Singleton.INSTANCE, not before.
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
