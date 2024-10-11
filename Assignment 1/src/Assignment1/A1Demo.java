public class A1Demo {
    public static void main(String[] args) {
        int n = 5;
        ObjectPool pool = new ObjectPool(n);

        for (int i = 0; i < 10; i++) {
            new Thread(new Task(pool)).start();
        }
    }
}