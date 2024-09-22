package Executor.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        FetchName task1 = new FetchName("Shivam");
        FetchName task2 = new FetchName("Utkarsh");
        FetchName task3 = new FetchName("Akash");

        Future<String> name = executor.submit(task1);
        Future<String> name2= executor.submit(task2);
        Future<String> name3= executor.submit(task3);

        System.out.println(name.get());
        System.out.println(name2.get());
        System.out.println(name3.get());

        executor.shutdown();

    }
}
