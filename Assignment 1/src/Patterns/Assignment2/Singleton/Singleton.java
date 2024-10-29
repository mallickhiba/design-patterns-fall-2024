package Patterns.Assignment2.Singleton;
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            Class var0 = Singleton.class;
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        System.out.println("Singleton instance: " + singletonInstance);
    }
}
