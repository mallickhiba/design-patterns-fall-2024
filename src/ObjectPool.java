import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ObjectPool {
    private final BlockingQueue<PooledObject> pool;
    private final int size;
    private int objectCount;

    public ObjectPool(int size) {
        pool = new ArrayBlockingQueue<>(size);
        this.size = size;
        this.objectCount = 0;
    }

    public synchronized PooledObject acquire() throws InterruptedException {
        if (pool.isEmpty() && objectCount < size) {
            System.out.println("Pool is empty, Creating new object with ID: " + (objectCount + 1));
            PooledObject newObj = new PooledObject(++objectCount); //assign new ids
            return newObj;
        }
        return pool.take();


    }

    public void release(PooledObject obj) {
        try {
            obj.release();
            pool.put(obj);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Failed to return object to the pool: " + e.getMessage());
        }
    }
}
