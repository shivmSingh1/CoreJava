package Executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
       ExecutorService executor = Executors.newSingleThreadExecutor();
       PrintTask task1 = new PrintTask("$");
       PrintTask task2 = new PrintTask("*");

       executor.submit(task1);
       executor.submit(task2);

       executor.shutdown();
    }
}
