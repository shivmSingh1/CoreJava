package Multithreading;

public class ThreadByLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.print(i+"$");
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.print(i+"@");
            }
        });

        t1.start();
        t2.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.getPriority();
    }
}
