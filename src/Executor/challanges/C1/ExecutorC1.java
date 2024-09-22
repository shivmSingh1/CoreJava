package Executor.challanges.C1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorC1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        PrintNumber pn = new PrintNumber();
        executor.submit(pn);
        executor.shutdown();
    }
}
