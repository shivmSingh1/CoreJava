package Executor.challanges.C2;

public class Print implements Runnable {
    private final long randomNum=(long) Math.floor(Math.random()*10000);
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(randomNum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
