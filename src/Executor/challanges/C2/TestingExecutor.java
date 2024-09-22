package Executor.challanges.C2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Print task1= new Print();
        Print task2= new Print();
        Print task3= new Print();
        Print task4= new Print();

        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.submit(task4);

        executor.shutdown();

    }
}
