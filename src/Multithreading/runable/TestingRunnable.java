package Multithreading.runable;

public class TestingRunnable {
    public static void main(String[] args) {
        TaskThreads<String> ct1 = new TaskThreads<>("$");
        TaskThreads<String> ct2 = new TaskThreads<>("*");
        TaskThreads<String> ct3 = new TaskThreads<>("#");

        Thread t1 = new Thread(ct1);
        Thread t2 = new Thread(ct2);
        Thread t3 = new Thread(ct3);

        t1.start();
        t2.start();
        t3.start();
    }
}
