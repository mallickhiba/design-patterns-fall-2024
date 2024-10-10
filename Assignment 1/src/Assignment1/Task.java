public class Task implements Runnable {
        private final ObjectPool pool;

        public Task(ObjectPool pool) {
            this.pool = pool;
        }

        @Override
        public void run() {
            try {
                PooledObject obj = pool.acquire();
                obj.use();
                Thread.sleep((long) (Math.random() * 1000)); //
                pool.release(obj);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Task interrupted: " + e.getMessage());
            }
        }
}
