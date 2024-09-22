package Multithreading.Challenges.C2;

public class TestingThread1 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        System.out.println("Thread created");

        System.out.println("Thread starting");
        t1.start();

        Thread1.sleep(5000);

        t1.join();
        System.out.printf("Thread1 is %s",t1.getState());


    }
}
