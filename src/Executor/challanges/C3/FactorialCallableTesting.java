package Executor.challanges.C3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialCallableTesting {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Factorial f1 = new Factorial(5);
        Factorial f2 = new Factorial(40);
        Factorial f3 = new Factorial(50);

        Future<Integer> fact1 = executor.submit(f1);
        Future<Integer> fact2 = executor.submit(f1);
        Future<Integer> fact3 = executor.submit(f1);

        System.out.println(fact1.get());
        System.out.println(fact2.get());
        System.out.println(fact3.get());

        executor.shutdown();
    }
}
