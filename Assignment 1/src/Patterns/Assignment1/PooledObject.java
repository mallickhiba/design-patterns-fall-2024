package Patterns.Assignment1;
public class PooledObject {
    private final int id;

    public PooledObject(int id) {
        this.id = id;
    }

    public void use() {
        System.out.println("Using object with ID: " + id);
    }

    public void release() {
        System.out.println("Releasing object with ID: " + id);
    }

}

