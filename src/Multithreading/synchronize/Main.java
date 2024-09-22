package Multithreading.synchronize;

public class Main {
    public static void main (String[] args) throws InterruptedException {
        Counter counter = new Counter();

        //create 2 thread that will increment
        Thread t1= new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                counter.increment();
            }
        });

        Thread t2= new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                counter.increment();
            }
        });

        //start both thread
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
