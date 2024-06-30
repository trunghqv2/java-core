public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " hashCode: " + hashCode());
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }   
}