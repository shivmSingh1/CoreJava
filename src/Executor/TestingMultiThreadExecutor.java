package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadExecutor {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService executor = Executors.newFixedThreadPool(3);
        PrintTask task1 = new PrintTask("$");
        PrintTask task2 = new PrintTask("*");
        PrintTask task3 = new PrintTask("&");
        PrintTask task4 = new PrintTask("@");

        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.submit(task4);

        executor.shutdown();

       if(!executor.awaitTermination(10, TimeUnit.SECONDS)){
           executor.shutdownNow();
       }
    }
}
