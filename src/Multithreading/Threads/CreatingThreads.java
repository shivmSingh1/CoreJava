package Multithreading.Threads;

public class CreatingThreads {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        t1.start();
        t2.start();
        t3.start();

    }
}
